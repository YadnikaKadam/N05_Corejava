package dayelevenorg.tnsif.uncheckedexception;
//Program to demonstrate on ArrayIndexOutOfBoundsException
public class ArrayIndexOfBoundExecutor {
	
	static void print(int arr[])
	{
		try {
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
	}

	public static void main(String[] args) {
		int arr[]= {12,4,5};
		print(arr);

	}

}
