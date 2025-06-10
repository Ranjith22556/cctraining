public class isPalindrome {
    static String reverse(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args){
        String s1="radar";
        String s2=reverse(s1);
        if(s1.equals(s2)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
