import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

/**
 * Gene annotator that detects gene names using LingPipe.
 */
public class geneAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		String docText = aJCas.getDocumentText();
		/*File modelFile = new File(docText);

	    System.out.println("Reading chunker from file=" + modelFile);
	    Chunker chunker
	        = (Chunker) AbstractExternalizable.readObject(modelFile);*/

	   
	}

}
