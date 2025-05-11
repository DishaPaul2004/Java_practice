import java.util.Arrays;
import java.util.Scanner;

class minPlatforms {
    public static int findPlatform(int arr[], int dep[]) {
        int result=1,platforms=1;
        int i=1,j=0;
        int n=arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(i<n && j<n)
        {
            /*If the current arrival time is less than or equal to the current departure time
            it means a new platform is needed, so we have to increment the platform count and move the arrival pointer forward. */
            if(arr[i]<=dep[j])
            {
                platforms++;
                i++;
            }
            /*If the current arrival time is greater than the current departure time
            it means a train has left, freeing up a platform, so we decrement the platform count and move the departure pointer forward. */
            else
            {
                platforms--;
                j++;
            }
            result=Math.max(platforms,result);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("Enter the number of elements in the arrival array, X : ");
        int m=sc.nextInt();
        int[] X=new int[m];
        for(i=0;i<m;i++)
        {
            System.out.print("Enter the time "+(i+1)+" of X : ");
            X[i]=sc.nextInt();
        }
        System.out.print("Enter the number of elements in the departure array, Y : ");
        int n=sc.nextInt();
        int[] Y=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the time "+(i+1)+" of Y : ");
            Y[i]=sc.nextInt();
        }
        System.out.println("Arrival array : ");
        for(i=0;i<m;i++)
        System.out.print(X[i]+" ");
        System.out.println();
        System.out.println("Departure array : ");
        for(i=0;i<n;i++)
        System.out.print(Y[i]+" ");
        System.out.println();
        System.out.println("Minimum number of platforms required : "+findPlatform(X, Y));
    }
}
