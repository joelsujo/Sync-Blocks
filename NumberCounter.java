package com.collaber.threads;



public class NumberCounter implements Runnable {

	@Override
public void run(){
		synchronized(this){
		
	try{  System.out.println(Thread.currentThread().getName() + " has started");
	Thread.sleep(400); 
	

	for(int num = 0; num < 10; num++)
	{
		
		Thread.sleep(400); 
		
		System.out.println(Thread.currentThread().getName() + " : " +num);
}
	
	
	        
	       
	      }catch(Exception e){System.out.println(e);}  
		
		}
	     }   
//super.run();
}





