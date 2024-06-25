class q12{
    static void pattern1(int N)
 {
     // This is the outer loop which will loop for the rows.
     for (int i = 0; i < N; i++)
     {
         int x = 0;
         // This is the inner loop which here, loops for the columns
         // as we have to print a rectangular pattern.
         for (int j = 0; j < i+1; j++)
         {
             System.out.print(j+1);
         }
         for (int j = 0; j < (2*N - 2*(i+1)); j++)
         {
             System.out.print(" ");
         }
         for (int j = i+1; j > 0; j--)
         {
             System.out.print(j);
         }
 
          // As soon as N stars are printed, we move to the
         // next row and give a line break otherwise all stars
         // would get printed in 1 line.
         System.out.println();
     }
 }
 
     public static void main(String[] args) {
         
         // Here, we have taken the value of N as 5.
         // We can also take input from the user.
         int N = 4;
         pattern1(N);
     }
 }