/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.prf.provider;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import mil.jpeojtrs.sca.prf.AbstractPropertyRef;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.PrfPackage;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.Values;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mil.jpeojtrs.sca.prf.SimpleSequenceRef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSequenceRefItemProvider extends AbstractPropertyRefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSequenceRefItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the Values feature.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValuesPropertyDescriptor(Object object) {
		// END GENERATED CODE
		final ItemPropertyDescriptor defaultDescriptor = createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(), getString("_UI_SimpleSequenceRef_values_feature"),
			getString("_UI_PropertyDescriptor_description", "_UI_SimpleSequenceRef_values_feature", "_UI_SimpleSequenceRef_type"),
			PrfPackage.Literals.SIMPLE_SEQUENCE_REF__VALUES, false, false, false, null, null, null);

		this.itemPropertyDescriptors.add(new ValuesDecorator(object, defaultDescriptor));
		// BEGIN GENERATED CODE
	}

	private class ValuesDecorator extends ItemPropertyDescriptorDecorator {
		public ValuesDecorator(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}

		@Override
		public IItemLabelProvider getLabelProvider(final Object thisObject) {
			final SimpleSequenceRef property = (SimpleSequenceRef) thisObject;

			final IItemLabelProvider lp = super.getLabelProvider(thisObject);
			return new IItemLabelProvider() {

				@Override
				@SuppressWarnings("unchecked")
				public String getText(Object object) {
					List<String> value = null;
					if (object instanceof Values) {
						value = ((Values) object).getValue();
					} else if (object != null && object.getClass().isArray()) {
						value = Arrays.asList((String[]) object);
					} else if (object instanceof List< ? >) {
						value = (List<String>) object;
					}
					return getValueText(property, value);
				}

				@Override
				public Object getImage(Object object) {
					return lp.getImage(object);
				}
			};
		}

		@Override
		public boolean canSetProperty(Object thisObject) {
			if (thisObject instanceof SimpleSequenceRef) {
				return true;
			}
			return super.canSetProperty(thisObject);
		}

	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection< ? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PrfPackage.Literals.SIMPLE_SEQUENCE_REF__VALUES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SimpleSequenceRef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SimpleSequenceRef.class)) {
		case PrfPackage.SIMPLE_SEQUENCE_REF__VALUES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(PrfPackage.Literals.SIMPLE_SEQUENCE_REF__VALUES, PrfFactory.eINSTANCE.createValues()));
	}

	@Override
	protected String getValueText(AbstractPropertyRef< ? > object) {
		SimpleSequenceRef ref = (SimpleSequenceRef) object;
		return getValueText(ref, (ref.getValues() == null) ? null : ref.getValues().getValue());
	}

	public static String getValueText(SimpleSequenceRef ref, List<String> value) {
		String retVal = null;
		if (value == null || value.isEmpty()) {
			retVal = Collections.emptyList().toString();
		} else {
			retVal = value.toString();
		}

		SimpleSequence property = ref.getProperty();
		if (property == null) {
			return (value == null) ? "" : value.toString();
		}

		final String units = property.getUnits();
		if (units != null) {
			return retVal + " " + units;
		} else {
			return retVal;
		}
	}

}
