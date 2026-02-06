import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);//add() will insert the data into the Arraylist
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		System.out.println("============");
		ArrayList al1=new ArrayList();
		al1.add(10);//add() will insert the data into the Arraylist
		al1.add(200.45);
		al1.add("Sachin");
		al1.add('r');
		al1.add(true);
		al1.add(123.3f);		
		System.out.println(al1);
		System.out.println("============");
		ArrayList al2=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arrayList data :");
		al2.add(sc.nextInt());
		al2.add(sc.nextInt());
		al2.add(sc.nextInt());
		al2.add(sc.nextInt());
		al2.add(sc.nextInt());
		al1.add(sc.nextInt());
		System.out.println(al2);
		al2.addFirst(111);
		System.out.println(al2);
		al2.addFirst(222);
		System.out.println(al2);
		al2.addFirst(333);
		System.out.println(al2);  
	}

}
