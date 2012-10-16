import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.tutorial.RoomNumber;
import org.apache.uima.tutorial.UimaAcronym;

import java.util.Iterator;
import java.util.Set;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;

import com.aliasi.util.AbstractExternalizable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.File;


/**
 * Gene annotator that detects gene names using LingPipe.
 */
public class GeneAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		String docText = aJCas.getDocumentText();
		
		//FSIndex geneTaggingIndex = aJCas.getAnnotationIndex(geneTagging.type);
		
		//Model File for LingPipe
		try
		{
			File modelFile = new File("/Users/cvl/Work/workspace/hw1-lviswana/src/main/resources/bio-genetag.HmmChunker");
			Chunker chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
			//Get lines from the input document to feed to LingPipe
			String[] lines=docText.split("\n");
			for(int i=0;i<lines.length;i++){
				String trimmedLine = lines[i].trim(); // Remove leading and trailing spaces
				String termsInSentence[] = trimmedLine.split("\\s+"); // Regex for one or more spaces
				
				StringBuffer allButSentenceId  = new StringBuffer(); // StringBuffer is like string
				for(int j=1;j<termsInSentence.length;j++){
					allButSentenceId.append(termsInSentence[j]).append(" ");// Attach words followed by single space
				}
				String resultSentence = allButSentenceId.toString(); // Convert stringbuffer back to string
				//System.out.println(resultSentence);
				
				//Annotate each line using LingPipe
				
				Chunking chunking = chunker.chunk(resultSentence);
				Set<Chunk> chunkSet = chunking.chunkSet();
				Iterator<Chunk> it = chunkSet.iterator();
				while (it.hasNext()) {
					com.aliasi.chunk.Chunk chunk = (com.aliasi.chunk.Chunk) it.next();
					
					//Extract lower and upper bounds
					int[] limits = new int[2]; // lower limit, upper limit
					String inputTrimmed = chunk.toString().trim(); // Remove surrounding spaces.
					String regexForLimits = "\\d+\\s*-\\s*\\d+";
					Pattern p = Pattern.compile(regexForLimits);
					Matcher m = p.matcher(inputTrimmed);
					int count = 0;
					while (m.find()) {
						String limitSubstr = inputTrimmed.substring(m.start(), m.end());
						String fields[] = limitSubstr.split("-");
						limits[0] = Integer.parseInt(fields[0]);
						limits[1] = Integer.parseInt(fields[1]);
						if (count > 0) {
							System.err.println("More than one match found. Not expected");
						}
						count += 1;
					}
					/*limits[0] has the lower bound and limits[1] has the upper bound.
					 * But this includes spaces. Subtract that.
					 * */
					
					// Subtract the number of spaces before lower bound
					count=0;
					int k;
					for(k=0;k<limits[0];k++)
						if(resultSentence.charAt(k)==' ')
							count++;
					int lowerBound=limits[0]-count;
					//From limits[0] to limits[1], count the number of non whitespace characters, that is the end now
					count=0;
					for(k=limits[0];k<limits[1];k++)
						if(resultSentence.charAt(k)==' ')
							count++;
					int upperBound=limits[1]-count;
					
					String geneTagString=resultSentence[limits[0]];
					int l;
					for(l=0,k=limits[0]+1;k<limits[1];k++,l++)
						geneTagString[l]+=resultSentence.charAt(k);
					
					//For each chunk, do
					geneTagging annot = new geneTagging(aJCas);
					annot.setSentenceID(termsInSentence[0]);
					annot.setBegin(lowerBound);
					annot.setEnd(upperBound);
					annot.setGeneTag(geneTagString);
					
			        annot.addToIndexes();
					
				}
				
				
				
					
			}

		}
		catch(Exception e)
		{
			System.err.println("File not found!");
		}
		
		
			
			
		}
		

	   
}


