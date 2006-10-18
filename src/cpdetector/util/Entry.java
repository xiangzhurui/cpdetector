/*
 * Created on 28.11.2003
 *
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
