import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int len=sc.nextInt();int a[]=new int[len];
		System.out.println("Now enter the array elements");
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if (a[j] > a[j+1]) 
				{        
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
			}
		}
		System.out.print("The sorted array is: ");
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}