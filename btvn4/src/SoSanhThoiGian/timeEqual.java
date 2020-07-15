package SoSanhThoiGian;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class timeEqual {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Collections.nCopies(200, 1));
		LinkedList<Integer> arr2 = new LinkedList<Integer>(Collections.nCopies(200, 1));
		long start,end,start1,end1;
		start = System.nanoTime();
		arr.get(100);
		end = System.nanoTime();
		System.out.println(end-start);
		start1 = System.nanoTime();
		arr2.get(100);
		end1 = System.nanoTime();
		System.out.println(end1-start1);
		
	}
}
