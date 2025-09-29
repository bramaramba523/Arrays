package NewPack;

class Student {
public int id;
public String name;
Student(int id,String name)//p consytructor
{
	this.id=id;
	this.name=name;
}
public void display()
{
	System.out.println("stuident id is"+""+id+""+"name is"+""name);
}}
public class ArrayOfObjectBasics{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array of object
		Student[] arr =new Student[3];//array of opbjects
		arr[0]=new Student(100,"malar");
		arr[1]=new Student(101,"malathi");
		arr[2]=new Student(102,"malariviz");
		System.out.println("student data arr0");
		arr[0].display();
		System.out.println("student data arr1");
		arr[1].display();
		System.out.println("student data arr2");
		arr[2].display();
		
	}

}
