import java.util.*;
class parenthesesChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
        int flag=0;
        Stack<Character> st=new Stack<>(); 
        for(char ch : s.toCharArray())
        {
            if(ch=='('||ch=='{'||ch=='[')
            st.push(ch);
            else if(!st.isEmpty() && ((ch==')' && st.peek()=='(')||(ch=='}' && st.peek()=='{')||(ch==']' && st.peek()=='[')))
            st.pop();
            else
            {
                flag=1;
                break;
            }
        }
        if(st.isEmpty() && flag!=1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
