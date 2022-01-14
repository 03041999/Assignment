package com.Assignment.Linkedlist;

public class DoublyLinkedList {
	   
		  
	    //Create a node for doubly linked list    
	    class Node{    
	        String data;    
	        Node prev;    
	        Node next;    
	  
	        public Node(String data) {    
	            this.data = data;    
	        }    
	    }    
	  
	    //Initialize head and tail for the doubly linked list    
	    Node head = null;  
	    Node tail = null;    
	  
	   
	    public void addNewNode(String data) {    
	  
	          
	        Node newNode = new Node(data);    
	  
	          
	        if(head == null) {  
	              
	            head = newNode;  
	            tail = newNode;  
	              
	            head.prev = null;    
	            
	            tail.next = null;    
	        }  
	        
	        else {    
	  
	           
	            tail.next = newNode;    
	              
	            newNode.prev = tail;    
	            
	            tail = newNode;    
	               
	            tail.next = null;    
	        }    
	    }    
	  
	       
	    public void showData() {  
	           
	        Node current = head;    
	         
	        if(head == null) {  
	              
	            System.out.println("List is empty");    
	            return;    
	        }  
	        
	        System.out.println("Nodes of doubly linked list: ");    
	         
	        while(current != null) {    
	            
	            System.out.print(current.data + "\n");    
	            current = current.next;    
	        }    
	    }    
	  
	    public static void main(String[] args) {    
	  
	        DoublyLinkedList obj = new DoublyLinkedList();    
	  
	        
	        obj.addNewNode("New York");    
	        obj.addNewNode("london");    
	        obj.addNewNode("America");    
	        obj.addNewNode("Gangaok");    
	        obj.addNewNode("dubhai");    
	  
	          
	        obj.showData();    
	    }    
	}  


