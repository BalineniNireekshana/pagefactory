package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

	public class HooksConcept1 {

	    @Before(order = 1) 
	    public void method1() {
	        System.out.println("Before Scenario - Order 1");
	    }

	  
	    @Before(value = "@Smoke", order = 2) 
	    public void method2() {
	        System.out.println("Before Scenario - Order 2 (Only for @Smoke)");
	    }

	   
	    @Before(value = "@Regression", order = 3)
	    public void method3() {
	        System.out.println("Before Scenario - Order 3 (Only for @Regression)");
	    }

	    
	    @BeforeStep
	    public void method4() {
	        System.out.println("Before each step of the scenario");
	    }

	    
	    @AfterStep
	    public void method5() {
	        System.out.println("After each step of the scenario");
	    }

	   
	    @After(value = "@Smoke", order = 1)
	    public void method6() {
	        System.out.println("After Scenario - Order 1 (Only for @Smoke)");
	    }

	    
	    @After(value = "@Regression", order = 2)
	    public void method7() {
	        System.out.println("After Scenario - Order 2 (Only for @Regression)");
	    }

	    
	    @After(order = 3)
	    public void method8() {
	        System.out.println("After Scenario - Order 3");
	    }
	}

