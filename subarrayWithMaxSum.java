import java.util.Scanner;

class subarrayWithMaxSum {
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
        int maxSumEnding=arr[0],sum=arr[0],currStart=0,resStart=0,resEnd=0;
        for(i=1;i<n;i++)
        {
            if((maxSumEnding+arr[i])<arr[i])
            {
                maxSumEnding=arr[i];
                currStart=i;
            }
            else
            {
                maxSumEnding+=arr[i];
            }
            if(maxSumEnding>sum)
            {
                sum=maxSumEnding;
                resStart=currStart;
                resEnd=i;
            }
        }
        System.out.println("The maximum subarray sum is "+sum);
        System.out.println("The subarray with the maximum sum is : ");
        for(i=resStart;i<=resEnd;i++)
        System.out.print(arr[i]+" ");
    }
}
