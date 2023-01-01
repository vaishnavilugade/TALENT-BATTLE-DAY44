import java.util.*;
class ArrayEvenOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size,evencount=0,oddcount=0;
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements :");
		for(int i=0;i<size;i++){
			int x=sc.nextInt();
			arr[i]=x;
		}
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
		}
			System.out.println("Number of even elements :"+evencount);
			System.out.println("Number of odd elements :"+oddcount);
		
	}
}


