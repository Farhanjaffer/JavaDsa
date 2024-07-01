public class armstrongnum {

    public static boolean isarmstrong(int x) {
        int y = x;
        int num = 0;
        int total = 0;
        while(x>0){
            num = x%10;
            total = total + num*num*num;
            x=x/10;
        }
        if(total == y) return true;
        else return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isarmstrong(153));
    }
}
