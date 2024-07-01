public class palindrome {

    public static boolean isPalindrome(int x) {
        char ch;
        String nstr = "";
        String s=String.valueOf(x); 
        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i); 
            nstr= ch+nstr;
        }
        if(nstr.equals(s)) return true;
        else return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(-121));
    }
}
