

/* First created by JCasGen Mon Oct 15 07:26:05 EDT 2012 */
package typeSystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Oct 15 07:26:05 EDT 2012
 * XML source: /Users/cvl/Work/workspace/hw1-lviswana/src/main/resources/geneAnnotator.xml
 * @generated */
public class xml extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(xml.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected xml() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public xml(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public xml(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public xml(JCas jcas, int begin, int end) {
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
     
}

    