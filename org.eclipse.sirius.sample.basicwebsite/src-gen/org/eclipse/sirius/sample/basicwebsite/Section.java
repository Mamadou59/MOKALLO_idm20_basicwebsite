/**
 */
package org.eclipse.sirius.sample.basicwebsite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Section#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Section#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Section#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Section#getSubSections <em>Sub Sections</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Section#getImages <em>Images</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.Section#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends PageContent {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicwebsite.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' reference list.
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getSection_Paragraphs()
	 * @model
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicwebsite.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' reference list.
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getSection_Buttons()
	 * @model
	 * @generated
	 */
	EList<Button> getButtons();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicwebsite.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getSection_Links()
	 * @model
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Sub Sections</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicwebsite.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Sections</em>' reference list.
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getSection_SubSections()
	 * @model
	 * @generated
	 */
	EList<Section> getSubSections();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicwebsite.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' reference list.
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getSection_Images()
	 * @model
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getSection_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicwebsite.Section#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Section
