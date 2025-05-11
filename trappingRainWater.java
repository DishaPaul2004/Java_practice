import java.util.*;

class trappingRainWater {
    public static int measureRain(int[] heights)
    {
        int n=heights.length;
        int res=0;
        int left=1,right=n-2;
        int lMax=heights[left-1],rMax=heights[right+1];
        while(left<=right)
        {
            if(lMax<rMax)
            {
                res+=Math.max(0,lMax-heights[left]);
                lMax=Math.max(lMax,heights[left]);
                left+=1;
            }
            else
            {
                res+=Math.max(0,heights[right]-rMax);
                rMax=Math.max(rMax,heights[right]);
                right-=1;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of blocks : ");
        int n=sc.nextInt();
        int i;
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the height of block "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is : ");
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Maximum amount of water that can be trapped is "+measureRain(arr));
    }
}
