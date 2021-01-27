package com.Rumble;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TaskTester {
public static void main(String[] args) {
	Collection<Long>doorNos = new HashSet();
	doorNos.add(11l);
	doorNos.add(12l);
	doorNos.add(13l);
	doorNos.add(11l);
	doorNos.add(14l);
	doorNos.add(16l);
	doorNos.add(11l);
	Iterator<Long> iterator=doorNos.iterator();
	System.out.println("size of"+doorNos.size());
	
}
}
