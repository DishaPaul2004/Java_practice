/* An array with n elements is given where each number lies between 1 and (n+1), both inclusive.
The task is to find the missing number */
import java.util.Scanner;

class missingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        int i;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        int xor1=0,xor2=0;
        for(i=0;i<n;i++)
        xor1^=arr[i];
        for(i=1;i<=(n+1);i++)
        xor2^=i;
        int missingNumber=xor1^xor2;
        System.out.println("Missing number is "+missingNumber);
    }
}
