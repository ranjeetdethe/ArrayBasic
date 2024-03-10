import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size= sc.nextInt();
		char arr[] = new char[size];

		for(int i=0;i<size;i++){
			System.out.println("Enter array elements : ");
			arr[i]= sc.next().charAt(i);
			
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
