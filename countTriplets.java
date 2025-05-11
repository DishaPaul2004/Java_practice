/*Given an array of distinct positive integers arr[] of length N
the task is to count all the triplets such that the sum of two elements equals the third element. */
import java.util.*;
class countTriplets {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        int i,j,k;
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
        Arrays.sort(arr);
        System.out.println("The triplets are : ");
        for(k=n-1;k>=2;k--)
        {
            i=0;
            j=k-1;
            while(i<j)
            {
                int sum=arr[i]+arr[j];
                if(sum==arr[k])
                {
                    System.out.println(arr[i]+" + "+arr[j]+" = "+arr[k]);
                    i++;
                    j--;
                }
                else if(sum<arr[k])
                i++;
                else
                j--;
            }
        }
        
    }
}
