import java.util.*;

class reverseArrayInGroups {
    public static void reverseInGroups(ArrayList<Long> arr,int k)
    {
        int n=arr.size();
        for(int i=0;i<n;i+=k)
        {
            int left=i;
            int right=Math.min(i+k-1,n-1);
            long temp;
            while(left<right)
            {
                temp=arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left++;
                right--;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Long> arr=new ArrayList<>();
        int choice=1,f=0;
        while(choice==1)
        {
            System.out.print("Enter the element "+(f+1)+" : ");
            Long num=sc.nextLong();
            arr.add(num);
            System.out.print("Enter 1 to continue and 0 to discontinue : ");
            choice=sc.nextInt();
            f=f+1;
        }
        System.out.println();
        System.out.println("Original array : ");
        for(int i=0;i<arr.size();i++)
        System.out.print(arr.get(i)+" ");
        System.out.println();
        System.out.print("Enter the group size : ");
        int k=sc.nextInt();
        reverseInGroups(arr, k);
        System.out.println("Modified array : ");
        for(int i=0;i<arr.size();i++)
        System.out.print(arr.get(i)+" ");
    }
}
