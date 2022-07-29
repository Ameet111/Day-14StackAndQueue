package com.bridgelab.stack;

public class QueueSatck<T> {
	
	 private class Node {
	        T data;
	        Node link;
	    }

	    Node topper;

	    //default constructor give null value at topper
	    public QueueSatck() {
	        this.topper = null;
	    }

	    /* create  in class push method
	     * push stack operation to add the element at top
	     */
	    public void push(T x) {
	        //create temp node and give top value
	        Node temp = new Node();
	        if (temp == null) {
	            System.out.println("stack overflow");
	        }
	        temp.data = x;
	        temp.link = topper;
	        topper = temp;

	    }

	    //display method to give the stack data
	    public void display() {
	        Node temp = null;
	        if (topper == null) {
	            System.out.println("stack underflow");
	        }
	        temp = topper;
	        while (temp != null) {
	            System.out.println(temp.data);
	            System.out.print("->"+temp.data);
	            temp = temp.link;
	        }
	    }
	    
	    public static void main(String args[]){
	        //  stack implement use linked list

	        System.out.println("Welcome to Stacks and Queues");

	        //create object and give the push method value

	        QueueSatck SQ = new QueueSatck();

	        SQ.push(56);
	        SQ.push(30);
	        SQ.push(70);
	        SQ.display();


	    }
 
}
