package SoSanhThoiGian;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class timeEqual {
	private static final int RECORDS = 20000;
	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<String>();
		List<String> arr2 = new LinkedList<String>();
		long start= System.nanoTime();
		
		for(int i = 0;i<=RECORDS ; i++)
		{
			arr.add("RECORD #" + i);
		}
		long totalTimeForAddList = System.nanoTime() - start;
		System.out.println("ArrayList add time :" + totalTimeForAddList);
		long start1= System.nanoTime();
		for(int i = 0;i<=RECORDS ; i++)
		{
			arr2.add("RECORD #" + i);
		}
		long totalTimeForAddLinkedList = System.nanoTime() - start1;
		System.out.println("LinkedList add time :" +totalTimeForAddLinkedList);
		// sua data
		long timeStartForEditArray = System.currentTimeMillis();
		for(int i = 0;i<=RECORDS ; i++)
		{
			arr.set(i,"EDIT #" + i);
		}
		long totalTimeForEditList = System.currentTimeMillis() - timeStartForEditArray;
		System.out.println("ArrayList edit time :" + totalTimeForEditList);
		long timeStartForEditLinkedArray = System.currentTimeMillis();
		for(int i = 0;i<=RECORDS ; i++)
		{
			arr2.set(i,"EDIT #" + i);
		}
		long totalTimeForEditLinkedList = System.currentTimeMillis() - timeStartForEditArray;
		System.out.println("LinkedList edit time :" + totalTimeForEditLinkedList);
		// remove
		long timeStartForRemoveArray = System.currentTimeMillis();
		for(int i = 0;i<arr.size() ; i++)
		{
			arr.remove(i);
		}
		long totalTimeForRemoveList = System.currentTimeMillis() - timeStartForRemoveArray;
		System.out.println("ArrayList remove time :" + totalTimeForRemoveList);
		long timeStartForRemoveLinkedArray = System.currentTimeMillis();
		for(int i = 0;i< arr2.size() ; i++)
		{
			arr2.remove(i);
		}
		long totalTimeForRemoveLinkedList = System.currentTimeMillis() - timeStartForRemoveArray;
		System.out.println("LinkedList remove time :" + totalTimeForRemoveLinkedList);
	}
}
