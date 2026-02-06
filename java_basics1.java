import java.util.*;
import java.nio.charset.Charset;//Prob 40
import java.io.Console; //Prob 42
import java.io.File; //Prob 45
import java.util.Calendar;//Prob 46
import java.util.TimeZone;//Prob 46
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
        char strArr[] = sc.next().toCharArray();
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
    }
}
