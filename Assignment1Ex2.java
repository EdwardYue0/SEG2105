import java.util.ArrayList;
import java.util.LinkedList;
public class Arrays {
	//this vairiable represents the X value
	private final int num =150000000;
	//this char array represent the 26 letters
	private char[] chars = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'
										,'o','p','q','r','s','t','u','v','w','x','y','z'};
	/*this method will be used to add char Charaters from a to z
	 * accordingly to the ArrayList, it has an ArrayList as its 
	 *parameter and it will return the filled ArrayList
	 * */
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
	
	/*this method will be used to add char Charaters from a to z
	 * accordingly to the LinkedList, it has an LinkedList as its 
	 *parameter and it will return the filled LinkedList
	 * */
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
	
	/*this method will be used to add char Charaters from a to z
	 * accordingly to the char Array, it has an char Array as its 
	 *parameter and it will return the filled Array
	 * */
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
	
	//Getter method for num
	public int getNum() {
		return num;
	}
	
	//Method to convert nanoseconds to seconds
	private static double nanoToSeconds(long time){
		return (double)time / 1000000000.0;
	}
	
	//Main Method
	public static void main (String[]args) {
		//Assignning values
		//ArrayList
		ArrayList list = new ArrayList();
		Arrays neww = new Arrays();
		System.out.println("Test ArrayList starts");
		//start tracking
		long start = System.nanoTime();
		//call filler method
		list = neww.arrayListAdd(list);
		//end tracking
		long end = System.nanoTime();
		System.out.println("Test ArrayList ends, total time "+nanoToSeconds(end-start));
		
		
		//LinkedList
		LinkedList list2 = new LinkedList();
		System.out.println("Test LinkedList starts");
		//start tracking
		start = System.nanoTime();
		//call filler method
		list2 = neww.LinkedListAdd(list2);
		//end tracking
		end = System.nanoTime();
		System.out.println("Test LinkedList ends, total time "+nanoToSeconds(end-start));
		
		//Array
		char []array = new char[neww.getNum()];
		System.out.println("Test Array starts");
		//start tracking
		start = System.nanoTime();
		//call filler method
		array = neww.fillArray(array);
		//end tracking
		end = System.nanoTime();
		System.out.println("Test Array ends, total time "+nanoToSeconds(end-start));
		
		
		//Summing characters
		System.out.println();
		System.out.println();
		
		
		//ArrayList
		String texts ="";
		System.out.println("Summing up ArrayList");
		//start tracking
		start = System.nanoTime();
		int temp = 0;
		//start summing up
		while(temp<list.size()) {
			texts = texts+list.get(temp);
			temp++;
		}
		//end tracking
		end = System.nanoTime();
		System.out.println("It took "+(end-start)+" nanoseconds to sum up "+list.size()+" elements");
		
		//LinkedList 
		texts ="";
		//start tracking
		start = System.nanoTime();
		System.out.println("Summing up LinkedList");
		temp=0;
		//start summing up
		while(temp<list2.size()) {
			texts = texts+list2.get(temp);
			temp++;
		}
		//end tracking
		end = System.nanoTime();
		System.out.println("It took "+(end-start)+" nanoseconds to sum up "+list2.size()+" elements");
		
		//Array
		texts ="";
		System.out.println("Summing up Array");
		//start tracking
		start = System.nanoTime();
		temp=0;
		//start summing up
		while(temp<array.length) {
			texts = texts+array[temp];
			temp++;
		}
		//end tracking
		end = System.nanoTime();
		System.out.println("It took "+(end-start)+" nanoseconds to sum up "+array.length+" elements");
		
	}
}
