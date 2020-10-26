/**
 */
package org.eclipse.sirius.sample.basicwebsite.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage;
import org.eclipse.sirius.sample.basicwebsite.Button;
import org.eclipse.sirius.sample.basicwebsite.Image;
import org.eclipse.sirius.sample.basicwebsite.Link;
import org.eclipse.sirius.sample.basicwebsite.Paragraph;
import org.eclipse.sirius.sample.basicwebsite.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl#getImages <em>Images</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends PageContentImpl implements Section {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> paragraphs;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * The cached value of the '{@link #getButtons() <em>Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> buttons;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicwebsitePackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getButtons() {
		if (buttons == null) {
			buttons = new EObjectContainmentEList<Button>(Button.class, this, BasicwebsitePackage.SECTION__BUTTONS);
		}
		return buttons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, BasicwebsitePackage.SECTION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, BasicwebsitePackage.SECTION__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Image>(Image.class, this, BasicwebsitePackage.SECTION__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicwebsitePackage.SECTION__PARAGRAPHS:
			return ((InternalEList<?>) getParagraphs()).basicRemove(otherEnd, msgs);
		case BasicwebsitePackage.SECTION__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case BasicwebsitePackage.SECTION__SECTIONS:
			return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
		case BasicwebsitePackage.SECTION__BUTTONS:
			return ((InternalEList<?>) getButtons()).basicRemove(otherEnd, msgs);
		case BasicwebsitePackage.SECTION__IMAGES:
			return ((InternalEList<?>) getImages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicwebsitePackage.SECTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentEList<Paragraph>(Paragraph.class, this,
					BasicwebsitePackage.SECTION__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasicwebsitePackage.SECTION__TITLE:
			return getTitle();
		case BasicwebsitePackage.SECTION__PARAGRAPHS:
			return getParagraphs();
		case BasicwebsitePackage.SECTION__LINKS:
			return getLinks();
		case BasicwebsitePackage.SECTION__SECTIONS:
			return getSections();
		case BasicwebsitePackage.SECTION__BUTTONS:
			return getButtons();
		case BasicwebsitePackage.SECTION__IMAGES:
			return getImages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasicwebsitePackage.SECTION__TITLE:
			setTitle((String) newValue);
			return;
		case BasicwebsitePackage.SECTION__PARAGRAPHS:
			getParagraphs().clear();
			getParagraphs().addAll((Collection<? extends Paragraph>) newValue);
			return;
		case BasicwebsitePackage.SECTION__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case BasicwebsitePackage.SECTION__SECTIONS:
			getSections().clear();
			getSections().addAll((Collection<? extends Section>) newValue);
			return;
		case BasicwebsitePackage.SECTION__BUTTONS:
			getButtons().clear();
			getButtons().addAll((Collection<? extends Button>) newValue);
			return;
		case BasicwebsitePackage.SECTION__IMAGES:
			getImages().clear();
			getImages().addAll((Collection<? extends Image>) newValue);
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
		case BasicwebsitePackage.SECTION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case BasicwebsitePackage.SECTION__PARAGRAPHS:
			getParagraphs().clear();
			return;
		case BasicwebsitePackage.SECTION__LINKS:
			getLinks().clear();
			return;
		case BasicwebsitePackage.SECTION__SECTIONS:
			getSections().clear();
			return;
		case BasicwebsitePackage.SECTION__BUTTONS:
			getButtons().clear();
			return;
		case BasicwebsitePackage.SECTION__IMAGES:
			getImages().clear();
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
		case BasicwebsitePackage.SECTION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case BasicwebsitePackage.SECTION__PARAGRAPHS:
			return paragraphs != null && !paragraphs.isEmpty();
		case BasicwebsitePackage.SECTION__LINKS:
			return links != null && !links.isEmpty();
		case BasicwebsitePackage.SECTION__SECTIONS:
			return sections != null && !sections.isEmpty();
		case BasicwebsitePackage.SECTION__BUTTONS:
			return buttons != null && !buttons.isEmpty();
		case BasicwebsitePackage.SECTION__IMAGES:
			return images != null && !images.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
