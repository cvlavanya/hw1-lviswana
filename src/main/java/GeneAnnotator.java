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
					
					// Subtract the number of spaces before lower bound
					
					//From lb to ub-1, count the number of non whitespace characters, that is the end now
					
					//For each chunk, do
					geneTagging annot = new geneTagging(aJCas);
					annot.setSentenceID(termsInSentence[0]);
					annot.setGeneTag(Annotation(chunking));
					
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


