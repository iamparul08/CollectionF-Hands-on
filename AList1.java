 
 import java.util.*;
 
 class AList1 {
	 public static void main(String args[]) {
		 ArrayList<String> cars = new ArrayList<String>();
		 cars.add("Volvo");
		 cars.add("Ferrari");
		 cars.add("Datsun");
		 cars.add("BMW");
		 cars.add("Bentley");
		 
		 printAll(cars);	
		 
	 }
	 public static void printAll(List<String> list) {
	
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	
	}
	
	 }