import java.util.*;
class occurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s=sc.nextLine();
        Map<Character, Integer> mp=new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(ch!=' ')
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        System.out.println("C\tF");
        for(Map.Entry<Character, Integer> entry : mp.entrySet())
        System.out.println(entry.getKey()+"\t"+entry.getValue());
    }
}
