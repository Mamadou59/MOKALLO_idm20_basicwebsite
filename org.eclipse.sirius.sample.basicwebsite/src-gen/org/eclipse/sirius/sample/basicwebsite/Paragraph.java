/**
 */
package org.eclipse.sirius.sample.basicwebsite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Paragraph#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Paragraph#getLinkaddress <em>Linkaddress</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends PageContent {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getParagraph_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicwebsite.Paragraph#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Linkaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkaddress</em>' attribute.
	 * @see #setLinkaddress(String)
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getParagraph_Linkaddress()
	 * @model
	 * @generated
	 */
	String getLinkaddress();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicwebsite.Paragraph#getLinkaddress <em>Linkaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkaddress</em>' attribute.
	 * @see #getLinkaddress()
	 * @generated
	 */
	void setLinkaddress(String value);

} // Paragraph
