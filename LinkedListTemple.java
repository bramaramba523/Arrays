package pack;

import java.util.LinkedList;

class LinkedListImple {
public static void main(String[] args) {
	LinkedList<String> cars= new LinkedList<String>();
	cars:add("volvo");
	cars:add("BMW");
	cars:add("Ford");
	cars:add("Mazda");
	System.out.println(cars);
	cars.addFirst("Mazda");
   cars.addLast("Audi");
   System.out.println(cars);
   //use removeFirst() remove the first item from the list
   cars.removeFirst();
   cars.removeLast();
   cars.getFirst();
   boolean contains=cars.contains("Volvo");
   System.out.println(contains);
   boolean isEmpty=cars.isEmpty();
   System.out.println(isEmpty);
    cars.clear();//remove all the items from the list
   System.out.println(cars);
}

private static void add(String string) {
	// TODO Auto-generated method stub
	
}

}