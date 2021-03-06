/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad.provider;

import java.util.ArrayList;
import java.util.Collection;

import mil.jpeojtrs.sca.sad.util.SadAdapterFactory;

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
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SadItemProviderAdapterFactory extends SadAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {

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
	public SadItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.AssemblyController} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyControllerItemProvider assemblyControllerItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.AssemblyController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssemblyControllerAdapter() {
		if (assemblyControllerItemProvider == null) {
			assemblyControllerItemProvider = new AssemblyControllerItemProvider(this);
		}

		return assemblyControllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadComponentInstantiation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadComponentInstantiationItemProvider sadComponentInstantiationItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadComponentInstantiation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadComponentInstantiationAdapter() {
		if (sadComponentInstantiationItemProvider == null) {
			sadComponentInstantiationItemProvider = new SadComponentInstantiationItemProvider(this);
		}

		return sadComponentInstantiationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadComponentInstantiationRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadComponentInstantiationRefItemProvider sadComponentInstantiationRefItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadComponentInstantiationRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadComponentInstantiationRefAdapter() {
		if (sadComponentInstantiationRefItemProvider == null) {
			sadComponentInstantiationRefItemProvider = new SadComponentInstantiationRefItemProvider(this);
		}

		return sadComponentInstantiationRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadUsesPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadUsesPortItemProvider sadUsesPortItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadUsesPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadUsesPortAdapter() {
		if (sadUsesPortItemProvider == null) {
			sadUsesPortItemProvider = new SadUsesPortItemProvider(this);
		}

		return sadUsesPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadProvidesPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadProvidesPortItemProvider sadProvidesPortItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadProvidesPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadProvidesPortAdapter() {
		if (sadProvidesPortItemProvider == null) {
			sadProvidesPortItemProvider = new SadProvidesPortItemProvider(this);
		}

		return sadProvidesPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadConnectInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadConnectInterfaceItemProvider sadConnectInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadConnectInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadConnectInterfaceAdapter() {
		if (sadConnectInterfaceItemProvider == null) {
			sadConnectInterfaceItemProvider = new SadConnectInterfaceItemProvider(this);
		}

		return sadConnectInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadConnections} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadConnectionsItemProvider sadConnectionsItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadConnections}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadConnectionsAdapter() {
		if (sadConnectionsItemProvider == null) {
			sadConnectionsItemProvider = new SadConnectionsItemProvider(this);
		}

		return sadConnectionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentResourceFactoryRefItemProvider componentResourceFactoryRefItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentResourceFactoryRefAdapter() {
		if (componentResourceFactoryRefItemProvider == null) {
			componentResourceFactoryRefItemProvider = new ComponentResourceFactoryRefItemProvider(this);
		}

		return componentResourceFactoryRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.ExternalPorts} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalPortsItemProvider externalPortsItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.ExternalPorts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalPortsAdapter() {
		if (externalPortsItemProvider == null) {
			externalPortsItemProvider = new ExternalPortsItemProvider(this);
		}

		return externalPortsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.ExternalProperties} instances.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalPropertiesItemProvider externalPropertiesItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.ExternalProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalPropertiesAdapter() {
		if (externalPropertiesItemProvider == null) {
			externalPropertiesItemProvider = new ExternalPropertiesItemProvider(this);
		}

		return externalPropertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.ExternalProperty} instances.
	 * <!-- begin-user-doc -->
	 * @since 2.3
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalPropertyItemProvider externalPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.ExternalProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalPropertyAdapter() {
		if (externalPropertyItemProvider == null) {
			externalPropertyItemProvider = new ExternalPropertyItemProvider(this);
		}

		return externalPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.FindComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindComponentItemProvider findComponentItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.FindComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFindComponentAdapter() {
		if (findComponentItemProvider == null) {
			findComponentItemProvider = new FindComponentItemProvider(this);
		}

		return findComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.HostCollocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostCollocationItemProvider hostCollocationItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.HostCollocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHostCollocationAdapter() {
		if (hostCollocationItemProvider == null) {
			hostCollocationItemProvider = new HostCollocationItemProvider(this);
		}

		return hostCollocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadPartitioning} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadPartitioningItemProvider sadPartitioningItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadPartitioning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadPartitioningAdapter() {
		if (sadPartitioningItemProvider == null) {
			sadPartitioningItemProvider = new SadPartitioningItemProvider(this);
		}

		return sadPartitioningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadComponentPlacement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadComponentPlacementItemProvider sadComponentPlacementItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadComponentPlacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadComponentPlacementAdapter() {
		if (sadComponentPlacementItemProvider == null) {
			sadComponentPlacementItemProvider = new SadComponentPlacementItemProvider(this);
		}

		return sadComponentPlacementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceFactoryPropertiesItemProvider resourceFactoryPropertiesItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceFactoryPropertiesAdapter() {
		if (resourceFactoryPropertiesItemProvider == null) {
			resourceFactoryPropertiesItemProvider = new ResourceFactoryPropertiesItemProvider(this);
		}

		return resourceFactoryPropertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SadDocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadDocumentRootItemProvider sadDocumentRootItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SadDocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSadDocumentRootAdapter() {
		if (sadDocumentRootItemProvider == null) {
			sadDocumentRootItemProvider = new SadDocumentRootItemProvider(this);
		}

		return sadDocumentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.SoftwareAssembly} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareAssemblyItemProvider softwareAssemblyItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.SoftwareAssembly}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareAssemblyAdapter() {
		if (softwareAssemblyItemProvider == null) {
			softwareAssemblyItemProvider = new SoftwareAssemblyItemProvider(this);
		}

		return softwareAssemblyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.UsesDeviceDependencies} instances.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceDependenciesItemProvider usesDeviceDependenciesItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.UsesDeviceDependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsesDeviceDependenciesAdapter() {
		if (usesDeviceDependenciesItemProvider == null) {
			usesDeviceDependenciesItemProvider = new UsesDeviceDependenciesItemProvider(this);
		}

		return usesDeviceDependenciesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.sad.UsesDeviceRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceRefItemProvider usesDeviceRefItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.sad.UsesDeviceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsesDeviceRefAdapter() {
		if (usesDeviceRefItemProvider == null) {
			usesDeviceRefItemProvider = new UsesDeviceRefItemProvider(this);
		}

		return usesDeviceRefItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			if (!(type instanceof Class< ? >) || (((Class< ? >) type).isInstance(adapter))) {
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
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void dispose() {
		if (assemblyControllerItemProvider != null)
			assemblyControllerItemProvider.dispose();
		if (sadComponentInstantiationItemProvider != null)
			sadComponentInstantiationItemProvider.dispose();
		if (sadComponentInstantiationRefItemProvider != null)
			sadComponentInstantiationRefItemProvider.dispose();
		if (sadUsesPortItemProvider != null)
			sadUsesPortItemProvider.dispose();
		if (sadProvidesPortItemProvider != null)
			sadProvidesPortItemProvider.dispose();
		if (sadConnectInterfaceItemProvider != null)
			sadConnectInterfaceItemProvider.dispose();
		if (sadConnectionsItemProvider != null)
			sadConnectionsItemProvider.dispose();
		if (componentResourceFactoryRefItemProvider != null)
			componentResourceFactoryRefItemProvider.dispose();
		if (externalPortsItemProvider != null)
			externalPortsItemProvider.dispose();
		if (externalPropertiesItemProvider != null)
			externalPropertiesItemProvider.dispose();
		if (externalPropertyItemProvider != null)
			externalPropertyItemProvider.dispose();
		if (findComponentItemProvider != null)
			findComponentItemProvider.dispose();
		if (hostCollocationItemProvider != null)
			hostCollocationItemProvider.dispose();
		if (portItemProvider != null)
			portItemProvider.dispose();
		if (sadPartitioningItemProvider != null)
			sadPartitioningItemProvider.dispose();
		if (sadComponentPlacementItemProvider != null)
			sadComponentPlacementItemProvider.dispose();
		if (resourceFactoryPropertiesItemProvider != null)
			resourceFactoryPropertiesItemProvider.dispose();
		if (sadDocumentRootItemProvider != null)
			sadDocumentRootItemProvider.dispose();
		if (softwareAssemblyItemProvider != null)
			softwareAssemblyItemProvider.dispose();
		if (usesDeviceDependenciesItemProvider != null)
			usesDeviceDependenciesItemProvider.dispose();
		if (usesDeviceRefItemProvider != null)
			usesDeviceRefItemProvider.dispose();
	}

}
