import java.util.*;
class chocolateDistribution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of packets : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the number of chocolates in packet "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Available chocolates in each packet : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        System.out.print("Enter the number of students : ");
        int m=sc.nextInt();
        Arrays.sort(arr);
        int start=-1,end=-1,minDiff=Integer.MAX_VALUE;
        for(i=0;i+m-1<n;i++)
        {
            int diff=arr[i+m-1]-arr[i];
            if(diff<minDiff)
            {
                minDiff=diff;
                start=i;
                end=i+m-1;
            }
        }
        System.out.println("The minimum difference is "+minDiff);
        System.out.println("The required chocolate distribution is : ");
        for(int k=start;k<=end;k++)
        System.out.print(arr[k]+" ");
    }
}
