import java.util.*;
class spirallyTraverse {
    public static ArrayList<Integer> spiral(int[][] mat)
    {
        int m=mat.length,n=mat[0].length;
        int left=0,top=0,right=n-1,bottom=m-1;
        ArrayList<Integer> res=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            res.add(mat[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
            res.add(mat[i][right]);
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                res.add(mat[bottom][i]);
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                res.add(mat[i][left]);
                left++;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m=sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n=sc.nextInt();
        int[][] mat=new int[m][n];
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("Enter the element : ");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        ArrayList<Integer> res=spiral(mat);
        System.out.print("Result : ");
        for(i=0;i<res.size();i++)
        System.out.print(res.get(i)+" ");
    }
}
