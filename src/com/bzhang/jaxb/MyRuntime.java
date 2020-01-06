package com.bzhang.jaxb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyRuntime {

	protected static void execRuntime() {

		System.out.println("array");
//		String[] cmdArray = new String[]{"xjc", "-d", "src", "-p", "com.soprasteria.jaxbtest", "Employee.xsd"} ;
		String cmd = "xjc -d src -p com.soprasteria.jaxbtest src/Employee.xsd";

		try {
			Process process = Runtime.getRuntime().exec(cmd);
//			System.out.println("cmd");
			BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
