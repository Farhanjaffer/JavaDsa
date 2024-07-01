public class GCDorHCF {

    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long GCD = 0, LCM =0;
        long a = A, b = B;
        while (B != 0) {
            long temp = B;
            B = A % B;
            A = temp;
        }
        GCD = A;
        LCM = (a*b)/GCD;
        return new Long[]{LCM, GCD};
    }
    public static void main(String[] args) throws Exception {
        Long[] result = lcmAndGcd(12L, 24L);
        System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);
    }
}
