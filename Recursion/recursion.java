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
        return n + prob2_sumOneToN( n-1 );
    }
    public static int prob3_fabonacci(int n ){
        //Write a Java recursive method to calculate the nth Fibonacci number.
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }
        return prob3_fabonacci( n-1 ) + prob3_fabonacci( n-2 );
    }
    public static Boolean prob4_isPalindrome(String str ){
        //Recursive String Palindrome Check
        if (str.length() <= 1){
            return true;
        }
        
        if (str.charAt(0) != str.charAt(str.length() - 1) ){
            return false;
        }

        String remain = str.substring(1, str.length() - 1);
        return prob4_isPalindrome(remain);
        
    }
    public static int prob5_exponential(int n ,int m ){
        //Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
        if (m == 0){
            return 1;
        }
        int halfsqr= prob5_exponential(n ,m/2 );
        int halfsqrt=halfsqr *halfsqr;

        if(m % 2 != 0){
            halfsqrt=n* halfsqrt;
        }
        return halfsqrt;
    }
    public static String prob6_String_Reversal(String str) {
    if (str.isEmpty() || str.length() == 1) {
        return str;
    }
    // Take "abc":
    //     reverse("abc")
    //     → reverse("bc") + 'a'
    //     reverse("bc")
    //     → reverse("c") + 'b'
    //     reverse("c")
    //     → "c" (base case)
    //Now backtrack:
    //     "c" + 'b' = "cb"
    //     "cb" + 'a' = "cba"
    return prob6_String_Reversal(str.substring(1)) + str.charAt(0);
    }
    
    
    public static int prob7_GCD(int a , int b ){
        //Write a Java recursive method to find the greatest common divisor (GCD) of two numbers
        if (b == 0) {
        return a;
        }
        return prob7_GCD(b , a%b);
    }
    public static int prob8_Element_Count( int arr[] , int index , int key ){
    //Write a Java recursive method to count the number of occurrences of a specific element in an array.
    if (index == arr.length){
            return 0 ;
        }

        int count =  prob8_Element_Count( arr,index+1,key );
        
        if(arr[index] == key){
            count ++ ;
        }
        return count;
    }
    public static int prob9_Sum_of_odd( int arr[] , int index) {
        //Recursive Sum of Odd Numbers in Array
        if (index == arr.length){
            return 0 ;
        }
        int sum = prob9_Sum_of_odd(arr, index + 1);
         if (arr[index] % 2 != 0) {
            sum += arr[index];
        }
        return sum;
    }
    public static int prob10_string_length( String str , int index ){
    //Write a Java recursive method to find the length of a given string

    if (str.isEmpty()){
            return 0 ;
        }

        int count =  prob10_string_length( str.substring(1),index+1 );
        count ++ ;
        return count;
    }
    //Write a Java recursive method to generate all possible permutations of a given string.

    public static int prob12_maxElement(int[] arr, int left, int right){
        //Write a Java recursive method to find the maximum element in an array.
        if (left == right) {
        return arr[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = prob12_maxElement(arr, left, mid);
        int maxRight = prob12_maxElement(arr, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }
    
    public static int prob13_Product(int[] arr, int left, int right){
        //Write a Java recursive method to calculate the product of all numbers in an array. 

        if (left == right) {
        return arr[left];
        }

        int mid = (left + right) / 2;
        int maxLeft = prob13_Product(arr, left, mid);
        int maxRight = prob13_Product(arr, mid + 1, right);

        return maxLeft * maxRight;
    }
    
    public static int prob13_Add(int[] arr, int left, int right){
        //Write a Java recursive method to calculate the sum of all numbers in an array. 

        if (left == right) {
        return arr[left];
        }

        int mid = (left + right) / 2;
        int maxLeft = prob13_Add(arr, left, mid);
        int maxRight = prob13_Add(arr, mid + 1, right);

        return maxLeft + maxRight;
    }
    public static boolean prob15_isSorted(int[] arr , int index){
        //Write a Java recursive method to check if a given array is sorted in ascending order.
        if (index == arr.length-1){
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return prob15_isSorted(arr, index + 1);
    }


    public static void main (String args[]){
        // System.out.println("Recursive Factorial Calculation :"+ prob1_factorial(10));
        // System.out.println("Recursive Sum from 1 to N :" + prob2_sumOneToN(9));
        // System.out.println("Recursive Nth Fibonacci Number : "+prob3_fabonacci(10));
        // System.out.println("Recursive String Palindrome Check :" + prob4_isPalindrome("TuuT") );
        // System.out.println("Recursive exponential   : "+prob5_exponential(2,10));
        // System.out.println("String Reversal : " + prob6_String_Reversal("java"));
        // System.out.println("Greatest Common Divisor :" + prob7_GCD(12,15));
    
        //int[] numbers = {1,2,3,4,5,6,7,7,8};
        // System.out.println("Recursive Element Count in Array :" + prob8_Element_Count(numbers , 0 , 7));
        // System.out.println("Recursive Sum of Odd Numbers in Array : " + prob9_Sum_of_odd(numbers , 0) );

        // System.out.println(" Recursive String Length :" + prob10_string_length( "name" , 0));
        // System.out.println(" " + prob11);
        // System.out.println(" Recursive Maximum in Array :" + prob12_maxElement( numbers , 0 , (numbers.length -1) ));
        // System.out.println(" Recursive Product in Array :" + prob13_Product( numbers , 0 , (numbers.length -1 )));
        // System.out.println(" Recursive sum in Array :" + pr```ob13_Add( numbers , 0 , (numbers.length -1 )));
        //System.out.println(" Recursive Array Sorted Check :  " + prob15_isSorted(numbers , 0) );

        
    }
}