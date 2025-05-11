import java.util.*;
class twoSum {
    static int[] twoNumberSum(int[] arr,int target)
    {
        Arrays.sort(arr);
        int n=arr.length;
        int left=0,right=n-1,ele1=0,ele2=0,flag=0;
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                ele1=arr[left];
                ele2=arr[right];
                flag=1;
                break;
            }
            else if(sum>target)
            right-=1;
            else
            left+=1;
        }
        if(flag==1)
        return new int[]{ele1,ele2};
        else
        return new int[]{};
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
            System.out.print("Enter the array element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        System.out.print("Enter the target sum : ");
        int target=sc.nextInt();
        int[] res=twoNumberSum(arr,target);
        if(res.length==0)
        System.out.println("No such pair present");
        else
        System.out.println("The pair is "+res[0]+" and "+res[1]);
    }
}
