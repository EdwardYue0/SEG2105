package seg;

import java.util.ArrayList;
import java.util.LinkedList;
public class Arrays {
	private final int num =100000000;
	private char[] chars = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'
										,'o','p','q','r','s','t','u','v','w','x','y','z'};
	public ArrayList arrayListAdd(ArrayList list) {
		int temp = 0;
		int count=0;
		while(temp<num) {
			list.add(chars[count]);
			count++;
			if(count>=26)
				count=0;
			temp++;
		}
		return list;
	}
	public LinkedList LinkedListAdd(LinkedList list) {
		int temp = 0;
		int count=0;
		while(temp<num) {
			list.add(chars[count]);
			count++;
			if(count>=26)
				count=0;
			temp++;
		}
		return list;
	}
	public char[] fillArray(char[]list) {
		int temp = 0;
		int count=0;
		while(temp<num) {
			list[temp]=chars[count];
			count++;
			if(count>=26)
				count=0;
			temp++;
		}
		return list;
	}
	public int getNum() {
		return num;
	}
	private static double nanoToSeconds(long time){
		return (double)time / 1000000000.0;
	}
	public static void main (String[]args) {
		//Assignning values
		//ArrayList
		ArrayList list = new ArrayList();
		Arrays neww = new Arrays();
		System.out.println("Test ArrayList starts");
		long start = System.nanoTime();
		list = neww.arrayListAdd(list);
		long end = System.nanoTime();
		System.out.println("Test ArrayList ends, total time "+nanoToSeconds(end-start));
		
		
		//LinkedList
		LinkedList list2 = new LinkedList();
		System.out.println("Test LinkedList starts");
		start = System.nanoTime();
		list2 = neww.LinkedListAdd(list2);
		end = System.nanoTime();
		System.out.println("Test LinkedList ends, total time "+nanoToSeconds(end-start));
		
		//Array
		char []array = new char[neww.getNum()];
		System.out.println("Test Array starts");
		start = System.nanoTime();
		array = neww.fillArray(array);
		end = System.nanoTime();
		System.out.println("Test Array ends, total time "+nanoToSeconds(end-start));
		
		
		//Summing characters
		System.out.println();
		System.out.println();
		
		/*
		//ArrayList
		String texts ="";
		System.out.println("Summing up ArrayList");
		start = System.nanoTime();
		int temp = 0;
		while(temp<list.size()) {
			texts = texts+list.get(temp);
			temp++;
		}
		end = System.nanoTime();
		System.out.println("It took "+(end-start)+" nanoseconds to sum up "+list.size()+" elements");
		
		//LinkedList 
		texts ="";
		start = System.nanoTime();
		System.out.println("Summing up LinkedList");
		temp=0;
		while(temp<list2.size()) {
			texts = texts+list2.get(temp);
			temp++;
		}
		end = System.nanoTime();
		System.out.println("It took "+(end-start)+" nanoseconds to sum up "+list2.size()+" elements");
		
		//Array
		texts ="";
		System.out.println("Summing up Array");
		start = System.nanoTime();
		temp=0;
		while(temp<array.length) {
			texts = texts+array[temp];
			temp++;
		}
		end = System.nanoTime();
		System.out.println("It took "+(end-start)+" nanoseconds to sum up "+array.length+" elements");
		*/
	}
}
