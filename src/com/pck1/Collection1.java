package com.pck1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection1 {
	
	public static void main(String  s[]){
	System.out.println("12345456464");
	ArrayList<String> l =  new ArrayList<String>();
	l.add("himanshu");
	l.add("rawat");
	Iterator<String> li = l.iterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	}

}
