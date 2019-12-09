package com.mindtree.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/******************************************************************************

Online Java Compiler.
Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
public class Main
//import Date

{
public static void main(String[] args) {
System.out.println("Hello World");
String time1 = "16:00:00";
String time2 = "19:00:00";

SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
Date date1 = null;
try {
	date1 = format.parse(time1);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Date date2 = null;
try {
	date2 = format.parse(time2);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
long difference = date2.getTime() - date1.getTime(); 
System.out.println(difference);
}
}
