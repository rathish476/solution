package com.Rumble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TaskTester1 {


		public static void main(String[] args) {

			Collection<Long> doorNos = new ArrayList();

			doorNos.add(134L);
			doorNos.add(4223l);
			doorNos.add(840234l);
			doorNos.add(4223l);
			doorNos.add(1023l);
			doorNos.add(31444l);
			doorNos.add(4202343l);
			doorNos.add(3124354l);
			doorNos.add(729l);
			doorNos.add(370l);
			doorNos.add(370l);
			// convert to []
			// iterator

			Collection<Long> tempDoorNos = new ArrayList<Long>();
			Iterator<Long> iterator = doorNos.iterator();
			System.out.println("size of " + doorNos.size());
			while (iterator.hasNext()) {
				Long doorNo = iterator.next();// 115,420,420,34
				System.out.println("Door No :" + doorNo);
				if (tempDoorNos.contains(doorNo)) {
					System.out.println("duplicate door no" + doorNo);
				} else {
					System.out.println("added temp " + doorNo);
					tempDoorNos.add(doorNo);
				}

			}

			System.out.println("tempDoorNos size " + tempDoorNos.size());

			doorNos.clear();
		//for each
			Iterator<Long> tempIterator=tempDoorNos.iterator();
			while(tempIterator.hasNext())
			{
				doorNos.add(tempIterator.next());
			}
			System.out.println("size of door nos"+doorNos.size());
		}

	}

