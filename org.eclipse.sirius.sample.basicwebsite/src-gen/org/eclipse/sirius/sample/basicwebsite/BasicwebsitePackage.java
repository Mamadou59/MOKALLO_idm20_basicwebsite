/**
 */
package org.eclipse.sirius.sample.basicwebsite;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsiteFactory
 * @model kind="package"
 * @generated
 */
public interface BasicwebsitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basicwebsite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/basicwebsite";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basicwebsite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicwebsitePackage eINSTANCE = org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.WebSiteImpl <em>Web Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.WebSiteImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getWebSite()
	 * @generated
	 */
	int WEB_SITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__PAGES = 1;

	/**
	 * The number of structural features of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.PageImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGECONTENTS = 1;

	/**
	 * The feature id for the '<em><b>Linkaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LINKADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.PageContentImpl <em>Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.PageContentImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getPageContent()
	 * @generated
	 */
	int PAGE_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.ParagraphImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NAME = PAGE_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linkaddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__LINKADDRESS = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.ImageImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = PAGE_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SRC = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = PAGE_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PARAGRAPHS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BUTTONS = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LINKS = PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUB_SECTIONS = PAGE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__IMAGES = PAGE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = PAGE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.ButtonImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = PAGE_CONTENT__NAME;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.LinkImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = PAGE_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ADDRESS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.PageButtonImpl <em>Page Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.PageButtonImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getPageButton()
	 * @generated
	 */
	int PAGE_BUTTON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_BUTTON__PAGE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Page Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphButtonImpl <em>Paragraph Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.ParagraphButtonImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getParagraphButton()
	 * @generated
	 */
	int PARAGRAPH_BUTTON = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_BUTTON__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_BUTTON__PARAGRAPH = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.PageLinkImpl <em>Page Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.PageLinkImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getPageLink()
	 * @generated
	 */
	int PAGE_LINK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK__ADDRESS = LINK__ADDRESS;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK__PAGE = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Page Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphLinkImpl <em>Paragraph Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.ParagraphLinkImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getParagraphLink()
	 * @generated
	 */
	int PARAGRAPH_LINK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_LINK__ADDRESS = LINK__ADDRESS;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_LINK__PARAGRAPH = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ExternalLinkImpl <em>External Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.ExternalLinkImpl
	 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getExternalLink()
	 * @generated
	 */
	int EXTERNAL_LINK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK__ADDRESS = LINK__ADDRESS;

	/**
	 * The number of structural features of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.WebSite
	 * @generated
	 */
	EClass getWebSite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.WebSite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.WebSite#getName()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.basicwebsite.WebSite#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.WebSite#getPages()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_Pages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.sample.basicwebsite.Page#getPagecontents <em>Pagecontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagecontents</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Page#getPagecontents()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pagecontents();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.Page#getLinkaddress <em>Linkaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linkaddress</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Page#getLinkaddress()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Linkaddress();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.Paragraph#getLinkaddress <em>Linkaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linkaddress</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Paragraph#getLinkaddress()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Linkaddress();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.Image#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Image#getSrc()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.Image#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Image#getAlt()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Alt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.basicwebsite.Section#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paragraphs</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Section#getParagraphs()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Paragraphs();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.basicwebsite.Section#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buttons</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Section#getButtons()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Buttons();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.basicwebsite.Section#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Section#getLinks()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Links();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.basicwebsite.Section#getSubSections <em>Sub Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Sections</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Section#getSubSections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_SubSections();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.sample.basicwebsite.Section#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Images</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Section#getImages()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Images();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.Link#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.Link#getAddress()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Address();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Content</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.PageContent
	 * @generated
	 */
	EClass getPageContent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.sample.basicwebsite.PageContent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.PageContent#getName()
	 * @see #getPageContent()
	 * @generated
	 */
	EAttribute getPageContent_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.PageButton <em>Page Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Button</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.PageButton
	 * @generated
	 */
	EClass getPageButton();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.basicwebsite.PageButton#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.PageButton#getPage()
	 * @see #getPageButton()
	 * @generated
	 */
	EReference getPageButton_Page();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.ParagraphButton <em>Paragraph Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph Button</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.ParagraphButton
	 * @generated
	 */
	EClass getParagraphButton();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.basicwebsite.ParagraphButton#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragraph</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.ParagraphButton#getParagraph()
	 * @see #getParagraphButton()
	 * @generated
	 */
	EReference getParagraphButton_Paragraph();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.PageLink <em>Page Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Link</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.PageLink
	 * @generated
	 */
	EClass getPageLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.basicwebsite.PageLink#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.PageLink#getPage()
	 * @see #getPageLink()
	 * @generated
	 */
	EReference getPageLink_Page();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.ParagraphLink <em>Paragraph Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph Link</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.ParagraphLink
	 * @generated
	 */
	EClass getParagraphLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.sample.basicwebsite.ParagraphLink#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragraph</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.ParagraphLink#getParagraph()
	 * @see #getParagraphLink()
	 * @generated
	 */
	EReference getParagraphLink_Paragraph();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.sample.basicwebsite.ExternalLink <em>External Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Link</em>'.
	 * @see org.eclipse.sirius.sample.basicwebsite.ExternalLink
	 * @generated
	 */
	EClass getExternalLink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicwebsiteFactory getBasicwebsiteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.WebSiteImpl <em>Web Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.WebSiteImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getWebSite()
		 * @generated
		 */
		EClass WEB_SITE = eINSTANCE.getWebSite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__NAME = eINSTANCE.getWebSite_Name();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__PAGES = eINSTANCE.getWebSite_Pages();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.PageImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Pagecontents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGECONTENTS = eINSTANCE.getPage_Pagecontents();

		/**
		 * The meta object literal for the '<em><b>Linkaddress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__LINKADDRESS = eINSTANCE.getPage_Linkaddress();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.ParagraphImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

		/**
		 * The meta object literal for the '<em><b>Linkaddress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__LINKADDRESS = eINSTANCE.getParagraph_Linkaddress();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.ImageImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SRC = eINSTANCE.getImage_Src();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALT = eINSTANCE.getImage_Alt();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.SectionImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PARAGRAPHS = eINSTANCE.getSection_Paragraphs();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__BUTTONS = eINSTANCE.getSection_Buttons();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__LINKS = eINSTANCE.getSection_Links();

		/**
		 * The meta object literal for the '<em><b>Sub Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SUB_SECTIONS = eINSTANCE.getSection_SubSections();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__IMAGES = eINSTANCE.getSection_Images();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.ButtonImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.LinkImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ADDRESS = eINSTANCE.getLink_Address();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.PageContentImpl <em>Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.PageContentImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getPageContent()
		 * @generated
		 */
		EClass PAGE_CONTENT = eINSTANCE.getPageContent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_CONTENT__NAME = eINSTANCE.getPageContent_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.PageButtonImpl <em>Page Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.PageButtonImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getPageButton()
		 * @generated
		 */
		EClass PAGE_BUTTON = eINSTANCE.getPageButton();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_BUTTON__PAGE = eINSTANCE.getPageButton_Page();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphButtonImpl <em>Paragraph Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.ParagraphButtonImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getParagraphButton()
		 * @generated
		 */
		EClass PARAGRAPH_BUTTON = eINSTANCE.getParagraphButton();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH_BUTTON__PARAGRAPH = eINSTANCE.getParagraphButton_Paragraph();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.PageLinkImpl <em>Page Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.PageLinkImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getPageLink()
		 * @generated
		 */
		EClass PAGE_LINK = eINSTANCE.getPageLink();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_LINK__PAGE = eINSTANCE.getPageLink_Page();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ParagraphLinkImpl <em>Paragraph Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.ParagraphLinkImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getParagraphLink()
		 * @generated
		 */
		EClass PARAGRAPH_LINK = eINSTANCE.getParagraphLink();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH_LINK__PARAGRAPH = eINSTANCE.getParagraphLink_Paragraph();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.sample.basicwebsite.impl.ExternalLinkImpl <em>External Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.ExternalLinkImpl
		 * @see org.eclipse.sirius.sample.basicwebsite.impl.BasicwebsitePackageImpl#getExternalLink()
		 * @generated
		 */
		EClass EXTERNAL_LINK = eINSTANCE.getExternalLink();

	}

} //BasicwebsitePackage
