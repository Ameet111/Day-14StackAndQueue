package com.bridgelab.stack;

public class PeakAndpop<T> {
	 private class Node {
	        T data;
	        Node link;
	    }

	    Node topper;

	    //default constructor give null value at topper
	    public PeakAndpop() {
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

	    //pop method to pop the stack value
	    public void pop(){
	        if(topper == null){
	            System.out.println("stack underflow");
	        }
	        else
	            topper = (topper).link;
	    }
	    //peek method give topper value

	    public T peek(){
	        if(topper != null){
	            return topper.data;
	        }
	        else{
	            System.out.println("stack underflow");
	            return null;
	        }
	    }

	    //display method to give the stack data
	    public void display() {
	        Node temp = null;
	        if (topper == null) {
	            System.out.println("stack underflow");
	        }
	        temp = topper;
	        while (temp != null) {
	            System.out.print(temp.data);
	            System.out.print("->"+temp.data);
	            temp = temp.link;
	        }
	    }
	    public static void main(String args[]){
	        //  stack implement use linked list

	        System.out.println("Welcome to Stacks and Queues");

	        //create object and give the push method value

	        PeakAndpop queue = new PeakAndpop();

	        queue.push(56);
	        queue.push(30);
	        queue.push(70);
	        queue.display();


	            System.out.println("top value"+ queue.peek());

	            queue.pop();
	            queue.pop();
	            queue.display();


	    }
	
}
