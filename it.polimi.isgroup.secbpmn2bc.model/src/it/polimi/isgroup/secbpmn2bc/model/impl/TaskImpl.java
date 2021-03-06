/**
 */
package it.polimi.isgroup.secbpmn2bc.model.impl;

import it.polimi.isgroup.secbpmn2bc.model.Task;

import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.TaskImpl#getOnChainExecution <em>On Chain Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends it.unitn.disi.sweng.secbpmn.model.impl.TaskImpl implements Task {
	/**
	 * The default value of the '{@link #getOnChainExecution() <em>On Chain Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChainExecution()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_CHAIN_EXECUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnChainExecution() <em>On Chain Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChainExecution()
	 * @generated
	 * @ordered
	 */
	protected Boolean onChainExecution = ON_CHAIN_EXECUTION_EDEFAULT;

	/**
	 * This is true if the On Chain Execution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onChainExecutionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecBPMN2BCPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnChainExecution() {
		return onChainExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnChainExecution(Boolean newOnChainExecution) {
		Boolean oldOnChainExecution = onChainExecution;
		onChainExecution = newOnChainExecution;
		boolean oldOnChainExecutionESet = onChainExecutionESet;
		onChainExecutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecBPMN2BCPackage.TASK__ON_CHAIN_EXECUTION,
					oldOnChainExecution, onChainExecution, !oldOnChainExecutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOnChainExecution() {
		Boolean oldOnChainExecution = onChainExecution;
		boolean oldOnChainExecutionESet = onChainExecutionESet;
		onChainExecution = ON_CHAIN_EXECUTION_EDEFAULT;
		onChainExecutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SecBPMN2BCPackage.TASK__ON_CHAIN_EXECUTION,
					oldOnChainExecution, ON_CHAIN_EXECUTION_EDEFAULT, oldOnChainExecutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOnChainExecution() {
		return onChainExecutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SecBPMN2BCPackage.TASK__ON_CHAIN_EXECUTION:
			return getOnChainExecution();
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
		case SecBPMN2BCPackage.TASK__ON_CHAIN_EXECUTION:
			setOnChainExecution((Boolean) newValue);
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
		case SecBPMN2BCPackage.TASK__ON_CHAIN_EXECUTION:
			unsetOnChainExecution();
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
		case SecBPMN2BCPackage.TASK__ON_CHAIN_EXECUTION:
			return isSetOnChainExecution();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (OnChainExecution: "); //$NON-NLS-1$
		if (onChainExecutionESet)
			result.append(onChainExecution);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //TaskImpl
