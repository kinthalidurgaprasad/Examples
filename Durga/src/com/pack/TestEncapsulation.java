package com.pack;

public class TestEncapsulation
{
		public static void main(String[] args)
		{  
		  
		    Examples acc=new Examples();  
		    acc.setAcc_no(987654321L);  
		    acc.setName("Durga chinnu");  
		    acc.setEmail("prasad.com");  
		    acc.setAmount(25000f); 
		    
		    System.out.println("Acc_no :"+acc.getAcc_no());
		    System.out.println("Name :"+acc.getName());
		    System.out.println("Email :"+acc.getEmail());
		    System.out.println("Amount :"+acc.getAmount());
		    
		}  
}  


