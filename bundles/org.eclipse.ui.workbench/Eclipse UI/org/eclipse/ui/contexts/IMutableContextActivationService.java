/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ui.contexts;

import java.util.Set;

/**
 * An instance of this interface allows clients to manage context activation.
 * <p>
 * This interface is not intended to be extended or implemented by clients.
 * </p>
 * 
 * @since 3.0
 * @see ContextActivationServiceFactory
 */
public interface IMutableContextActivationService
	extends IContextActivationService {

	/**
	 * Sets the set of identifiers to active contexts.
	 * 
	 * @param activeContextIds
	 *            the set of identifiers to active contexts. This set may be
	 *            empty, but it must not be <code>null</code>. If this set
	 *            is not empty, it must only contain instances of <code>String</code>.
	 */
	void setActiveContextIds(Set activeContextIds);
}