package com.java.designpattern.client;

import com.java.designpattern.singleton.Singleton;
//Static Block Initialization
public class ClientTest {

	
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
