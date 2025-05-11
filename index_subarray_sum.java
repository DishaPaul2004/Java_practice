/*Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray
 whose sum equals a specified value target.
 You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. 
You need to find the first subarray whose sum is equal to the target.
Note: If no such array is possible then, return [-1].*/
import java.util.*;
class index_subarray_sum
{
    public ArrayList<Integer> findSubarray(int[] array, int target)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int i,n=array.length;
        int start=0,end=0,curr=0;//initializing starting and ending indices as well as current sum
        for(i=0;i<n;i++)
        {
            curr+=array[i];//Add array element to current sum
            if(curr>=target)//checking if the current sum exceeds the target sum
            {
                end=i;//initialize end to the current index
                while(curr>target && start<end)
                {
                    curr-=array[start];//start removing elements from start until curr becomes less than or equal to target
                    start++;//increment the start index
                }
            }
            if(curr==target)
            {
                res.add(start+1);//starting index for 1-based positioning
                res.add(end+1);//ending index for 1-based positioning
                return res;
            }
        }
        res.add(-1);
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n=sc.nextInt();
        int i;
        int[] array=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element "+(i+1)+" : ");
            array[i]=sc.nextInt();
        }
        System.out.println("Original array : ");
        for(i=0;i<n;i++)
        System.out.print(array[i]+" ");
        System.out.println();
        System.out.print("Enter the target sum : ");
        int target=sc.nextInt();
        index_subarray_sum ob=new index_subarray_sum();
        List<Integer> res=ob.findSubarray(array,target);
        if(res.contains(-1))
        System.out.println("The array does not contain any subarray with the given sum");
        else
        {
            System.out.println("The given subarray is : ");
            int start=res.get(0)-1;
            int end=res.get(1)-1;
            for(int k=start;k<=end;k++)
            System.out.print(array[k]+" ");
        }
    }
}