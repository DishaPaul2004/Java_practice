import java.util.Scanner;

class sort012 {
    public static void swap(int[] arr,int i,int j)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void sort(int[] arr)
    {
        int n=arr.length;
        int low=0,high=n-1,mid=0;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,high);
                mid++;
                high--;
            }
        }
    }
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
        sort(arr);
        System.out.println("Sorted array is : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
