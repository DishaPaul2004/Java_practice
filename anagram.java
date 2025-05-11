/*Write a program that takes 2 strings as input and determines if they are anagrams of each other.
 * The first line contains an integer T, the number of test cases.
 * For each test case, the next 2 lines contain the strings s1 and s2, respectively consisting of lowercase English letters.
 * Print "YES" if they are anagrams, otherwise "NO".
 */
import java.util.*;
 class anagram{
    static String checkAnagram(String s1,String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int i,n1=s1.length(),n2=s2.length();
        int[] freq=new int[26];
        if(s1.length()!=s2.length())
        return "NO";
        for(i=0;i<n1;i++)
        freq[s1.charAt(i)-'a']++;
        for(i=0;i<n2;i++)
        freq[s2.charAt(i)-'a']--;
        for(i=0;i<26;i++)
        {
            if(freq[i]!=0)
            return "NO";
        }
        return "YES";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of test cases : ");
        int tc=sc.nextInt();
        String[] inputs=new String[tc*2];
        String[] result=new String[tc];
        int i;
        for(i=0;i<tc*2;i++)
        {
            System.out.print("Enter the string : ");
            inputs[i]=sc.next();
        }
        for(i=0;i<tc;i++)
        {
            if(i==0)
            result[i]=checkAnagram(inputs[i],inputs[i+1]);
            else
            result[i]=checkAnagram(inputs[i+1],inputs[i+2]);
        }
        System.out.println("RESULTS");
        for(i=0;i<tc;i++)
        System.out.println(result[i]);
    }
 }