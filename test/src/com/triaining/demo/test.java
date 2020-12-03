package com.triaining.demo;


	class SuperClass
	{ 
	 int value = 100;

	void callMe()
	{ 
		System.out.println("I am in Super Class"); 
	 }
	}

	class SubClass extends SuperClass
	{ 
	int value = 10;

	void callMe()
	{ 
	System.out.println("I am in Sub Class"); 
	 }
	}
