import java.util.*;

class arrayLeaders {
    public static ArrayList<Integer> leaders(int arr[]) {
        int n=arr.length;
        int i,maxRight=arr[n-1];
        ArrayList<Integer> res=new ArrayList<>();
        res.add(maxRight);
        for(i=n-2;i>=0;i--)
        {
            if(arr[i]>=maxRight)
            {
                maxRight=arr[i];
                res.add(maxRight);
            }
        }
        Collections.reverse(res);
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
        ArrayList<Integer> result=leaders(arr);
        System.out.println("The leaders of the array are : ");
        for(i=0;i<result.size();i++)
        System.out.print(result.get(i)+" ");
    }
}
