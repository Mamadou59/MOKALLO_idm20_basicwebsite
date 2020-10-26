/**
 */
package org.eclipse.sirius.sample.basicwebsite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.WebSite#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.WebSite#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getWebSite()
 * @model
 * @generated
 */
public interface WebSite extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getWebSite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.sample.basicwebsite.WebSite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicwebsite.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getWebSite_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

} // WebSite
