/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ui.ide;

/**
 * MessagesCompatibility is the abstract superclass of the 
 * deprecated message catalog classes.
 * @deprecated Subclasses of this class are provided for backwards
 * compatibility only.
 *
 */
public abstract class MessagesCompatibility {
	
	/**
     * Returns the formatted message for the given key in
     * the resource bundle. 
     *
     * @param key the resource name
     * @param args the message arguments
     * @return the string
     */
    public static String format(String key, Object[] args) {
        return key;
    }

    /**
     * Returns the resource object with the given key in
     * the resource bundle. If there isn't any value under
     * the given key, the key is returned.
     *
     * @param key the resource name
     * @return the string
     * @deprecated Do not reference message catalogs using
     * getString()
     */
    public static String getString(String key) {
        return key;
    }

}
