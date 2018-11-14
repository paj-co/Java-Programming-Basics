package com.company;

import java.sql.DataTruncation;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!"); //This is a system command. printing out in a new line. whatever is in parenthesis
        System.out.println(2+3); //Will display calculation output: 5
        System.out.println("2+3"); //Will display "2+3" as a text

        /*
        (1) Java is case sensitive,
        (2) Quotation marks "Hello, World!" display the message as it is
        (3) Semi-colon means the end of the statement

        Integer Variables
        If you make a variable of some type -> you can  only store that one type in there

        Integer - natural numbers in Java

        How many passengers is in the bus?*/

        int passengers; //Integer value -> Declare
        passengers=0; //Initialize
        passengers=passengers+5; //Updating value based on old value,
        //Computer calculate first the old value on the right from equal sign=0 than adds 5, than assign it to
        //passengers on the left from the equal sign
        //So update passengers= old value + 5
        passengers=passengers-3;
        passengers=passengers-1+5;
        System.out.println("The number of passengers at the last stop is: "+passengers);
        //Output: The number of passengers at the last stop is: 6

        int stops;
        int fare;
        stops=0;
        fare=0;
        stops=stops+1;
        fare=fare+5;
        stops=stops+1;
        fare=fare+3;
        stops=stops+1;
        fare=fare+7;
        System.out.println("The number of stops is: "+stops); //Output: The number of stops is: 3
        System.out.println("The number fare amount is: "+fare); //Output: The number fare amount is: 15


        //STRING VARIABLE - any character or set of characters, store a phrase or a word

        String driver;
        driver="Hamish"; //Quotation marks "" means we are referring to the WORD not another VARIABLE
        int letters=driver.length();// Declaring INTEGER letters & initializing it with number of letters in "Hamish" word
        driver=driver.toUpperCase();//New String driver value is old value with every letter transformed to capital letter
        //driver=driver.toLowerCase();
        System.out.println("Drivers name is "+driver+" which is "+letters+" letters long.");
        //Output: Drivers name is HAMISH which is 6 letters long.

        //STRING CONCATENATION - joining strings together

        String driverFirstName="Hamish";
        String driverLastName="Blake";
        String driverFullName=driverFirstName+" "+driverLastName;
        System.out.println(driverFullName); //Output: Hamish Blake

        System.out.println("The bus made $"+fare+" after "+stops+" stops");//Output: The bus made $15 after 3 stops

        //Variable Names

        /*
        CamelCase -> lowerCamelCase(the default) or UpperCamelCase
        When creating new variable name always use lowerCamelCase

        Variables names are:
        (1) Case sensitive
        (2) Starts with a letter (or "$" or "_" possible but not recommended): se7en is ok, 2ndPlayer is NOT ok
        (3) Can't have spaces

        You can always Initialize variable when declaring:
        String player = "Jack"; or
        int price = 0;

        Variable types (numbers)
        1) Integer:     int maxInt = 2147483647; only 10 digits number (much more efficient because of it size)
        2) Long         long muchMore = 2147483647*100000000; - is int but 18 digits (slowing down program)
        3) double       double fraction = 99.275; (slowing down program)

        Text types:
        1) String       String fullText = "(b) WWII ended 1945"
        2) Character    char answer = 'b' - there is single quotation '' not " " like in String

        Decision type:
        Boolean         boolean fact = true; - 2 values: true or false like a checkbox

        Variable Arithmetic
        1) Addition         int x = 2+3; //Value: 5

        2) Subtraction      int y = 4-5; //Value: -1
                            int temp = -20;

        3) Multiplication   int days = 4*7; //Value: 28
                            int z = x*y; //Value: -5

        4) Division         double div = 5/2; !!!!! //Value 2 NOT 2.5 - fraction is always removed
                                if you want an accurate result use in fraction number in equation ex. "2.0"
                            double accurate = 5/2.0; //Value: 2.5
        */
        //Using "+" "-" "*" "/" and ( )
        double paid=10;
        double change=3.25;
        double tip=(paid-change)*0.2;
        System.out.println("Tip: "+tip);

        /*Truncation -> Casting
        truncation can be sometimes useful ex. estimation ex. How many student (at least) will take a class
        double div=5/2; //Need to use double like 2.0 for accurate result
        System.out.println(div);*/

        double current=17;
        double rate=1.5;
        double future=current*rate;
        System.out.println(future);
        int approx = (int)future; //CASTING
        System.out.println(approx);

        int x=5;
        int y =2;
        double div=x/y;//Value: 2.0 -> we want 2.5
        System.out.println(div);
        double accurate=(double)x/y; //We are casting an equation of two integers
        System.out.println(accurate);

        //Comments
        // Use "//" for inline comment
        /* <-Use these to start
        and end multiple line comment
         -> */

        //Problem set 1
        
        //Question 6
        String firstName="paj";
        String lastName="co";
        String fullName=firstName+"-"+lastName;
        System.out.println("Hello, my name is "+fullName);
        //You can use functions directly in System.out.println() command, you don;t have to set special int for that
        //int lettersInName=firstName.length()+lastName.length(); you can make this directly in println if you use parenthesis
        System.out.println("There are "+(firstName.length()+lastName.length())+" letters in my name");

        //Question 7
        double fahrenheit=87;
        double celsius=(fahrenheit-32)*5/9;
        System.out.println(celsius);









    }

}
