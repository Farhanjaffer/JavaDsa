public class countdigits_a {

    static int pattern1(int N)
 {
    int count = 0;
     // This is the outer loop which will loop for the rows.
     while (N>0) {
        count++;
        N = N/10;
     }
     return count;
 }
    public static void main(String[] args) throws Exception {
        System.out.println(pattern1(24));
    }
}
