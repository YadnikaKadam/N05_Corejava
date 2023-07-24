package org.tnsif.operators;
import java.util.Scanner;
public class Blooddonate {
public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
				int age=s.nextInt();
				int weight=s.nextInt();
				if(age>=18 && weight>=50)
				{
					System.out.println("Donate Blood");

				}
				else
				{
					System.out.println("Can not donate blood");
	
				}
				
				

		}

	}


