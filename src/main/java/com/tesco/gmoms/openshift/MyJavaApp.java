package com.tesco.gmoms.openshift;

import java.io.PrintWriter;

public class MyJavaApp {

	public static void main(String[] args) {
		try {
			PrintWriter writer = new PrintWriter("jj.txt", "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
 