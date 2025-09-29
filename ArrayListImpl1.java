package Pack1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
		public class ArrayListImpl1 {

			public static void main(String[] args) {
				//int a
				ArrayList<Integer>a =new ArrayList<>();
				a.add(100);
				a.add(200);
				a.add(400);
				a.add(0,500);
				System.out.println(a);
			
				ArrayList<Object>mix=new ArrayList<>();
				mix.add(100);
				mix.add("String");
				mix.add(0.9);
				mix.add(100000000);
				System.out.println(mix);
				
				int num=(int )mix.get(0);//type casting
				System.out.println(num);
				String str1=(String) mix.get(1);
				System.out.println(mix);
				
				
				//insert element at the begining of the list(0)
				for(int i=0;i<a.size(); i++) {
					System.out.println(a.get(i));
				}
				Iterator<Integer>it=a.iterator();
				while(it.hasNext())
{
	Integer s=it.next();
	System.out.println(s);
			}
				ArrayList<Integer> lista=new ArrayList<Integer>();
				lista.add(600);
				lista.add(700);
				lista.add(800);
				System.out.println(lista);
				//coping two lists
				Collections.copy(a, lista);
				System.out.println(a);
				System.out.println(lista);
				
				//shuffle the list
				System.out.println("list before shuffle"+lista);
				Collections.shuffle(lista);
				
				
		}
	}

}
