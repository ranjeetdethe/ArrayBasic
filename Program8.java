import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size= sc.nextInt();
		int arr[] = new int[size];
		int count=0;

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter age of workers : ");
			arr[i]= sc.nextInt();
			count++;
			
		}
		System.out.println("The count of workers are :"+count);
		System.out.println("The age of workers are as follows: ");
		for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
		}
		
	}
}
