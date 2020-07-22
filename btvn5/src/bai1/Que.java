package bai1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Que {
	public static void main(String[] args) {
		Queue<Customer> listKh = new LinkedList<Customer>();
		var kh1 = new Customer("1","A","1h","toichuabietyeu");
		var kh2 = new Customer("2","B","1h1","baihat");
		var kh3 = new Customer("3","C","1h2","baihat");
		var kh4 = new Customer("4","D","1h3","baihat");
		var kh5 = new Customer("5","E","1h4","toichuabietyeu");
		var kh6 = new Customer("6","F","1h5","baihat");
		var kh7 = new Customer("7","G","1h6","baihat");
		var kh8 = new Customer("8","H","1h7","baihat");
		var kh9 = new Customer("9","P","1h8","baihat");
		var kh10 = new Customer("10","N","1h9","baihat");
		listKh.add(kh1);
		listKh.add(kh2);
		listKh.add(kh3);
		listKh.add(kh4);
		listKh.add(kh5);
		listKh.add(kh6);
		listKh.add(kh7);
		listKh.add(kh8);
		listKh.add(kh9);
		listKh.add(kh10);
		Iterator<Customer> itr = listKh.iterator();
//		while(itr.hasNext())
//		{
//			Customer element = itr.next();
//			
//				System.out.println(element.toString());
//		}
		// tim khach hang
		List<Customer> listKhCoNhac = new ArrayList<Customer>();
		while(itr.hasNext())
		{
			Customer element = itr.next();
			if(element.getMusicName()=="toichuabietyeu")
			{
				listKhCoNhac.add(element);			}
		}
		for(Customer kh : listKhCoNhac)
		{
			System.out.println(kh.toString());
		}
	}
}
