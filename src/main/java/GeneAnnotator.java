import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.tutorial.RoomNumber;

import java.util.Iterator;

/**
 * Gene annotator that detects gene names using LingPipe.
 */
public class GeneAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		String docText = aJCas.getDocumentText();
		
		//FSIndex geneTaggingIndex = aJCas.getAnnotationIndex(geneTagging.type);
		
		//Get lines from the input document
		String[] lines=docText.split("\n");
		for(int i=0;i<lines.length;i++){
			//lines[i] contains one line.
			//We need to strip off the sentence ID
			String sentenceID; int l=0;
			String sentence; int m=0;
			for(int j=0;j<lines[i].length();j++){
				while(lines[i][j]!=" ")
					sentenceID[l++]=lines[i][j];
				while(j<lines[i].length())
					sentence[m++]=lines[i][j];
			}
		}
		/*File modelFile = new File(docText);

	    System.out.println("Reading chunker from file=" + modelFile);
	    Chunker chunker
	        = (Chunker) AbstractExternalizable.readObject(modelFile);*/

	   
	}

}
