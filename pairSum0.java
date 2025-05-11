import java.util.*;

class pairSum0
{
    public static int closestToZero(int[] arr)
    {
        Arrays.sort(arr);
        int n=arr.length;
        int i=0,j=n-1;
        int sum=arr[i]+arr[j];
        int diff=Math.abs(sum);
        while(i<j)
        {
            if(arr[i]+arr[j]==0)
            return 0;
            if(Math.abs(diff)>Math.abs(arr[i]+arr[j]))
            {
                diff=Math.abs(arr[i]+arr[j]);
                sum=arr[i]+arr[j];
            }
            else if(Math.abs(diff)==Math.abs(arr[i]+arr[j]))
            {
                sum=Math.max(sum,arr[i]+arr[j]);
            }
            if(arr[i]+arr[j]>0)
            j=j-1;
            else
            i=i+1;
        }
        return sum;
    }
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
        System.out.println("The pair sum closest to 0 is "+closestToZero(arr));
    }
}