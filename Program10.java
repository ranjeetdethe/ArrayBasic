import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size= sc.nextInt();
		int arr[] = new int[size];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Exam Seat number : ");
			arr[i]= sc.nextInt();
			
		}
		System.out.println("Exam seat numbers are as: ");

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
