/**
 * Copyright 2014-2016 yangming.liu<bytefox@126.com>.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 */
package org.bytesoft.bytetcc;

import org.bytesoft.bytetcc.supports.CompensableRolledbackMarker;
import org.bytesoft.bytetcc.supports.CompensableSynchronization;
import org.bytesoft.bytetcc.supports.resource.LocalResourceCleaner;
import org.bytesoft.compensable.CompensableBeanFactory;
import org.bytesoft.compensable.CompensableContext;
import org.bytesoft.compensable.CompensableManager;
import org.bytesoft.compensable.ContainerContext;
import org.bytesoft.compensable.logging.CompensableLogger;
import org.bytesoft.transaction.TransactionLock;
import org.bytesoft.transaction.TransactionManager;
import org.bytesoft.transaction.TransactionRecovery;
import org.bytesoft.transaction.TransactionRepository;
import org.bytesoft.transaction.logging.ArchiveDeserializer;
import org.bytesoft.transaction.remote.RemoteCoordinator;
import org.bytesoft.transaction.supports.rpc.TransactionInterceptor;
import org.bytesoft.transaction.supports.serialize.XAResourceDeserializer;
import org.bytesoft.transaction.xa.XidFactory;

public final class CompensableBeanFactoryImpl  implements CompensableBeanFactory {
	private static final CompensableBeanFactoryImpl instance = new CompensableBeanFactoryImpl();

	private CompensableManager compensableManager;
	private XidFactory compensableXidFactory;
	private CompensableLogger compensableLogger;
	private TransactionRepository compensableRepository;
	private TransactionRecovery compensableRecovery;
	private RemoteCoordinator compensableCoordinator;
	private ContainerContext containerContext;
	private ArchiveDeserializer archiveDeserializer;
	private XAResourceDeserializer resourceDeserializer;
	private LocalResourceCleaner localResourceCleaner;
	private CompensableContext compensableContext;
	@javax.inject.Inject
	private CompensableSynchronization compensableSynchronization;
	private TransactionLock compensableLock;
	private CompensableRolledbackMarker compensableRolledbackMarker;

	private CompensableBeanFactoryImpl() {
		if (instance != null) {
			throw new IllegalStateException();
		}
	}

	public static CompensableBeanFactoryImpl getInstance() {
		return instance;
	}



	public CompensableManager getCompensableManager() {
		return compensableManager;
	}

	public void setCompensableManager(CompensableManager compensableManager) {
		this.compensableManager = compensableManager;
	}



	public XidFactory getCompensableXidFactory() {
		return compensableXidFactory;
	}

	public void setCompensableXidFactory(XidFactory compensableXidFactory) {
		this.compensableXidFactory = compensableXidFactory;
	}

	public CompensableLogger getCompensableLogger() {
		return compensableLogger;
	}

	public void setCompensableLogger(CompensableLogger compensableLogger) {
		this.compensableLogger = compensableLogger;
	}



	public TransactionRepository getCompensableRepository() {
		return compensableRepository;
	}

	public void setCompensableRepository(TransactionRepository compensableRepository) {
		this.compensableRepository = compensableRepository;
	}


	public TransactionRecovery getCompensableRecovery() {
		return compensableRecovery;
	}

	public void setCompensableRecovery(TransactionRecovery compensableRecovery) {
		this.compensableRecovery = compensableRecovery;
	}



	public RemoteCoordinator getCompensableNativeParticipant() {
		return compensableCoordinator;
	}

	public void setCompensableCoordinator(RemoteCoordinator compensableCoordinator) {
		this.compensableCoordinator = compensableCoordinator;
	}

	public TransactionLock getCompensableLock() {
		return compensableLock;
	}

	public void setCompensableLock(TransactionLock compensableLock) {
		this.compensableLock = compensableLock;
	}

	public ContainerContext getContainerContext() {
		return containerContext;
	}

	public void setContainerContext(ContainerContext containerContext) {
		this.containerContext = containerContext;
	}

	public ArchiveDeserializer getArchiveDeserializer() {
		return archiveDeserializer;
	}

	public void setArchiveDeserializer(ArchiveDeserializer archiveDeserializer) {
		this.archiveDeserializer = archiveDeserializer;
	}

	public XAResourceDeserializer getResourceDeserializer() {
		return resourceDeserializer;
	}

	public void setResourceDeserializer(XAResourceDeserializer resourceDeserializer) {
		this.resourceDeserializer = resourceDeserializer;
	}

	public LocalResourceCleaner getLocalResourceCleaner() {
		return localResourceCleaner;
	}

	public void setLocalResourceCleaner(LocalResourceCleaner localResourceCleaner) {
		this.localResourceCleaner = localResourceCleaner;
	}

	public CompensableContext getCompensableContext() {
		return compensableContext;
	}

	public void setCompensableContext(CompensableContext compensableContext) {
		this.compensableContext = compensableContext;
	}

	public CompensableSynchronization getCompensableSynchronization() {
		return compensableSynchronization;
	}

	public void setCompensableSynchronization(CompensableSynchronization compensableSynchronization) {
		this.compensableSynchronization = compensableSynchronization;
	}

	public CompensableRolledbackMarker getCompensableRolledbackMarker() {
		return compensableRolledbackMarker;
	}

	public void setCompensableRolledbackMarker(CompensableRolledbackMarker compensableRolledbackMarker) {
		this.compensableRolledbackMarker = compensableRolledbackMarker;
	}

}
