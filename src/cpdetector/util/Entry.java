/*
 * Entry.java, base data container for mapping two elements.
 * Copyright (C) 2003 Achim Westermann, created on 28.11.2003
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 * 
 * The contents of this collection are subject to the Mozilla Public License Version 
 * 1.1 (the "License"); you may not use this file except in compliance with 
 * the License. You may obtain a copy of the License at 
 * http://www.mozilla.org/MPL/
 * 
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 * 
 * The Original Code is the cpDetector code in [sub] packages info.monitorenter and 
 * cpdetector. 
 * 
 * The Initial Developer of the Original Code is
 * Achim Westermann <achim.westermann@gmx.de>.
 * 
 * Portions created by the Initial Developer are Copyright (C) 2006 
 * the Initial Developer. All Rights Reserved.
 * 
 * Contributor(s):
 * 
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 * 
 * ***** END LICENSE BLOCK ***** * 
 *  
 * If you modify or optimize the code in a useful way please let me know.
 * Achim.Westermann@gmx.de
 */
package cpdetector.util;

/**
 * <p>
 * I have written implementations of <tt>java.util.Map.Entry</tt> in form of 
 * <ul>
 * <li>
 * 	Static inner classes.
 * </li>
 * <li>
 * 	Non-static inner classes.
 * </li>
 * <li>
 * 	Non-public classes.
 * </li>
 * <li>
 * 	Anonymous classes.
 * </li>
 * </ul>
 * </p>
 * <p>
 * Almost all implementations were plainforward and not hiding any complexity. One could not downcast 
 * them to get more methods, and they were replaceable.
 * <br>
 * That's it! Finally i decided to hardcode it here... . 
 * </p>
 * <p>
 * 	But don't you start writing methods like: 
 * <pre>
 *      public Entry getEntry(String name);
 * 	public void setEntry(Entry entry);
 * </pre>
 * Try sticking to the interface <tt>java.util.Map.Entry</tt>.
 * </p>
 *@see java.util.Map.Entry
 * @author <a href='mailto:Achim.Westermann@gmx.de'>Achim Westermann</a>
 */
public final class Entry implements java.util.Map.Entry
{
	private Object m_key;
	private Object m_value;
	
	public Entry(Object key,Object value){
		this.m_key = key;
		this.m_value = value;
	}
	/**
	 * Maybe null!
	 * @see java.util.Map.Entry#getKey()
	 */
	public Object getKey()
	{
		return this.m_key;
	}

	/**
	 * Maybe null!
	 * @see java.util.Map.Entry#getValue()
	 */
	public Object getValue()
	{
		return this.m_value;
	}

	/** 
	 * You may use null. But you will get it back next call!
	 * 
	 * @see java.util.Map.Entry#setValue(java.lang.Object)
	 */
	public Object setValue(Object value)
	{
		Object ret = this.m_value;
		this.m_value = value;
		return ret;
	}

}
