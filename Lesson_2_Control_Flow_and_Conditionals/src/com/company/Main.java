package com.company;

public class Main {

    public static void main(String[] args) {

        //IF STATEMENT-------------------------------------------------------------------------------------------------

        boolean isCold=true; //true or false
        //If test condition - it's value varies is it cold or not. To test it we have to determine it's value
        if(isCold){
            //executes ONLY if isCold is true
            System.out.println("It's cold. wear a coat!");
        } //It is block of code - no semicolon after end bracket "}" of if statement

        //VARIABLE SCOPE-----------------------------------------------------------------------------------------------

        //scope - block or range of code where a certain variable can be used and refer to

        //declaring variable boolean always at the top of our code
        //isLightGreen variable scope is whole program,
        //carSpeed variable scope is only between {} of if statement, so we can use it only in that range
        //so the set of curly brraces defines a variable scope: {SCOPE}
        boolean isLightGreen=true;
        if(isLightGreen){
            double carSpeed=100; //in km/h
            System.out.println("Drive!");
            System.out.println("Speed is: "+carSpeed);
        }
        //If we would like to add 10 to our carSpeed variable outside of its scope, it will display an error
        //carSpeed=carSpeed-10;

        //ELSE STATEMENT------------------------------------------------------------------------------------------------

        isLightGreen=false;
        //only one line of code will be executed, if one (first one to be true) condition is met, all the others are abandon
        if(isLightGreen){
            System.out.println("Drive!");
        }else{
            System.out.println("Stop!");
        }

        //ELSE IF-------------------------------------------------------------------------------------------------------

        isLightGreen=false;
        boolean isLightYellow=true;
        //only one line of code will be executed, if one (first one to be true) condition is met, all the others are abandon
        if(isLightGreen){
            System.out.println("Drive!");
        //else if always comes after if and before else
        }else if(isLightYellow){
            System.out.println("Slow Down!");
        }else{
            System.out.println("Stop!");
        }

        //BOOLEAN EXPRESSIONS------------------------------------------------------------------------------------------

        //We can assign value to a boolean directly or calculate with test like comparisons!
        boolean b1=true; //or false
        boolean b2=3>=5; //false
        boolean b3=3<=5; //outcome is true: 3 is less or equals 5
        int x=10;
        boolean b4=x>=10; //true

        /*expressions:
        > - more than
        < - less than
        >= - more than/equal
        <= - less than/equal
        == - equality check - single = -> variable assignment
        != - not equal- checks of condition is not met
         */

        int ticketPrice=10;
        int age=21;
        boolean isStudent=true;
        if(age<=15){
            ticketPrice=5;
        }else if(age>60){
            ticketPrice=5;
        }else if(isStudent){
            ticketPrice=5;
        }
        System.out.println("Ticket price is: $"+ticketPrice);

        //LOGICAL OPERATORS--------------------------------------------------------------------------------------------

        // 1) && - and - combine 2 test conditions, and is true only when both are true: 3<5 && 2>15 -> false
        // 2) || - or - combine 2 test conditions, and this is true if one or both conditions are true:
        // 3<5 || 2>15 -> true
        // 3)  ! - not - one test at a time: !(3<5) -> !(true) -> false - changes what ever is in () to opposite value

        ticketPrice=10;
        if(age<=15||age>60||isStudent){
            ticketPrice=5;
        }
        System.out.println("Ticket price is: $"+ticketPrice);

        //ORDER OF LOGICAL OPERATORS

        // 1) () - everything inside parenthesis
        // 2) !
        // 3) &&
        // 4) ||

        /* It is easier to use logical operators is assign test conditions with direct value: if you have
        !(3<5) || 3>4 && 2<=2 - look at this like that:
        !true || false && true - first comes the not operator -> false
        false || false && true - second comes and operator -> false
        false || false - third comes or operator -> false
        false- outcome

        false && true || true -> true
        false && (true || true) -> false
         */

        //NESTED IF STATEMENT------------------------------------------------------------------------------------------

        boolean action=true;
        boolean romance=true;
        boolean horror=false;
        boolean comedy=true;
        if(action&&romance&&(horror||comedy)){
            System.out.println("This film includes action and romance and horror or comedy");
        }
        //or because sometimes this test become long and complicated programmers choose to break them to pieces.
        //To combine multiple tests (nested if replace && operator:
        if(action&&romance) {
            System.out.println("This film includes action and romance.");
            if (horror || comedy) {
                System.out.println("This film also includes horror or comedy.");
            }
        }
        //Example of restaurant rating
        int rating=1;
        if(rating>=0||rating<=5){
            //rating is 0-5
            if(rating<=2){
                System.out.println("What is the reason for your low rating?");
            }
            //We will thank for feedback regardless of value, but we want additional information to display when
            //rating is low
            System.out.println("Thank you for your feedback.");
        }

        //SWITCH STATEMENT----------------------------------------------------------------------------------------------

        //If you do a lot of equality checks
        //switch statement lets us check the value of certain variable and test it for equality against a list of
        // possible values that it can take.
        //You can use if-else statement or switch statement to do the same
        int passcode=312;
        String coffeeType;

        if(passcode==555){
            coffeeType="espresso";
        }else if(passcode==312){
            coffeeType="Vanilla Latte";
        }else if(passcode==629){
            coffeeType="Drip coffee";
        }else{
            coffeeType="Unknown";
        }
        System.out.println(coffeeType);

        switch(passcode){
            case 555:coffeeType="espresso";
            break; //break if case is true -> breaks out of switch statement  and goes to its curly brace
            //So the break ensures that only one case at a time will have it’s code executed.
            //If the break were not included, Java would continue reading code in the switch statement line by line
            // and keep executing statements (like the default case code) until it reaches the end of the switch
            // statement or hits another break!
            case 312:coffeeType="Vanilla Latte";
            break;
            case 629:coffeeType="Drip coffee";
            break;
            default:coffeeType="Unknown"; //default like else statement
            break;
        }
        System.out.println(coffeeType);

        //PROBLEM SET 2-------------------------------------------------------------------------------------------------

        //Question 3---------------------------------------------
        boolean canSeePlayer=true;
        boolean playerPowerUp=true;

        if(canSeePlayer){
            if(!playerPowerUp){
                System.out.println("Atack!");
            }else{
                System.out.println("Run away!");
            }
        }else{
            System.out.println("Wander!");
        }

        //Question 4---------------------------------------------
        boolean isSnowing=false;
        boolean isRaining=false;
        double temperature=60.0;//In Fahrenheit

        if(isRaining||isSnowing||temperature<50){
            System.out.println("Let’s stay home.");
        }else{
            System.out.println("Let’s go out");
        }
        //Question 5---------------------------------------------
        double time=15; //Value between 0-24
        String timeOfDay;

        if(time>=5&&time<12){
            timeOfDay="morning";
        }else if(time>=12&&time<20){
            timeOfDay="daytime";
        }else{
            timeOfDay="night";
        }
        System.out.println(timeOfDay);

        //Question 6---------------------------------------------
        int dayOfTheWeek=1; //1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday, 7 = Sunday
        boolean holiday=false;

        //my attempt
        if(holiday){
            System.out.println("Sleep in!");
        }else{
            if(dayOfTheWeek==6||dayOfTheWeek==7){
                System.out.println("Sleep in!");
            }else{
                System.out.println("Wake up at 7:00 am!");
            }
        }
        //solution in less code written
        if(holiday||dayOfTheWeek==6||dayOfTheWeek==7){
            System.out.println("Sleep in!");
        }else{
            System.out.println("Wake up at 7:00 am!");
        }
        //solution from the problem-set-2.pdf
        if(!holiday&&dayOfTheWeek>=1&&dayOfTheWeek<=5){
            System.out.println("Wake up at 7:00 am!");
        }else{
            System.out.println("Sleep in!");
        }
        //Question 8---------------------------------------------
        int weekday=6; //Value 1-7: numbers relates to week days: 1=monday etc.
        String schedule;

        switch(weekday){
            case 1:schedule="Gym in the morning.";
            break;
            case 2:schedule="Class after work.";
            break;
            case 3:schedule="Meetings all day.";
            break;
            case 4:schedule="Work from home.";
            break;
            case 5:schedule="Game night after work.";
            break;
            /*case 6:schedule="Free!";
            break;
            case 7:schedule="Free!";
            break;
            default:schedule="Free!";
            break;*/
            case 6: case 7: default: schedule="Free!";
            break;
        }
        System.out.println(schedule);

    }
}
