package com.StopScreenLockApp;


import java.awt.AWTException;
import java.awt.Robot;
import java.util.Date;
import java.util.Random;

/**
 * @author M1055336
 *
 */
public class StopScreenLock {

	/**
	 * @param args
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.out.println("                                                  ");
		System.out.println("************Stop Screen Lock**********************");
		System.out.println("/                                                /");
		System.out.println("/ Author : Saravanakumar Thirukonda Janarthanan  /");
		System.out.println("/ Date   : 05/06/2020                            /");
		System.out.println("/                                                /");
		System.out.println("**************************************************");
		System.out.println("                                                  ");
        System.out.println("Application started at - "+new Date()+"\n");
        Robot hal = new Robot();
		Random random = new Random();
		int count = 1;
		while(true)
		{
			hal.delay(1000 * 60);
			int x = random.nextInt() % 640;
			int y = random.nextInt() % 480;
			hal.mouseMove(x, y);
			System.out.println(" ("+ new Date()+") - Application is Running......!");
			System.out.println("If you Stop the Application then {Press Clt + C}");
			System.out.println("                                                  ");

			count=count+1;
		}

	
		
}
}
