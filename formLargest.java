import java.util.*;
class formLargest {
    static boolean compare(String s1,String s2)
    {
        return (s1+s2).compareTo(s2+s1)>0;
    }
    static String returnLargest(int[] arr)
    {
        ArrayList<String> nums=new ArrayList<>();
        for(int ele : arr)
        nums.add(Integer.toString(ele));
        Collections.sort(nums, (s1,s2)->compare(s1,s2)?-1:1);
        if(nums.get(0).equals("0"))
        return "0";
        StringBuilder res=new StringBuilder();
        for(String num : nums)
        res.append(num);
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        String res=returnLargest(arr);
        System.out.println("Largest number formed is "+res);
    }
}
