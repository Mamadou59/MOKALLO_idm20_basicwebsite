/**
 */
package org.eclipse.sirius.sample.basicwebsite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.ParagraphButton#getParagraph <em>Paragraph</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getParagraphButton()
 * @model
 * @generated
 */
public interface ParagraphButton extends Button {
	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' reference.
	 * @see #setParagraph(Paragraph)
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getParagraphButton_Paragraph()
	 * @model
	 * @generated
	 */
	Paragraph getParagraph();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicwebsite.ParagraphButton#getParagraph <em>Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph</em>' reference.
	 * @see #getParagraph()
	 * @generated
	 */
	void setParagraph(Paragraph value);

} // ParagraphButton
