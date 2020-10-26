/**
 */
package org.eclipse.sirius.sample.basicwebsite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage
 * @generated
 */
public interface BasicwebsiteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicwebsiteFactory eINSTANCE = org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsiteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site</em>'.
	 * @generated
	 */
	WebSite createWebSite();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Page Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Button</em>'.
	 * @generated
	 */
	PageButton createPageButton();

	/**
	 * Returns a new object of class '<em>Paragraph Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph Button</em>'.
	 * @generated
	 */
	ParagraphButton createParagraphButton();

	/**
	 * Returns a new object of class '<em>Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Link</em>'.
	 * @generated
	 */
	PageLink createPageLink();

	/**
	 * Returns a new object of class '<em>Paragraph Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph Link</em>'.
	 * @generated
	 */
	ParagraphLink createParagraphLink();

	/**
	 * Returns a new object of class '<em>External Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Link</em>'.
	 * @generated
	 */
	ExternalLink createExternalLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicwebsitePackage getBasicwebsitePackage();

} //BasicwebsiteFactory
