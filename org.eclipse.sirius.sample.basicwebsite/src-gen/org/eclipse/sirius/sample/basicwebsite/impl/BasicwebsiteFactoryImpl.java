/**
 */
package org.eclipse.sirius.sample.basicwebsite.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sirius.sample.basicwebsite.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicwebsiteFactoryImpl extends EFactoryImpl implements BasicwebsiteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicwebsiteFactory init() {
		try {
			BasicwebsiteFactory theBasicwebsiteFactory = (BasicwebsiteFactory) EPackage.Registry.INSTANCE
					.getEFactory(BasicwebsitePackage.eNS_URI);
			if (theBasicwebsiteFactory != null) {
				return theBasicwebsiteFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicwebsiteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicwebsiteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BasicwebsitePackage.WEB_SITE:
			return createWebSite();
		case BasicwebsitePackage.PAGE:
			return createPage();
		case BasicwebsitePackage.PARAGRAPH:
			return createParagraph();
		case BasicwebsitePackage.IMAGE:
			return createImage();
		case BasicwebsitePackage.SECTION:
			return createSection();
		case BasicwebsitePackage.PAGE_BUTTON:
			return createPageButton();
		case BasicwebsitePackage.PARAGRAPH_BUTTON:
			return createParagraphButton();
		case BasicwebsitePackage.PAGE_LINK:
			return createPageLink();
		case BasicwebsitePackage.PARAGRAPH_LINK:
			return createParagraphLink();
		case BasicwebsitePackage.EXTERNAL_LINK:
			return createExternalLink();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebSite createWebSite() {
		WebSiteImpl webSite = new WebSiteImpl();
		return webSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageButton createPageButton() {
		PageButtonImpl pageButton = new PageButtonImpl();
		return pageButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphButton createParagraphButton() {
		ParagraphButtonImpl paragraphButton = new ParagraphButtonImpl();
		return paragraphButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageLink createPageLink() {
		PageLinkImpl pageLink = new PageLinkImpl();
		return pageLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphLink createParagraphLink() {
		ParagraphLinkImpl paragraphLink = new ParagraphLinkImpl();
		return paragraphLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalLink createExternalLink() {
		ExternalLinkImpl externalLink = new ExternalLinkImpl();
		return externalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicwebsitePackage getBasicwebsitePackage() {
		return (BasicwebsitePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicwebsitePackage getPackage() {
		return BasicwebsitePackage.eINSTANCE;
	}

} //BasicwebsiteFactoryImpl
