package com.assinment.exception;

public class Throw {
	
	
	  static void avg()
	  {
	    try
	    {
	      throw new ArithmeticException("demo");
	    }
	    catch(ArithmeticException e)
	    {
	      System.out.println("Exception caught");
	    }
	 }

	 public static void main(String args[])
	 {
	    avg();
	 }
	}

