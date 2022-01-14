package com.Assignment.AccessModifer;


public class Car {
 // public variable
 public int carCount;

 // public method
 public void display() {
     System.out.println("I Have a car.");
     System.out.println("I have " + carCount + " cars.");
 }



 public static void main( String[] args ) {
     // accessing the public class
     Car car = new Car();

     // accessing the public variable
     car.carCount = 4;
     // accessing the public method
     car.display();
 }
}