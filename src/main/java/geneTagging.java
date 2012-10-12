

/* First created by JCasGen Fri Oct 12 17:44:00 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Oct 12 17:44:10 EDT 2012
 * XML source: /Users/cvl/Work/workspace/hw1-lviswana/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class geneTagging extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(geneTagging.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected geneTagging() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public geneTagging(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public geneTagging(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public geneTagging(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: sentenceID

  /** getter for sentenceID - gets Stores the sentence ID of each sentence.
   * @generated */
  public String getSentenceID() {
    if (geneTagging_Type.featOkTst && ((geneTagging_Type)jcasType).casFeat_sentenceID == null)
      jcasType.jcas.throwFeatMissing("sentenceID", "geneTagging");
    return jcasType.ll_cas.ll_getStringValue(addr, ((geneTagging_Type)jcasType).casFeatCode_sentenceID);}
    
  /** setter for sentenceID - sets Stores the sentence ID of each sentence. 
   * @generated */
  public void setSentenceID(String v) {
    if (geneTagging_Type.featOkTst && ((geneTagging_Type)jcasType).casFeat_sentenceID == null)
      jcasType.jcas.throwFeatMissing("sentenceID", "geneTagging");
    jcasType.ll_cas.ll_setStringValue(addr, ((geneTagging_Type)jcasType).casFeatCode_sentenceID, v);}    
   
    
  //*--------------*
  //* Feature: sentenceText

  /** getter for sentenceText - gets Contains the tect of each of the sentences.


   * @generated */
  public String getSentenceText() {
    if (geneTagging_Type.featOkTst && ((geneTagging_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "geneTagging");
    return jcasType.ll_cas.ll_getStringValue(addr, ((geneTagging_Type)jcasType).casFeatCode_sentenceText);}
    
  /** setter for sentenceText - sets Contains the tect of each of the sentences.

 
   * @generated */
  public void setSentenceText(String v) {
    if (geneTagging_Type.featOkTst && ((geneTagging_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "geneTagging");
    jcasType.ll_cas.ll_setStringValue(addr, ((geneTagging_Type)jcasType).casFeatCode_sentenceText, v);}    
   
    
  //*--------------*
  //* Feature: geneTag

  /** getter for geneTag - gets 
   * @generated */
  public AnnotationBase getGeneTag() {
    if (geneTagging_Type.featOkTst && ((geneTagging_Type)jcasType).casFeat_geneTag == null)
      jcasType.jcas.throwFeatMissing("geneTag", "geneTagging");
    return (AnnotationBase)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((geneTagging_Type)jcasType).casFeatCode_geneTag)));}
    
  /** setter for geneTag - sets  
   * @generated */
  public void setGeneTag(AnnotationBase v) {
    if (geneTagging_Type.featOkTst && ((geneTagging_Type)jcasType).casFeat_geneTag == null)
      jcasType.jcas.throwFeatMissing("geneTag", "geneTagging");
    jcasType.ll_cas.ll_setRefValue(addr, ((geneTagging_Type)jcasType).casFeatCode_geneTag, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    