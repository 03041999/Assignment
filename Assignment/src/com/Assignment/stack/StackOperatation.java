package com.Assignment.stack;



	
	import java.util.Stack;
	public class StackOperatation {
	 
	 public static void main(String argvs[])
	 {
	     
	     Stack<Integer> stk = new Stack<Integer>();
	     // adding elements to the stack
	     // stk contains 9
	     stk.push(9);
	     // stk contains 9, 5
	     stk.push(5);
	     // stk contains 9, 5, 7
	     stk.push(7);
	     // stk contains 9, 5, 7, 14
	     stk.push(14);
	     // stk contains 9, 5, 7, 14, 29
	     stk.push(29);
	     // caculating size of the stack
	     int size = stk.size();
	     // displaying the stack on the console
	     System.out.println("The size of the stack is: " + size);
	     System.out.println("The stack contains: " + stk);
	 }
	 } 
