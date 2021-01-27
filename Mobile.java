package com.Rumble;

import java.util.ArrayList;
import java.util.Collection;

public class Mobile{
	public static void main(String[] args) {
		Collection<Long> mobileNumbers=new ArrayList();
		mobileNumbers.add(9448553971l);
		mobileNumbers.add(9448553971l);
		mobileNumbers.add(9448553971l);
		mobileNumbers.add(9448553982l);
		mobileNumbers.add(9472626879l);
		mobileNumbers.add(9441386386l);
		
		
		for (Long mobileNo:mobileNumbers) {
			String convertedMobileNo=mobileNo.toString();
			Character last = convertedMobileNo.charAt(convertedMobileNo.length()-1);
			System.out.println(last);
			
			if(Integer.parseInt(last.toString())>3){
				System.out.println("mobile number is greater"+convertedMobileNo);
				
			}
		}
		
		
		
		
	}
}
