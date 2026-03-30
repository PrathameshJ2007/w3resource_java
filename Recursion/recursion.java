public class recursion{

    public static int prob1_factorial(int n ){
        //Write a Java recursive method to calculate the factorial of a given positive integer.
        if(n==0){
            return 1;
        }
        int fnm1= prob1_factorial(n-1);
        return n * fnm1;
    }
    public static int prob2_sumOneToN(int n ){
        //Write a Java recursive method to calculate the sum of all numbers from 1 to n.
        if(n==0){
            return 0;
        }
        return n + prob2_sumOneToN(int n -1 );
    }
    public static int prob3_fabonacci(){
        //Write a Java recursive method to calculate the nth Fibonacci number.
    }
    //Recursive String Palindrome Check
    public static int prob5_exponential(int n ,int m ){
        //Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
        return 
    }

    public static void main (String args[]){
        System.out.println("Recursive Factorial Calculation :"+ prob1_factorial(10));
        System.out.println("Recursive Sum from 1 to N :" + prob2_sumOneToN(9));
    }
}