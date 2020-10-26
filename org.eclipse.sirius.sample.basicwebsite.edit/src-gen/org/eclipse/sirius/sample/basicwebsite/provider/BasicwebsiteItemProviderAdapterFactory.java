/**
 */
package org.eclipse.sirius.sample.basicwebsite.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.sirius.sample.basicwebsite.util.BasicwebsiteAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicwebsiteItemProviderAdapterFactory extends BasicwebsiteAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicwebsiteItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.WebSite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteItemProvider webSiteItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.WebSite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebSiteAdapter() {
		if (webSiteItemProvider == null) {
			webSiteItemProvider = new WebSiteItemProvider(this);
		}

		return webSiteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.Page} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageItemProvider pageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageAdapter() {
		if (pageItemProvider == null) {
			pageItemProvider = new PageItemProvider(this);
		}

		return pageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.Paragraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphItemProvider paragraphItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParagraphAdapter() {
		if (paragraphItemProvider == null) {
			paragraphItemProvider = new ParagraphItemProvider(this);
		}

		return paragraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.Section} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionItemProvider sectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionAdapter() {
		if (sectionItemProvider == null) {
			sectionItemProvider = new SectionItemProvider(this);
		}

		return sectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.PageButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageButtonItemProvider pageButtonItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.PageButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageButtonAdapter() {
		if (pageButtonItemProvider == null) {
			pageButtonItemProvider = new PageButtonItemProvider(this);
		}

		return pageButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.ParagraphButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphButtonItemProvider paragraphButtonItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.ParagraphButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParagraphButtonAdapter() {
		if (paragraphButtonItemProvider == null) {
			paragraphButtonItemProvider = new ParagraphButtonItemProvider(this);
		}

		return paragraphButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.PageLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageLinkItemProvider pageLinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.PageLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageLinkAdapter() {
		if (pageLinkItemProvider == null) {
			pageLinkItemProvider = new PageLinkItemProvider(this);
		}

		return pageLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.ParagraphLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphLinkItemProvider paragraphLinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.ParagraphLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParagraphLinkAdapter() {
		if (paragraphLinkItemProvider == null) {
			paragraphLinkItemProvider = new ParagraphLinkItemProvider(this);
		}

		return paragraphLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.sirius.sample.basicwebsite.ExternalLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalLinkItemProvider externalLinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.sirius.sample.basicwebsite.ExternalLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalLinkAdapter() {
		if (externalLinkItemProvider == null) {
			externalLinkItemProvider = new ExternalLinkItemProvider(this);
		}

		return externalLinkItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (webSiteItemProvider != null)
			webSiteItemProvider.dispose();
		if (pageItemProvider != null)
			pageItemProvider.dispose();
		if (paragraphItemProvider != null)
			paragraphItemProvider.dispose();
		if (imageItemProvider != null)
			imageItemProvider.dispose();
		if (sectionItemProvider != null)
			sectionItemProvider.dispose();
		if (pageButtonItemProvider != null)
			pageButtonItemProvider.dispose();
		if (paragraphButtonItemProvider != null)
			paragraphButtonItemProvider.dispose();
		if (pageLinkItemProvider != null)
			pageLinkItemProvider.dispose();
		if (paragraphLinkItemProvider != null)
			paragraphLinkItemProvider.dispose();
		if (externalLinkItemProvider != null)
			externalLinkItemProvider.dispose();
	}

}