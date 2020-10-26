/**
 */
package org.eclipse.sirius.sample.basicwebsite.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage;
import org.eclipse.sirius.sample.basicwebsite.Paragraph;
import org.eclipse.sirius.sample.basicwebsite.ParagraphLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragraph Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphLinkImpl#getParagraph <em>Paragraph</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParagraphLinkImpl extends LinkImpl implements ParagraphLink {
	/**
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected Paragraph paragraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicwebsitePackage.Literals.PARAGRAPH_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getParagraph() {
		if (paragraph != null && paragraph.eIsProxy()) {
			InternalEObject oldParagraph = (InternalEObject) paragraph;
			paragraph = (Paragraph) eResolveProxy(oldParagraph);
			if (paragraph != oldParagraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BasicwebsitePackage.PARAGRAPH_LINK__PARAGRAPH, oldParagraph, paragraph));
			}
		}
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph basicGetParagraph() {
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraph(Paragraph newParagraph) {
		Paragraph oldParagraph = paragraph;
		paragraph = newParagraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicwebsitePackage.PARAGRAPH_LINK__PARAGRAPH,
					oldParagraph, paragraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasicwebsitePackage.PARAGRAPH_LINK__PARAGRAPH:
			if (resolve)
				return getParagraph();
			return basicGetParagraph();
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
		case BasicwebsitePackage.PARAGRAPH_LINK__PARAGRAPH:
			setParagraph((Paragraph) newValue);
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
		case BasicwebsitePackage.PARAGRAPH_LINK__PARAGRAPH:
			setParagraph((Paragraph) null);
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
		case BasicwebsitePackage.PARAGRAPH_LINK__PARAGRAPH:
			return paragraph != null;
		}
		return super.eIsSet(featureID);
	}

} //ParagraphLinkImpl
