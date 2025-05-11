import java.util.Scanner;

class kadaneAlgorithm {
    public static void main(String args[])
    {
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
        int maxSumEnding=arr[0],sum=arr[0];
        for(i=1;i<n;i++)
        {
            maxSumEnding=Math.max(maxSumEnding+arr[i],arr[i]);
            sum=Math.max(maxSumEnding,sum);
        }
        System.out.println("The maximum subarray sum is "+sum);
    }
}
