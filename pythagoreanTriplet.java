import java.util.*;

class pythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        int i,j,k,f=0;
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
        Arrays.sort(arr);
        for(k=n-1;k>=0;k--)
        {
            i=0;
            j=k-1;
            while(i<j)
            {
                double sum=Math.pow(arr[i],2)+Math.pow(arr[j],2);
                if(sum==Math.pow(arr[k],2))
                {
                    System.out.println("The Pythagorean triplet is "+arr[i]+" , "+arr[j]+" and "+arr[k]);
                    f=1;
                    break;
                }
                else if(sum<Math.pow(arr[k],2))
                i++;
                else
                j--;
            }
            if(f==1)
            break;
        }
        if(f==0)
        System.out.println("No such triplets exist");
    }
}
/*
 class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int i,n=arr.length,max=0;
        for(i=0;i<n;i++)
        max=Math.max(arr[i],max);
        boolean[] visited=new boolean[max+1];
        for(int ele : arr)
        visited[ele]=true;
        for(i=1;i<max+1;i++)
        {
            if(!visited[i])
            continue;
            for(int j=1;j<max+1;j++)
            {
                if(!visited[j])
                continue;
                int k=(int)Math.sqrt(i*i+j*j);
                if((k*k)!=(i*i+j*j)||k>max)
                continue;
                if(visited[k])
                return true;
            }
        }
        return false;
    }
}
 */