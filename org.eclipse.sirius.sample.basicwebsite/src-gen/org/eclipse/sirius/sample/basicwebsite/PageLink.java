/**
 */
package org.eclipse.sirius.sample.basicwebsite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.PageLink#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getPageLink()
 * @model
 * @generated
 */
public interface PageLink extends Link {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(Page)
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getPageLink_Page()
	 * @model
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicwebsite.PageLink#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

} // PageLink
