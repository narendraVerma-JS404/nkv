package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
	
	
	//public static void main(String args[]) {
	@Test
	public void tc001() {
	    //Test Steps
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
	}

}
