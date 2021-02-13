package com.java.designpattern.singleton;

//Static block  Initialization
/*
 * 
 * Drawbacks
 * 1. Instantiated during class loading (It might not be required by client application)
 * Pros:
 * 1. Exception handling facility is  provided .
 */
public class Singleton 
{
	private static Singleton INSTANCE=null;
	//Private Constructor--> so that it can't be invoked outside the class
	//Other classes can't create instance of this class
 
	private Singleton()
	{
		
	}
	
	static {
		try {
			if(INSTANCE==null)
				INSTANCE=new Singleton();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Singleton getInstance()
	{
		return INSTANCE;
	}
	

}
