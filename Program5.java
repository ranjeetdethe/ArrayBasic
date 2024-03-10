import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size= sc.nextInt();
		int arr[] = new int[size];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter array elements : ");
			arr[i]= sc.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<10){
				System.out.println(arr[i]+" is less than 10");
			}
		}
	}
}
