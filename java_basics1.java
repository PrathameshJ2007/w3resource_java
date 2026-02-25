//Prob 46
//Prob 46
import java.util.*;
import java.nio.charset.Charset;//Prob 40
import java.io.Console; //Prob 42
import java.io.File; //Prob 45
import java.text.SimpleDateFormat;//Prob 46

public class java_basics1 {

    public static void Prob01_Hello_and_Name_Printer(){
        System.out.println("hello" );
        System.out.println("name" );
    }

    public static void Prob02_sum_of_two(){
        int sum = 89+98;
        System.out.println(sum );
    }
    public static void Prob03_Division_of_Two_Numbers(){
        int div = 89/98;
        System.out.println(div);
    }
    public static void Prob04_arithmetic_operation(){
        int a = -5 + 8 * 6;
        int b = (55+9) % 9 ;
        int c = 20 + -3*5 / 8 ;
        int d = 5 + 15 / 3 * 2 - 8 % 3 ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);      
    }
    public static void Prob05_multiplication_table(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        // Read and store the first number
        int num1 = sc.nextInt();
        
        // Prompt the user to input the second number
        System.out.print("Input second number: ");
        // Read and store the second number
        int num2 = sc.nextInt();
        // Calculate the product of the two numbers and display the result
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
        sc.close();
    }
    public static void Prob06_Basic_Arithmetic_Operations(){
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input the first number
        System.out.print("Input first number: ");
        // Read and store the first number
        int num1 = in.nextInt();
        
        // Prompt the user to input the second number
        System.out.print("Input second number: ");
        // Read and store the second number
        int num2 = in.nextInt();
        
        // Calculate and print the sum of the two numbers
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        
        // Calculate and print the difference of the two numbers
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        
        // Calculate and print the product of the two numbers
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        
        // Calculate and print the division of the two numbers
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        
        // Calculate and print the remainder of the division of the two numbers
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        in.close();    
    }
    public static void Prob07_Multiplication_Table(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        for (int i = 1 ; i<=10 ;i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
        in.close();
    }
    public static void Prob08_pattern_Display(){
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

    }
    public static void Prob09_Expression_Evaluation(){
        System.out.println("TEST DATA :");
        System.out.println("((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))");
        System.out.println("EXPECTED OUTPUT");
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
    public static void Prob10_Formula_Computation(){
        System.out.println("TEST DATA :");
        System.out.println("(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))");
        System.out.println("EXPECTED OUTPUT");
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));        
    }
    public static void Prob11_circle_area_parameter(){
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
    public static void Prob12_Average_of_Three_Numbers(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        System.out.print("Input third number: ");       
        int num3 = in.nextInt();      
        System.out.print("Input fourth number: ");      
        int num4 = in.nextInt();       
        System.out.print("Enter fifth number: ");      
        int num5 = in.nextInt();      
        System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
        in.close();

    }
    public static void Prob13_Rectangle_Area_and_Perimeter(){
        
        final double width = 5.6;
        final double height = 8.5;
        double perimeter = 2 * (height + width);
        double area = width * height;			
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
    public static void Prob14_American_Flag_Display(){
        // Print a pattern of asterisks and equal signs to create a design
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        
        // Print a row of equal signs to complete the design
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    
    }
    public static void Prob15_Swap_Variables(){
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + b);

    }
    public static void Prob16_Face_Printer(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
    public static void Prob17_binary_addition(){
    }
    public static void Prob18_binary_multipliction(){
    }
    public static void Prob19_dec_to_bin(){
    }
    public static void Prob20_dec_to_hex(){
    }
    public static void Prob21_dec_to_octal(){
    }
    public static void Prob22_bin_to_dec(){
    }
    public static void Prob23_bin_to_hex(){
    }
    public static void Prob24_bin_to_octal(){
    }
    public static void Prob25_octal_to_dec(){
    }
    public static void Prob26_octal_to_bin(){
    }
    public static void Prob27_octal_to_hex(){
    }
    public static void Prob28_hex_to_dec(){
    }
    public static void Prob29_hex_to_bin(){
    }
    public static void Prob30_hex_to_octal(){
    }
    public static void Prob31_Check_Java_Installation(){
        System.out.println("\nJava Version: " + System.getProperty("java.version"));     
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }
    public static void Prob32_Compare_Two_Numbers(){
        Scanner input = new Scanner(System.in);
        int number1; // First number to compare
        int number2; // Second number to compare
        System.out.print("Input first integer: ");
        number1 = input.nextInt(); 
        System.out.print("Input second integer: ");
        number2 = input.nextInt(); 
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
        input.close();

    }
    public static void Prob33_sumdjt (){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0 ;
        while(num != 0){
            sum += num%10;
            num /= 10 ;
        }
        System.out.print(sum);
        sc.close();
         
    }

    public static void Prob34_hexArea(){
        Scanner sc = new Scanner(System.in);
        double Slen = sc.nextDouble(); 
        System.out.println("Area of Hexagon : " + (6 * Math.pow(Slen,2))/(4 * Math.tan((Math.PI/6))));
        sc.close();
    }
    public static void Prob35_Area(){
        Scanner sc = new Scanner(System.in);
        double sides = sc.nextDouble();
        double Slen = sc.nextDouble(); 
        System.out.println("Area of Hexagon : " + (sides * Math.pow(Slen,2))/(4 * Math.tan((Math.PI/sides))));
        sc.close();
    }
    public static void Prob36_Dist_bw_two(){
        Scanner sc = new Scanner(System.in);
        double lat1 = sc.nextDouble();
        double lat2 = sc.nextDouble();
        double lon1 = sc.nextDouble();
        double lon2 = sc.nextDouble();
        double distance =  6371.01 * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
        System.out.println("The distance between the two points is : " + distance + " km");
        sc.close();
    }
    public static void Prob37_reverse_array(){
        Scanner sc = new Scanner(System.in);
        char[] sentenceC = sc.nextLine().toCharArray();
        int start = 0;
        int end = sentenceC.length - 1;
        while(start<end){
            char temp = sentenceC[start];
            sentenceC[start] = sentenceC[end] ;
            sentenceC[end] = temp ;
            start ++ ;
            end -- ;
        }
        for (int i = 0 ; i<= sentenceC.length - 1 ; i++){
            System.out.print(sentenceC[i]);
        }        
        sc.close();
    }
    public static void Prob38_Count_Characters_in_String(){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char[] sentenceC = sentence.toCharArray();   
        int start = 0 , end = sentenceC.length - 1;
        
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;
        for (int i = start ; i<=end ; i++){
            int ascii = (int) sentenceC[i];
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                letters++;
            }
            else if (ascii == 32) {
                spaces++;
            }
            else if (ascii >= 48 && ascii <= 57) {
                numbers++;
            }
            else {
                others++;
            }
        }
        // Their method 
        // if (Character.isLetter(ch[i])) {
        //     letter++;
        // }
        // else if (Character.isDigit(ch[i])) {
        //     num++;
        // }
        // else if (Character.isSpaceChar(ch[i])) {
        //     space++;
        // } else { other++; }
        System.out.println("string :  " + sentence);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
        sc.close();
    }
    public static void Prob39_Unique_Three_Digit_Numbers(){
        int amount = 0; // Initialize a counter for three-digit numbers
        
        // Iterate through three nested loops to generate all unique three-digit numbers
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    // Check if 'i,' 'j,' and 'k' are all different (not equal)
                    if (k != i && k != j && i != j) {
                        amount++; // Increment the counter
                        System.out.println(i + "" + j + "" + k); // Print the generated three-digit number
                    }
                }
            }
        }
        
        // Display the total number of generated three-digit numbers
        System.out.println("Total number of the three-digit-number is " + amount);
    }
    public static void Prob40_list_char_array(){
        System.out.println("List of available character sets: ");
        
        // Iterate through the available character sets and print their names
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }

    }
    public static void Prob41_ASCII_Value_Finder(){
        int chr = 'Z';
        System.out.println("The ASCII value of Z is: " + chr);
    }
    public static void Prob42_Input_and_Display_password(){
        // Declare a Console variable 'cons'.
        Console cons;

        // Check if the system console is available.
        if ((cons = System.console()) != null) {
            // Declare a character array 'pass_ward' to store the password.
            char[] pass_ward = null;

            try {
                // Prompt the user to input their password.
                pass_ward = cons.readPassword("Input your Password:");

                // Display the password to the console.
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                // Ensure that the password array is securely cleared.
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            // If the system console is not available, throw a runtime exception.
            throw new RuntimeException("Can't get the password... No console");
        }
    }
    public static void Prob43_Twinkle_Poem_Formatter(){
        System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");
    }
    public static void Prob44_Compute_n_nn_nnn(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum1 = num1 + ((num1*10)+num1) + ((num1*100)+(num1*10)+(num1));
        System.out.println(num1 + " + " + ((num1*10)+num1) + " + " + ((num1*100)+(num1*10)+(num1)));
        System.out.println("sum = "+sum1);
        sc.close();
    }
    public static void Prob45_file_size_finder(){
         System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
    }
    public static void Prob46_system_time(){
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }
    public static void Prob47_formatted_system_time(){
        // Create a SimpleDateFormat with a specific date and time format
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		// Set the time zone for the calendar to GMT
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		// Display the current date and time in the specified format
		System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
    }
    public static void Prob48_Print_Odd_Numbers(){
        int i = 1;
        while(i<100){
            System.out.println(i);
            i+=2;
        }
    }
    public static void Prob49_check_even_odd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check odd/even : ");
        int i = sc.nextInt();
        if(i%2==0){
            System.out.print('1');
        }else{
            System.out.print('0');
        }
        sc.close();
    }
    public static void Prob50_div_by_3_5_both(){
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by 5
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by both 3 and 5
        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n");
    }
    public static void Prob51_String_to_int(){
        Scanner sc = new Scanner(System.in);
        char strArr[] = sc.next().toCharArray(); 
        int number = 0;
        for ( int i = strArr.length - 1 ; i>=0 ; i--){
            number += (((int)strArr[(strArr.length - 1)-i])-48)*(Math.pow(10,i));
        }
        System.out.println(number);
        sc.close();
        // String str1 = in.nextLine();
        // int result = Integer.parseInt(str1);
        // System.out.printf("The integer value is: %d", result);
        //-----------------------
        //25 =['2','5']
        //20+5
        // 2*10 + 5
        // arr[0]*10 + arr[1]
        // arr[0]*100 + arr[1]*10 + arr[2]; 253 
        // 2 - 2 = 0
        // 2 - 1 = 1
        // 2 - 0 = 2
    }
    public static void Prob52_Sum_Equals_Third_Integer(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        if (a+b == c || a+c == b || b+c == a){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
        sc.close();
    }
    public static void Prob53_Number_Comparison_Logic(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt(); 
        System.out.print("Input a boolean value (true/false): ");
        boolean xyz = sc.nextBoolean();
        System.out.print("\n");
        if (xyz){
            System.out.print (z > y);}else{
        System.out.print(y > x && z > y);}
        sc.close();
    }
    
    public static void Prob54_same_rightmost_dgt(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a % 10 == b % 10 ||c % 10 == b % 10 || a % 10 == c % 10 ){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
        sc.close();
    }
    public static void Prob55_sec_to_time(){
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int S = seconds % 60;  // Calculate the remaining seconds
        int H = seconds / 60;  // Convert total seconds to minutes
        int M = H % 60;         // Calculate the remaining minutes
        H = H / 60;
        System.out.print(H + ":" + M + ":" + S);
        sc.close();
    }
    public static void Prob56_Count_Divisibles_in_Range(){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int  end = sc.nextInt();
        int  key = sc.nextInt();
        int count = 0;
        for (int i  = start ; i<= end ;i++){
            if (i % key ==  0){
                count+=1;
            }
        }
        System.out.print("count : " + count);
        sc.close();
    }
    public static void Prob57_factor_of_int(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factor = 0;
        for (int i = 1 ; i <= number ; i++){
            if( number % i == 0){
                factor++ ;
            }
        }
        System.out.print("factor :" + factor);
        sc.close();
    }
    public static void Prob58_Capitalize_Each_Word(){
        Scanner sc = new Scanner(System.in);
        char strArr[] = sc.nextLine().toCharArray();
        strArr[0] = Character.toUpperCase(strArr[0]);
        for(int i = 1 ; i<= strArr.length ; i++){
            if(i == strArr.length){
                break;
            }else{
                if (Character.isWhitespace(strArr[i]) && !Character.isWhitespace(strArr[i+1])){
                    strArr[i+1] = Character.toUpperCase(strArr[i+1]);
                }
            }
        }
        for(int i = 0 ; i<strArr.length ; i++ ){
            System.out.print(strArr[i]);}
        sc.close();
        }
        public static void Prob59_Convert_to_Lowercase(){
        Scanner sc = new Scanner(System.in);
        char strArr[] = sc.nextLine().toCharArray();
        
        for(int i = 0 ; i< strArr.length ; i++){
            strArr[i] = Character.toLowerCase(strArr[i]);
        }
        for(int i = 0 ; i<strArr.length ; i++ ){
            System.out.print(strArr[i]);
        }
        }
        public static void Prob60_Find_Penultimate_Word(){
            String str = "The quick brown fox jumps over the lazy dog.";
            
            int start =0 , end = 0;
            for (int i = str.length()-1 ;  i >=0 ; i--){// for value of start
                if(str.charAt(i) == ' '){
                    end = i;
                    break;
                }
                
            }
            for (int i = end-1 ;  i >=0 ; i--){//// for value of end
                if(str.charAt(i) == ' '){
                    start = i;
                    break;
                }   
            }
            for (int i = start + 1 ;  i < end; i++){
                System.out.print(str.charAt(i));
            }
        }
        public static void Prob61_Reverse_Word(){
            String word = "tushar";
            String result = "";
            for (int i = word.length()-1 ;  i >=0 ; i--){//// for value of end
                result += word.charAt(i);
            }
            System.out.println(result);
        }
        public static void Prob62_Check_Subtraction_Difference(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        if (Math.abs(Math.abs(a-b) - c) <= 20 || Math.abs(Math.abs(a-c) - b) <= 20 || Math.abs(Math.abs(c-b) - a) <= 20){
            System.out.print("False");
        }else{
            System.out.print("True");
        }
        sc.close();
        }
    public static void Prob63_Largest_Smallest_Value(){ 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==b){
            System.out.println("0");
        }else if(a%6  == b%6){
            if (a<b){
                System.out.print("Smallest : " + a);
            }else{
                System.out.print("Smallest : " + b);
            }
        }else{
            if (a<b){
                System.out.print("Largest : " + b);
            }else{
                System.out.print("Largest : " + a);
            }
        }
        sc.close();
    }
    public static void Prob64_Common_digit(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int p = in.nextInt();

        System.out.print("Input the second number: ");
        int q = in.nextInt();

        boolean result = false;

        if ((p > 25 || q < 75)) {
            int x = p % 10;
            int y = q % 10;

            p /= 10;
            q /= 10;

            result = (p == q || p == y || x == q || x == y);
        }

        System.out.println("Result: " + result);
        in.close();
    }
    public static void Prob65_Custom_mod(){
        int a = 10;
        int b = 45;
        if (a>b){
            System.out.print("mod-sub : " + (a-b));
        }else{
            System.out.print("mod-sub : " + (b-a));
        }

    }
    public static void Prob66_Sum_of_100_Prime(){
        int  n = 100 , pSum = 0 ;
        // 2 -> 1,2
        // 3 -> 1,2,3
        // 4 -> 1,2,3,4
        outerLoop: // This is the label
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    // This will break the loop labeled 'outerLoop'
                    continue outerLoop; 
                }
            }
            pSum += i;
            System.out.println("i : " + i);
        }

        System.out.println("sum  : " + pSum );

    }
    public static void Prob67_Insert_Word_in_Middle(){
        String str1 = "Tushar Borse";
        String str2 = " Ravindra ";
        String[] temp = str1.split(" "); 
        String result = temp[0] + str2 + temp[1];
        System.out.println(result);
    }
    public static void Prob68_Repeat_Last_3_Characters(){
        String result = "";
        String Input = "TusharRSB";
        for(int i = Input.length()-1 ; i >= Input.length()-3 ; i-- ){
            result += Input.charAt(i);
        }
        result += result+result+result;
        System.out.println(result);
    }
    public static void Prob69_Extract_First_Half(){
        String result = "";
        String Input = "Python";
        for(int i = 0 ; i < Input.length()/2 ; i++ ){
            result += Input.charAt(i);
        }
        System.out.println(result);
    }
    public static void Prob70_Short_Long_Short_String(){
        String Str1 = "Python" ;
        String Str2 = "Tutorial" ; 
        String result = Str1 + Str2 + Str1;   
        System.out.println(result);
    }
    public static void Prob71_Remove_First_Char_Concatenate(){
        String Str1 = "Python" ;
        String Str2 = "Tutorial" ; 
        String result = Str1.substring(1) + Str2.substring(1);   //substring - > return string from starting index
        System.out.println(result);
    }
    public static void Prob72_First_3_char(){
        String result = "";
        String Input = "123456";
        if(Input.length() == 0){
            result = "###";
        }else if(Input.length() == 1){
            result = Input +"##";
        }else if(Input.length() == 2){
            result = Input +"#";
        }else if(Input.length() == 3){
            result = Input ;
        }else{
            for(int i = 0 ; i < 3 ; i++ ){
                result += Input.charAt(i);
            }
        }
        System.out.println(result);
    }
    public static void Prob73_First_Last_Combo(){
        String Str1 = "Python" ;
        String Str2 = "Tutorial" ; 
        String result = "";
        if(Str1.length() == 0 && Str2.length() == 0 ){ // both are empty
             result ="##";
        }else if((Str1.length() == 0 && Str2.length() != 0 )){ // only 2nd is empty
             result ="#"  + Str2.charAt(Str2.length()-1);
        }else if((Str1.length() != 0 && Str2.length() == 0 )){// only 3rd is empty
             result = Str1.charAt(0)+ "#"  ;
        }else{ // both are filled
            result = "" + Str1.charAt(0) + Str2.charAt(Str2.length()-1);   
        }
        
        System.out.println(result);
    }
    public static void Prob74_10_as_First_Last(){
        int numbers[] = {20,30,40,50,60,10};
        if(numbers[0] == 10 || numbers[numbers.length-1] == 10){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static void Prob75_First_Last_same(){
        int numbers[] = {10,30,40,50,60,10};
        if(numbers[0] ==  numbers[numbers.length-1] ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static void Prob76_First_Last_array(){
        int arr1[]= {50, -20, 0, 30, 40, 60, 12};
        int arr2[]= {45, 20, 10, 20, 30, 50, 11}; 
        if(arr1[0] == arr2[(arr2.length-1)] ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void Prob77_newArray_First_Last_array(){
        int arr1[]= {50, -20, 0, 30, 40, 60, 12};
        int arr2[]= {45, 20, 10, 20, 30, 50, 11}; 
        int arr3[] = new int[3]; 
        arr3[0] = arr1[0];
        arr3[1] = arr2[arr2.length - 1];
        System.out.print(arr3[0]+ "," + arr3[1]);
    }
    public static void Prob78_a4or7(){
        int arr2[]= {4,17}; 
        for (int i = 0 ; i<2 ; i++){
            if( (arr2[i] == 4) || (arr2[i] == 7) ){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
    public static void Prob79_rotated_array(){
        int arr1[]= {20, 30, 40}; 
        int rotated[] = { arr1[1] , arr1[2] , arr1[0] };
        for (int i = 0 ; i<3 ; i++){
                System.out.print(rotated[i] + ",");
            
        }
    }
    public static void Prob80_largest_first_last(){
        int arr1[]= {20, 30, 40}; 
        if(arr1[0]>arr1[2]){
            System.out.println("Largest element is "+arr1[0]);
        }else{
            System.out.println("Largest element is "+arr1[2]);
        }
    }
    public static void Prob81_swap_first_last(){
        int arr1[]= {20, 30, 40}; 
        int temp = arr1[0];
        arr1[0] = arr1[2];
        arr1[2] = temp;
        for (int i = 0 ; i<3 ; i++){
                System.out.print(arr1[i] + ",");   
        }
    }
    public static void Prob82_largest_first_last_middle(){
        int arr1[]= {20, 30, 40, 50, 67}; 
        int a = arr1[0] ;
        int b = arr1[(arr1.length/2) - 1];
        int c = arr1[(arr1.length-1)];
        if(a>b && a>c){
            System.out.println("Largest element is "+ a);
        }else if (b>c && b>a){
            System.out.println("Largest element is "+ b);
        }else{
            System.out.println("Largest element is "+ c);
        }
    }
    public static void Prob83_Multiply_Array_Elements(){
        int arr1[]= {1, 3, -5, 4};
        int arr2[] = {1, 4, -5, -2};
        int result[] = new int[arr1.length];
        for (int i = 0 ; i < arr1.length ; i++){
            result[i] = arr1[i]*arr2[i];
            System.out.print(result[i]+",");
        }
    }
    public static void Prob84_add_last3(){
        String str1 = "python";
        String subStr = str1.substring(str1.length()-3);
        String result = subStr + str1 + subStr  ;
        System.out.print(result);
    }
    public static void Prob85_String_Starts_with_Word(){
        String mainString = "Hello how are you?";
        String word = "Hello";
        if (mainString.indexOf(word) == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static void Prob86_Collatz_Conjecture_Simulation(){
        int n = 78;
        while(n!=1){
            System.out.print(n+",");
            if( n%2 == 0 ){
                n/=2;
            }else{
                n = (n*3) + 1;
            }
        }
    }
    public static void Prob87_Digit_Sum_in_Words(){
        int num = 169;
        int sum = 0 ; 
        while(num != 0){
            sum += num%10;  
            num /= 10 ;
        }
        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
        // sum 61; one six
        String resultArray = ""; 
        while(sum != 0){
            resultArray = words[sum%10] + resultArray;
            sum /= 10 ;
        } 
        System.out.print(resultArray);
    }
    public static void Prob88_System_Environment(){
        System.out.println("\nCurrent system environment:");
        System.out.println(System.getenv());
        System.out.println("\n\nCurrent system properties:");
        System.out.println(System.getProperties());
    }
    public static void Prob89_Security_Manager(){
        // Print a message indicating the display of the system security interface
        System.out.println("System security interface:");
        // Retrieve and print the system security manager using System.getSecurityManager()
        //System.out.println(System.getSecurityManager());
    }
    public static void Prob90_Environment_Variables(){
        // Display the value of the specified environment variable "PATH"
        System.out.println("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));
        // Display the value of the specified environment variable "TEMP"
        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));
        // Display the value of the specified environment variable "USERNAME"
        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));

    }
    public static void Prob91_time_in_NS(){
        long startTime = System.nanoTime();  
        // Sample program: Display the first 10 natural numbers.
        int i;
        System.out.println("The first 10 natural numbers are:\n");
        for (i = 1; i <= 10; i++) {      
            System.out.println(i);
        }
        // Calculate the elapsed time in nanoseconds.
        long estimatedTime = System.nanoTime() - startTime; 
        System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: " + estimatedTime);
    }
    public static void Prob92_even_odd_array(){
        int arr1[] = {10,22,25,26,35,36};
        int evenC = 0 ;
        int oddC = 0 ;
        int bitMask = 1;
        for (int i = 0 ; i< arr1.length ; i++){
            if ((arr1[i] & bitMask) == 0){
                evenC+=1;
            }else{
                oddC+=1;
            }
        }
        System.out.println("Even count : " + evenC);
        System.out.println("Odd count : " + oddC);
    }
    public static void Prob93_Check_Adjacent(){
        int arr[] = {10,10,20,20,15,18};
        boolean twentyB = false;
        boolean tenB = false;

        for (int i = 0 ; i <= arr.length-2 ; i++){
            if((arr[i]==20 ) && (arr[i+1]==20)){
                twentyB = true;
                 
            }else if((arr[i]==10 ) && (arr[i+1]==10)){
                tenB = true;  
            }
        }
        if(twentyB && tenB){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
    public static void Prob94_Rearrange_Odd_Even() {
        int arr1[] = {10, 22, 25, 26, 35, 36};
        for (int i = 0; i < arr1.length; i++) {
            // If current element is odd
            if (arr1[i] % 2 != 0) {
                int n = i;
                // Move backward while previous elements are even
                while (n > 0 && arr1[n - 1] % 2 == 0) {
                    // Swap arr1[n] and arr1[n-1]
                    int temp = arr1[n];
                    arr1[n] = arr1[n - 1];
                    arr1[n - 1] = temp;
                    n--;   // Move left
                }
            }
        }

        // Print result
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
    public static void  Prob95_Create_String_Array(){
        int n = 50;
        String arr[] = new String[n];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = (""+i);
            System.out.print(arr[i]+ " " );
        }
    }
    public static void Prob96_10_before_20(){
        int arr[] = {25,82,10,56,96,20};
        int start = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if (arr[i] == 10){
                start = i+1;
                break;
            }
        }
        for(int i = start ; i< arr.length ; i++){
            if (arr[i] == 20){
                System.out.println("There  is a 10 in an array of integers with a 20 somewhere later on.");
                return;
            }
        }
        System.out.println("There  is not a 10 in an array of integers with a 20 somewhere later on.");
    }
    public static void Prob97_Number_Adjacent_Separated_One(){
        int arr[] = {25,82,10,56,20};
        for(int i = 0 ; i< arr.length-2 ; i++){
            if (arr[i] == arr[i+1] || arr[i] == arr[i+2]){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
    public static void Prob98_20_Appears_Thrice_Non_Consecutively(){
        int arr[] = {25,20,10,56,20,18,20};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                if (i < arr.length - 1 && arr[i + 1] == 20) {
                     System.out.println("false");
                     return;
                }
                count++;
            }
        }
        if(count == 3){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
    public static void Prob99_Specified_Number_Adjacent_Pairs(){
        int number = 20;
        int arr[] = {25,20,10,56,20,20};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == number && arr[i+1] == number) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
    public static void Prob100_Count_Elements_Differ_1(){
        int arr1[] = {25,26,23,29,25};
        int arr2[] = {95,25,33,30,95};
        int count = 0;
        for(int i = 0 ; i < arr1.length ; i++){
            if (Math.abs(arr1[i] - arr2[i]) <= 1 ){
                count++;
            }
        }
        System.out.print("count : " + count);
    }
    public static void Prob101_Check_10_Exceeds_20_in_Array(){
        int arr1[] = {25,26,23,29,25,20};
        int countTen = 0;
        int countTwenty = 0;
        for(int i = 0 ; i < arr1.length ; i++){
            if (arr1[i]== 10 ){
                countTen ++;
            } else if(arr1[i]== 20){
                countTwenty ++;
            }
        }
        if(countTen > countTwenty){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
        public static void Prob102_contain_10_30(){
        int arr1[] = {25,26,23,29,25,30};
        for(int i = 0 ; i < arr1.length ; i++){
            if (arr1[i]== 10 || arr1[i]== 30 ){
                System.out.println("true");
                return;
            } 
        }
        System.out.println("false");

    }
    public static void Prob103_Array_After_Last_10() {
        int arr1[] = {25, 26, 10, 29, 25, 30};

        // Find last occurrence of 10
        int lastIndex = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 10) {
                lastIndex = i;
            }
        }
        // If 10 not found or it's the last element
        if (lastIndex == -1 || lastIndex == arr1.length - 1) {
            System.out.println("No elements after last 10");
            return;
        }
        // Create new array of correct size
        int newLength = arr1.length - lastIndex - 1;
        int newArr[] = new int[newLength];
        // Copy elements after last 10
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr1[lastIndex + 1 + i];
        }
        // Print result
        System.out.println(Arrays.toString(newArr));
    }
    public static void Prob104_Array_before_Last_10() {
        int arr1[] = {25, 26, 10, 29, 25, 30};
        // Find last occurrence of 10
        int lastIndex = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 10) {
                lastIndex = i;
            }
        }
        // If 10 not found
        if (lastIndex == -1) {
            System.out.println("10 not found in array");
            return;
        }
        // Create new array with elements before last 10
        int newArr[] = new int[lastIndex];
        for (int i = 0; i < lastIndex; i++) {
            newArr[i] = arr1[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
    public static void Prob105_Group_Match_Start_and_End(){
        int arr1[] = {25, 26, 10 };
        int grp = 3;
        if ((grp*2) > arr1.length) {
            System.out.println("The Array size is smaller than required size");
            return;
        }else{
            for (int i=0 ; i < grp; i++){
                if(arr1[i] != arr1[(arr1.length-grp)+i]){
                    System.out.println( "Elements are not same " );
                    return;
                }
            }
        }
        System.out.println("Elements are same ");    
    }
    public static void Prob106_Left_Shift_Array(){
        int arr1[] = {15,64,65,66};
        int temp = arr1[0];
        for(int i =1; i<arr1.length; i++ ){
            arr1[i-1]=arr1[i];
        }
        arr1[arr1.length-1]=temp;
        for(int i = 0; i<arr1.length; i++ ){
            System.out.print(arr1[i] + " ");
        }
    }
    public static boolean Prob107_Three_Increasing_Adjacent_Numbers(){
        int arr1[] = {15,69,67,66,67};
        for ( int i =0; i<arr1.length-2; i++){
            if(arr1[i]+1 == arr1[i+1] && arr1[i+1] +1 == arr1[i+2] ){
                
                return  true ;
            }
        }
        return false;
    }
    public static void Prob108_Sum_Digits_to_Single_Digit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum = 1 + (num - 1) % 9;
        System.out.println(" THE last single digit Sum is  : "+sum);   
        sc.close();
    }

    public static void Prob109_Staircase_Coins(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int coin = sc.nextInt();
        int ans = 0;
        int i = 1;

            while (coin >= i) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println();

                coin -= i;   // subtract full row
                ans = i;     // store last full row number
                i++;
            }

            System.out.println("ans = " + ans);
            System.out.println("coin left = " + coin);
            sc.close();
            
    }
    public static void Prob110_Power_4(){
        int n = 60;
        System.out.println(((n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1) ) );
    }
    public static void Prob111_add_withot_sum(){
                int x, y; 
        Scanner in = new Scanner(System.in); 

        System.out.print("Input first number: "); 
        x = in.nextInt(); 

        System.out.print("Input second number: "); 
        y = in.nextInt();

        while (y != 0) {
            int carry = x & y; 
            x = x ^ y; 
            y = carry << 1; 
        }

        System.out.print("Sum: " + x); 
        System.out.print("\n"); 
    }
    public static void Prob112_Trailing_Zeros_in_Factorial() {
        
    }

    
    
    public static void main(String arg[]){
        //Prob01_Hello_and_Name_Printer()
        //Prob02_sum_of_two()
        //Prob03_Division_of_Two_Numbers()
        //Prob04_arithmetic_operation()
        //Prob05_multiplication_table()
        //Prob06_Basic_Arithmetic_Operations()
        //Prob07_Multiplication_Table()
        //Prob08_pattern_Display()
        //Prob09_Expression_Evaluation()
        //Prob10_Formula_Computation()
        //Prob11_circle_area_parameter()
        //Prob12_Average_of_Three_Numbers()
        //Prob13_Rectangle_Area_and_Perimeter()
        //Prob14_American_Flag_Display()
        //Prob15_Swap_Variables()
        //Prob16_Face_Printer()
        //Prob17_binary_addition()
        //Prob18_binary_multipliction()
        //Prob19_dec_to_bin()
        //Prob20_dec_to_hex()
        //Prob21_dec_to_octal()
        //Prob22_bin_to_dec()
        //Prob23_bin_to_hex()
        //Prob24_bin_to_octal()
        //Prob25_octal_to_dec()
        //Prob26_octal_to_bin()
        //Prob27_octal_to_hex()
        //Prob28_hex_to_dec()
        //Prob29_hex_to_bin()
        //Prob30_hex_to_octal()
        //Prob31_Check_Java_Installation()
        //Prob32_Compare_Two_Numbers()
        //Prob33_sumdjt()
        //Prob34_hexArea()
        //Prob35_Area()
        //Prob36_Dist_bw_two();
        //Prob37_reverse_array();
        //prob38_Count_Characters_in_String();
        //Prob39_Unique_Three_Digit_Numbers();
        //Prob40_list_char_array();
        //Prob41_ASCII_Value_Finder();
        //Prob42_Input_and_Display_password();
        //Prob43_Twinkle_Poem_Formatter();
        //Prob44_Compute_n_nn_nnn();
        //Prob45_file_size_finder();
        //Prob46_system_time();
        //Prob47_formatted_system_time();
        //Prob48_Print_Odd_Numbers();
        //Prob49_check_even_odd();
        //Prob50_div_by_3_5_both();
        //Prob51_String_to_int();
        //Prob52_Sum_Equals_Third_Integer();
        //Prob53_Number_Comparison_Logic();
        //Prob54_same_rightmost_dgt();
        //Prob55_sec_to_time();
        //Prob56_Count_Divisibles_in_Range();
        //Prob57_factor_of_int();
        //Prob58_Capitalize_Each_Word();
        //Prob59_Convert_to_Lowercase();
        //Prob60_Find_Penultimate_Word();
        //Prob61_Reverse_Word();
        //Prob62_Check_Subtraction_Difference();
        //Prob63_Largest_Smallest_Value();
        //Prob64_Common_digit();
        //Prob65_Custom_mod();
        //Prob66_Sum_of_100_Prime();
        //Prob67_Insert_Word_in_Middle();
        //Prob68_Repeat_Last_3_Characters();
        //Prob69_Extract_First_Half();
        //Prob70_Short_Long_Short_String();
        //Prob71_Remove_First_Char_Concatenate();
        //Prob72_First_3_char();
        //Prob73_First_Last_Combo();
        //Prob74_10_as_First_Last();
        //Prob75_First_Last_same();
        //Prob76_First_Last_array();
        //Prob77_newArray_First_Last_array();
        //Prob78_a4or7();
        //Prob79_rotated_array();
        //Prob80_largest_first_last();
        //Prob81_swap_first_last();
        //Prob82_largest_first_last_middle();
        //Prob83_Multiply_Array_Elements();
        //Prob84_add_last3();
        //Prob85_String_Starts_with_Word();
        //Prob86_Collatz_Conjecture_Simulation();
        //Prob87_Digit_Sum_in_Words();
        //Prob88_System_Environment();
        //Prob89_Security_Manager();
        //Prob90_Environment_Variables();
        //Prob91_time_in_NS();
        //Prob92_even_odd_array();
        //Prob93_Check_Adjacent();
        //Prob94_Rearrange_Odd_Even();
        //Prob95_Create_String_Array();
        //Prob96_10_before_20();
        //Prob97_Number_Adjacent_Separated_One();
        //Prob98_20_Appears_Thrice_Non_Consecutively();
        //Prob99_Specified_Number_Adjacent_Pairs();
        //Prob100_Count_Elements_Differ_1();
        //Prob101_Check_10_Exceeds_20_in_Array();
        //Prob102_contain_10_30();
        //Prob103_Array_After_Last_10();
        //Prob104_Array_before_Last_10();
        //Prob105_Group_Match_Start_and_End();
        //Prob106_Left_Shift_Array();
        //Prob107_Three_Increasing_Adjacent_Numbers(); 
        //Prob108_Sum_Digits_to_Single_Digit();
        //Prob109_Staircase_Coins();
        //Prob110_Power_4();
         Prob111_add_withot_sum();
        //Prob112_Trailing_Zeros_in_Factorial();

    }
}
