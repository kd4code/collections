package UtilityMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee 
{
  int id ;
  String Name;
  
  public Employee(int id, String name) {
	super();
	this.id = id;
	Name = name;
}

@Override
 public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + "]";		
}
  
}
class Sortid implements Comparator<Employee>
{
  public int compare(Employee e1,Employee e2)
  {
	 if(e1.id==e2.id)
		 return 0;
	 else if(e1.id>e2.id)
		 return 1;
	 else 
		 return -1;
  }
}
public class CollectionsDemo {
    public static void main(String[] args) {
		Employee e1=new Employee(10,"Ram");
		Employee e2=new Employee(20,"Shyam");
		Employee e3=new Employee(15,"Sita");
		List al=new ArrayList<>();
		Sortid sid=new Sortid();
		//Collections.addAll(al,e1,e2,e3);
		Collections.addAll(al,"Ram","Sita","Shyam","Lakshman");
		System.out.println("Created ArrayList:"+al);
	    Collections.sort(al);	
	    System.out.println("After sorting:"+al);
	    //System.out.println("Searching:"+Collections.binarySearch(al,e3,sid));
	    //Collections.sort(al,Collections.reverseOrder(sid));
	    //System.out.println("Reverse Sorted :"+al);
	    
	}
}
