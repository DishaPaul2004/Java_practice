/*The program rearranges the input array without using any extra space such that 
the maximum element is the 1st element
the minimum element is the 2nd element
the 2nd maximum element is the 3rd element
the 2nd minimum element is the 4th element
and so on */
import java.util.*;
class rearrangeArray {
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
        Arrays.sort(arr);
        int maxIdx=n-1,minIdx=0;
        int M=arr[n-1]+1;
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]+=(arr[maxIdx]%M)*M;
                maxIdx--;
            }
            else
            {
                arr[i]+=(arr[minIdx]%M)*M;
                minIdx++;
            }
        }
        for(i=0;i<n;i++)
        {
            arr[i]=arr[i]/M;
        }
        System.out.println("Rearranged array is : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
