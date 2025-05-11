import java.util.Scanner;

class equilibriumPoint {
    public static int findEquilibriumPoint(int[] arr)
    {
        int i,pivot,sufSum,n=arr.length,total=0,preSum=0;
        for(i=0;i<n;i++)
        total+=arr[i];
        for(pivot=0;pivot<n;pivot++)
        {
            sufSum=total-preSum-arr[pivot];
            if(preSum==sufSum)
            return pivot;
            preSum+=arr[pivot];
        }
        return -1;
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
        int res=findEquilibriumPoint(arr);
        System.out.println("The equilibrium point is "+res+" and the element is "+arr[res]);
    }
}
