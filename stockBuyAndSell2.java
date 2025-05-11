//One transaction allowed
import java.util.*;
class stockBuyAndSell2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of days : ");
        int n=sc.nextInt();
        int[] prices=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the stock price on each day : ");
            prices[i]=sc.nextInt();
        }
        System.out.println("Original stock prices on every day : ");
        for(i=0;i<n;i++)
        System.out.print(prices[i]+" ");
        System.out.println();
        int maximumProfit=0;
        int minPrice=prices[0];
        for(i=1;i<n;i++)
        {
            minPrice=Math.min(minPrice,prices[i]);
            maximumProfit=Math.max(maximumProfit,prices[i]-minPrice);
        }
        System.out.println("The maximum profit is "+maximumProfit);
    }
}
