import java.util.Scanner;

class maxDifference {
    static int findMaxDiff(int[] arr)
    {
        int i,j,maxDiff,n=arr.length;
        int[] Lmin=new int[n];
        int[] Rmax=new int[n];
        Lmin[0]=arr[0];
        for(i=1;i<n;i++)
        Lmin[i]=Math.min(Lmin[i-1],arr[i]);
        Rmax[n-1]=arr[n-1];
        for(i=n-2;i>=0;i--)
        Rmax[i]=Math.max(Rmax[i+1],arr[i]);
        i=0;
        j=0;
        maxDiff=-1;
        while(i<n && j<n)
        {
            if(Lmin[i]<=Rmax[j])
            {
                maxDiff=Math.max(maxDiff,j-i);
                j=j+1;
            }
            else
            i=i+1;
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum difference = "+findMaxDiff(arr));
    }
}
