//Given 2 arrays, X and Y, find the number of pairs such that x^y>y^x.
/*If y>x, then x^y>y^x with some exceptions.
 
Sort array Y[] and for every x in X[], find the index of the smallest number greater than x in Y[] using binary search.
All the numbers after index,i.e.,(n-index) can be added to the count.

1. If x=0, there is no value of x such that x^y>y^x, so 
                count of pairs = 0.

2. If x=1, the only possible value of y for which x^y>y^x is 0, thus, 
                count of pairs = count of 0 in Y[].

3. If x=2, then x^y>y^x is false only when y=2,3 or 4. So, 
                count of pairs = count of 0 in Y[] + count of 1 in Y[] + count of numbers>4 in Y[]

4. If x=3, then x^y>y^x is false only when y=3. So,
                count of pairs = count of 0 in Y[] + count of 1 in Y[] + count of 2 in Y[] + count of numbers>3 in Y[]

5. If x>3, then x^y>y^x is possible only when y=0,1 or greater than x. So,
                count of pairs = count of 0 in Y[] + count of 1 in Y[] + count of numbers greater than x in Y[]

 */
import java.util.*;
class numberOfPairs {
    public static int count(int num,int y[],int N,int noOfY[])
    {
        if(num==0)
        return 0;
        if(num==1)
        return noOfY[0];
        int index=Arrays.binarySearch(y,num);
        int res;
        if(index<0)
        {
            index=Math.abs(index+1);
            res=y.length-index;
        }
        else
        {
            while(index<N && y[index]==num)
            index++;
            res=y.length-index;
        }
        res+=noOfY[0]+noOfY[1];
        if(num==2)
        res-=(noOfY[3]+noOfY[4]);
        if(num==3)
        res+=noOfY[2];
        return res;
        
    }
    public static long countPairs(int x[], int y[], int M, int N) {
        int[] noOfY=new int[5];
        for(int i=0;i<N;i++)
        {
            if(y[i]<5)
            noOfY[y[i]]++;
        }
        Arrays.sort(y);
        long res=0;
        for(int i=0;i<M;i++)
        {
            res+=count(x[i],y,N,noOfY);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("Enter the number of elements in the first array, X : ");
        int m=sc.nextInt();
        int[] X=new int[m];
        for(i=0;i<m;i++)
        {
            System.out.print("Enter the element "+(i+1)+" of X : ");
            X[i]=sc.nextInt();
        }
        System.out.print("Enter the number of elements in the second array, Y : ");
        int n=sc.nextInt();
        int[] Y=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element "+(i+1)+" of Y : ");
            Y[i]=sc.nextInt();
        }
        System.out.println("X array : ");
        for(i=0;i<m;i++)
        System.out.print(X[i]+" ");
        System.out.println();
        System.out.println("Y array : ");
        for(i=0;i<n;i++)
        System.out.print(Y[i]+" ");
        System.out.println();
        long numPairs=countPairs(X, Y, m, n);
        System.out.println("The number of pairs is "+numPairs);
    }
}
