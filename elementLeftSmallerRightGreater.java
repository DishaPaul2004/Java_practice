import java.util.*;
class elementLeftSmallerRightGreater
{
    static int findElement(List<Integer> arr)
    {
        int i,n=arr.size();
        int[] leftMax=new int[n];
        leftMax[0]=arr.get(0);
        for(i=1;i<n;i++)
        leftMax[i]=Math.max(leftMax[i-1],arr.get(i));
        int rightMin=arr.get(n-1);
        for(i=n-2;i>=1;i--)
        {
            int ele=arr.get(i);
            if(ele>=leftMax[i] && ele<=rightMin)
            return ele;
            rightMin=Math.min(ele,rightMin);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element "+(i+1)+" : ");
            int ele=sc.nextInt();
            arr.add(ele);
        }
        int res=findElement(arr);
        System.out.println("The element with the left side smaller and right side greater is "+res);
    }
}