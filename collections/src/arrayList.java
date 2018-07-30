import java.util.*;

class arrayList{
	private static List<Integer> arrayListDemo(){
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
		
		list1.add(1);
		//list1.add(0,100);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		System.out.println("test2:"+list1.get(5));
		/*
		//System.out.println("add 10 : "+ list1.add(0, 10));
		System.out.println("set 9 in 0 index :"+list1.set(0,9));
		
		System.out.println("remove 3 : " + list1.remove(3));
		//list1.removeAll(list2);
		//list1.retainAll(list2);
		list1.addAll(list2);	
		
		
		System.out.println(list1);
		//System.out.println("contains 1:"+list1.lastIndexOf(1));
		
		List<Integer> list3 = list1.subList(1, 4);
		list3.add(10);
		*/
		
		
		//list1.remove(0);
		//System.out.println("list3 : " + list3);
		System.out.println("list1 : " + list1);
		/*
		for(int element : list1){
			System.out.println("element:"+element);
		}
		*/
		return list1;
	}
	
	private static void iteratorDemo(List<Integer> lst){
		Iterator<Integer> iterator = lst.iterator();
		while(iterator.hasNext()){
			int element = iterator.next();
			if(element == 6){
				iterator.remove();
			}
			System.out.println("element : "+element);
			System.out.println();
		}
	}
	
	
	public static void main(String args[]){
		List<Integer> ret_lst = new ArrayList<>();
		ret_lst = arrayListDemo();
		System.out.println("ret_lst  before: "+ret_lst);
		iteratorDemo(ret_lst);
		System.out.println("ret_lst  after: "+ret_lst);
	}
}

