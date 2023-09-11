package org.tnsif.singledimenssionarray;
//program to demonstrate on array objects
public class ArrayOfObjectExecutor {

	public static void main(String[] args) {
		Employee arr[]=new Employee[2];
		arr[0]=new Employee(101, "Yadnia Kadam", 55000.8);
		arr[1]=new Employee(102, "Mitali Bharambe", 45000.7);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
		
	}

}
