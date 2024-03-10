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
			if(i%2==1){
				sum+=arr[i];
			}
		}
		System.out.println("The sum of odd array elements is : "+sum);
	}
}
