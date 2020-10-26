/**
 */
package org.eclipse.sirius.sample.basicwebsite.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage;
import org.eclipse.sirius.sample.basicwebsite.Paragraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphImpl#getLinkaddress <em>Linkaddress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParagraphImpl extends PageContentImpl implements Paragraph {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkaddress() <em>Linkaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkaddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkaddress() <em>Linkaddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkaddress()
	 * @generated
	 * @ordered
	 */
	protected String linkaddress = LINKADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicwebsitePackage.Literals.PARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicwebsitePackage.PARAGRAPH__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkaddress() {
		return linkaddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkaddress(String newLinkaddress) {
		String oldLinkaddress = linkaddress;
		linkaddress = newLinkaddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicwebsitePackage.PARAGRAPH__LINKADDRESS,
					oldLinkaddress, linkaddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasicwebsitePackage.PARAGRAPH__TEXT:
			return getText();
		case BasicwebsitePackage.PARAGRAPH__LINKADDRESS:
			return getLinkaddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasicwebsitePackage.PARAGRAPH__TEXT:
			setText((String) newValue);
			return;
		case BasicwebsitePackage.PARAGRAPH__LINKADDRESS:
			setLinkaddress((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BasicwebsitePackage.PARAGRAPH__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case BasicwebsitePackage.PARAGRAPH__LINKADDRESS:
			setLinkaddress(LINKADDRESS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BasicwebsitePackage.PARAGRAPH__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case BasicwebsitePackage.PARAGRAPH__LINKADDRESS:
			return LINKADDRESS_EDEFAULT == null ? linkaddress != null : !LINKADDRESS_EDEFAULT.equals(linkaddress);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", linkaddress: ");
		result.append(linkaddress);
		result.append(')');
		return result.toString();
	}

} //ParagraphImpl
