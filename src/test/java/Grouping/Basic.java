package Grouping;

import org.testng.annotations.Test;

public class Basic {
	@Test(priority=1 ,groups= {"sanity", "regression"})
	void loginByMail() {
		System.out.println("Log in By mail");
	}
	@Test(priority=2, groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("Log in by Fcaebook");
	}
@Test(priority=3, groups = {"sanity"})
	void loginByTwitter() {
	System.out.println("Log in by Twitter");
		
	}
        @Test(priority=4, groups= {"sanity","regression"})
        
     void signUpBymail() {
    	 
     }
        @Test(priority=5, groups= {"regression"})
        void signUpByFacebook() {
        	System.out.println("signup in Facebook");
        }
        @Test(priority=6, groups= {"regression"})
        void signUpByTwitter() {
        	
        }
        @Test(priority=7, groups= {"sanity","regression"})
        void PaymentInRupees() {
        	System.out.println("Payment in reppe");
        	
        	
        }
        @Test(priority=8, groups= { "sanity"})
        void PaymentInDollar() {
        	System.out.println("payment in dollar");
        }
        @Test(priority=9, groups= {"regression"})
        void PaymentReturnByBank() {
        	System.out.println("paymennt by bank");
        }







}
