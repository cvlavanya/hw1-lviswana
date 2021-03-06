
/* First created by JCasGen Fri Oct 12 17:44:00 EDT 2012 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 16 15:20:57 EDT 2012
 * @generated */
public class geneTagging_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (geneTagging_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = geneTagging_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new geneTagging(addr, geneTagging_Type.this);
  			   geneTagging_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new geneTagging(addr, geneTagging_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = geneTagging.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("geneTagging");
 
  /** @generated */
  final Feature casFeat_sentenceID;
  /** @generated */
  final int     casFeatCode_sentenceID;
  /** @generated */ 
  public String getSentenceID(int addr) {
        if (featOkTst && casFeat_sentenceID == null)
      jcas.throwFeatMissing("sentenceID", "geneTagging");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentenceID);
  }
  /** @generated */    
  public void setSentenceID(int addr, String v) {
        if (featOkTst && casFeat_sentenceID == null)
      jcas.throwFeatMissing("sentenceID", "geneTagging");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentenceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentenceText;
  /** @generated */
  final int     casFeatCode_sentenceText;
  /** @generated */ 
  public String getSentenceText(int addr) {
        if (featOkTst && casFeat_sentenceText == null)
      jcas.throwFeatMissing("sentenceText", "geneTagging");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentenceText);
  }
  /** @generated */    
  public void setSentenceText(int addr, String v) {
        if (featOkTst && casFeat_sentenceText == null)
      jcas.throwFeatMissing("sentenceText", "geneTagging");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentenceText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_geneTag;
  /** @generated */
  final int     casFeatCode_geneTag;
  /** @generated */ 
  public String getGeneTag(int addr) {
        if (featOkTst && casFeat_geneTag == null)
      jcas.throwFeatMissing("geneTag", "geneTagging");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geneTag);
  }
  /** @generated */    
  public void setGeneTag(int addr, String v) {
        if (featOkTst && casFeat_geneTag == null)
      jcas.throwFeatMissing("geneTag", "geneTagging");
    ll_cas.ll_setStringValue(addr, casFeatCode_geneTag, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public geneTagging_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentenceID = jcas.getRequiredFeatureDE(casType, "sentenceID", "uima.cas.String", featOkTst);
    casFeatCode_sentenceID  = (null == casFeat_sentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceID).getCode();

 
    casFeat_sentenceText = jcas.getRequiredFeatureDE(casType, "sentenceText", "uima.cas.String", featOkTst);
    casFeatCode_sentenceText  = (null == casFeat_sentenceText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceText).getCode();

 
    casFeat_geneTag = jcas.getRequiredFeatureDE(casType, "geneTag", "uima.cas.String", featOkTst);
    casFeatCode_geneTag  = (null == casFeat_geneTag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geneTag).getCode();

  }
}



    