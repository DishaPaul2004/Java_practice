import java.util.*;
class zigZagArray {
    public static void zigzag(int[] arr)
    {
        int i,temp=0,n=arr.length;
        boolean flag=true;
        for(i=0;i<=n-2;i++)
        {
            if(flag)//symbol is <
            {
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else//symbol is >
            {
                if(arr[i]<arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            flag=!(flag);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        zigzag(arr);
        System.out.println("Zigzag array : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
