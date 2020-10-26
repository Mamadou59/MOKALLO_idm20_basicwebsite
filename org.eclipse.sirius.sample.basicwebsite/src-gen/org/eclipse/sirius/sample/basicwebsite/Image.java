/**
 */
package org.eclipse.sirius.sample.basicwebsite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Image#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Image#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getImage()
 * @model
 * @generated
 */
public interface Image extends PageContent {

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getImage_Src()
	 * @model
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicwebsite.Image#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getImage_Alt()
	 * @model
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicwebsite.Image#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);
} // Image
