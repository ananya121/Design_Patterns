package com.java.designpattern.singleton;

//Eager Initialization
/*
 * 
 * Drawbacks
 * 1. Instantiated during class loading (It might not be required by client application)
 * 2. Exception handling facility is not provided as we need a block to handle exceptions
 */
public class Singleton 
{
	private static final Singleton INSTANCE=new Singleton();
	//Private Constructor--> so that it can't be invoked outside the class
	//Other classes can't create instance of this class
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		return INSTANCE;
	}
	

}
