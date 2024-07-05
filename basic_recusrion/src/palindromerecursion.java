public class palindromerecursion {
    public static void main(String[] args) {
        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "Was it a car or a cat I saw?";
        
        System.out.println("Test 1: " + test1);
        System.out.println("Is palindrome? " + isPalindrome(test1));
        System.out.println();
        
        System.out.println("Test 2: " + test2);
        System.out.println("Is palindrome? " + isPalindrome(test2));
        System.out.println();
        
        System.out.println("Test 3: " + test3);
        System.out.println("Is palindrome? " + isPalindrome(test3));
    }
    
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}

