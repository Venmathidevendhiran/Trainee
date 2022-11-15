package com.chainsys;

import java.util.Scanner;

public class HospitalNew {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		hospital hospital2=new hospital();
		System.out.println("Enter Hospital name:");
		String hospitalName=sc.next();
		hospital2.hospitalName=hospitalName;
		System.out.println("Enter PhoneNumber");
		long PhoneNumber=sc.nextLong();
		System.out.println(hospital2.hospitalName);
		System.out.println(hospital2.phoneNumber);
 
	}

}
