import java.util.*;

class arrayOfArraylists{
	public static void main(String args[]){
	
	List[] list1 = new List[2];
	List list2 = new ArrayList<>();
	
	list2.add(30);
	list2.add(40);
	list2.add(50);
	
	list1[0].add(list2);
	System.out.println("list1 :"+list1);
}
}