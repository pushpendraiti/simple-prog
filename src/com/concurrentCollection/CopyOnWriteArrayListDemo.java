package com.concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> cowal = new ArrayList<Integer>();
		cowal.add(12);
		cowal.add(13);
		cowal.add(14);
		Iterator<Integer> iterator = cowal.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();

			if (integer % 2 == 0)
				iterator.remove();
			else
				System.out.print(integer + " ");
		}

	}

}
