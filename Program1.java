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
		System.out.println("Enter Array Elements:");

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
