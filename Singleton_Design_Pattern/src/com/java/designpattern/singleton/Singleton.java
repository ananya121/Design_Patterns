package com.java.designpattern.singleton;

//Eager Initialization
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
