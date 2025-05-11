import java.util.*;
class inversionCount {
    static int mergeCount(int[] arr,int l,int m,int r)
    {
        int n1=m-l+1,n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k,res=0;
        for(i=0;i<n1;i++)
        left[i]=arr[i+l];
        for(j=0;j<n2;j++)
        right[j]=arr[m+1+j];
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k++]=left[i++];
            }
            else
            {
                arr[k++]=right[j++];
                res+=(n1-i);
            }
        }
        while(i<n1)
        {
            arr[k++]=left[i++];
        }
        while(j<n2)
        {
            arr[k++]=right[j++];
        }
        return res;
    }
    static int countInversions(int[] arr,int l,int r)
    {
        int res=0;
        if (l<r)
        {
            int m=(r+l)/2;
            res+=countInversions(arr,l,m);
            res+=countInversions(arr,m+1,r);
            res+=mergeCount(arr,l,m,r);
        }
        return res;
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
        System.out.println("The inversion count is "+countInversions(arr,0,n-1));
    }
}
