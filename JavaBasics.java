// Java Concepts: Operators, Decision Making, Loops
public class JavaBasics {

    public static void main(String[] args) {

        // ------------------ OPERATORS ------------------
        // 1. Arithmetic Operators: +, -, *, /, %
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3
        System.out.println("a % b = " + (a % b)); // 1

        // 2. Relational Operators: ==, !=, >, <, >=, <=
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false

        // 3. Logical Operators: &&, ||, !
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false

        // 4. Assignment Operators: =, +=, -=, *=, /=
        int c = 5;
        c += 3; // c = c + 3
        System.out.println("\nAssignment Operators:");
        System.out.println("c after c += 3: " + c); // 8

        // 5. Unary Operators: ++, --
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d++ = " + (d++)); // prints 5, then d becomes 6
        System.out.println("++d = " + (++d)); // d becomes 7, then prints 7

        // 6. Ternary Operator: condition ? true : false
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("\nTernary Operator Result: " + result);

        // ------------------ IF ELSE (10 Examples) ------------------
        int num = 15;

        // Example 1: Simple if
        if (num > 10) {
            System.out.println("\nExample 1: Number is greater than 10");
        }

        // Example 2: if-else
        if (num % 2 == 0) {
            System.out.println("Example 2: Even Number");
        } else {
            System.out.println("Example 2: Odd Number");
        }

        // Example 3: if-else-if
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Example 3: Grade A");
        } else if (marks >= 75) {
            System.out.println("Example 3: Grade B");
        } else {
            System.out.println("Example 3: Grade C");
        }

        // Example 4: check positive/negative/zero
        int n = -5;
        if (n > 0) {
            System.out.println("Example 4: Positive Number");
        } else if (n < 0) {
            System.out.println("Example 4: Negative Number");
        } else {
            System.out.println("Example 4: Zero");
        }

        // Example 5: check eligibility for vote
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Example 5: Eligible to vote");
        } else {
            System.out.println("Example 5: Not eligible");
        }

        // Example 6: Nested if
        int p = 20;
        if (p > 10) {
            if (p < 30) {
                System.out.println("Example 6: Between 10 and 30");
            }
        }

        // Example 7: Check leap year
        int year = 2024;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Example 7: Leap Year");
            } else {
                System.out.println("Example 7: Not a Leap Year");
            }
        }

        // Example 8: Largest of two numbers
        int a1 = 10, b1 = 20;
        if (a1 > b1) {
            System.out.println("Example 8: A is largest");
        } else {
            System.out.println("Example 8: B is largest");
        }

        // Example 9: Number is divisible by 5 and 11
        int n1 = 55;
        if (n1 % 5 == 0 && n1 % 11 == 0) {
            System.out.println("Example 9: Divisible by both 5 and 11");
        }

        // Example 10: Check character is vowel or not
        char ch = 'e';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Example 10: Vowel");
        } else {
            System.out.println("Example 10: Consonant");
        }

        // ------------------ SWITCH CASE (10 Examples) ------------------
        int day = 3;

        // Example 1: Day of week
        switch (day) {
            case 1: System.out.println("\nSwitch Example 1: Sunday"); break;
            case 2: System.out.println("Switch Example 1: Monday"); break;
            case 3: System.out.println("Switch Example 1: Tuesday"); break;
            default: System.out.println("Switch Example 1: Invalid Day");
        }

        // Example 2: Month name
        int month = 12;
        switch (month) {
            case 1: System.out.println("Switch Example 2: January"); break;
            case 12: System.out.println("Switch Example 2: December"); break;
            default: System.out.println("Switch Example 2: Unknown Month");
        }

        // Example 3: Grade
        char grade = 'A';
        switch (grade) {
            case 'A': System.out.println("Switch Example 3: Excellent"); break;
            case 'B': System.out.println("Switch Example 3: Good"); break;
            default: System.out.println("Switch Example 3: Needs Improvement");
        }

        // Example 4: Simple calculator
        int x1 = 10, y1 = 5;
        char op = '+';
        switch (op) {
            case '+': System.out.println("Sum = " + (x1 + y1)); break;
            case '-': System.out.println("Diff = " + (x1 - y1)); break;
            case '*': System.out.println("Product = " + (x1 * y1)); break;
            case '/': System.out.println("Divide = " + (x1 / y1)); break;
            default: System.out.println("Invalid Operator");
        }

        // Example 5: Traffic light color
        String color = "red";
        switch (color) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Wait"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid color");
        }

        // Example 6: Check digit or not using ASCII
        char c1 = '5';
        switch (Character.isDigit(c1) ? 1 : 0) {
            case 1: System.out.println("Switch Example 6: Digit"); break;
            default: System.out.println("Switch Example 6: Not Digit");
        }

        // Example 7: Days in month
        int mon = 2;
        switch (mon) {
            case 2: System.out.println("28 or 29 Days"); break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 Days"); break;
            default:
                System.out.println("31 Days");
        }

        // Example 8: Check even/odd using switch
        int evn = 4;
        switch (evn % 2) {
            case 0: System.out.println("Even Number"); break;
            case 1: System.out.println("Odd Number"); break;
        }

        // Example 9: Language menu
        int choice = 2;
        switch (choice) {
            case 1: System.out.println("English"); break;
            case 2: System.out.println("Hindi"); break;
            case 3: System.out.println("Marathi"); break;
            default: System.out.println("Invalid Choice");
        }

        // Example 10: Multiple case example
        char letter = 'a';
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }


        // ------------------ LOOPS (Brief Examples) ------------------
        System.out.println("\nFOR LOOP Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\nWHILE LOOP Example:");
        int w = 1;
        while (w <= 5) {
            System.out.println("w = " + w);
            w++;
        }

        System.out.println("\nDO-WHILE LOOP Example:");
        int d1 = 1;
        do {
            System.out.println("d1 = " + d1);
            d1++;
        } while (d1 <= 5);
    }
}






// ------------------------------------------------

✅ 1. Operators – 10 Assignments
Calculate area and perimeter of rectangle.
➤ Hint: Use formula area = l * b, perimeter = 2*(l + b)

Swap two numbers without using third variable.
➤ Hint: Use arithmetic operators: a = a + b; b = a - b; a = a - b;

Find simple interest.
➤ Hint: SI = (P * R * T) / 100

Check if a number is even or odd using modulus operator.
➤ Hint: num % 2 == 0 means even

Calculate total and percentage of 5 subjects.
➤ Hint: Add marks, percentage = total / 5

Convert temperature from Celsius to Fahrenheit.
➤ Hint: F = (C * 9/5) + 32

Evaluate expression: a + b * c - d / e
➤ Hint: Apply operator precedence rules

Check whether two numbers are equal.
➤ Hint: Use relational operator ==

Increment and decrement a variable and show output.
➤ Hint: Try both pre/post increment: x++, ++x

Check if a year is divisible by 4 and 100.
➤ Hint: year % 4 == 0 && year % 100 == 0

✅ 2. If-Else – 10 Assignments
Check if number is positive, negative or zero.
➤ Hint: Use if-else-if ladder

Find the greatest of three numbers.
➤ Hint: Use nested if or if-else-if

Check if a number is divisible by 5 or 11.
➤ Hint: Use num % 5 == 0 || num % 11 == 0

Check if person is eligible to vote (age >= 18).
➤ Hint: Simple if-else

Check whether a character is vowel or consonant.
➤ Hint: Use char == 'a' || ...

Check whether a year is leap year.
➤ Hint: year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)

Check pass or fail using marks (pass >= 40).
➤ Hint: if (marks >= 40)

Assign grade based on marks.
➤ Hint: 90+ = A, 75+ = B, ...

Check if triangle is valid based on 3 angles.
➤ Hint: If sum == 180 then valid triangle

Check if a number is even and divisible by 3.
➤ Hint: Use num % 2 == 0 && num % 3 == 0

✅ 3. Switch Case – 10 Assignments
Print day name based on day number (1–7).
➤ Hint: Use switch(day) { case 1: ... }

*Simple calculator using switch ( +, -, , / )
➤ Hint: Use char op = '+';

Display month name based on number (1–12).
➤ Hint: switch(month)

Print weekday or weekend.
➤ Hint: case 1,2,3... for weekday, 6,7 for weekend

Menu driven program: 1. Area of Circle, 2. Square, etc.
➤ Hint: Use Scanner + switch

Print season based on month (e.g. Summer, Winter).
➤ Hint: case 3 to 5: Spring, 6 to 8: Summer

Assign grade using switch.
➤ Hint: Input grade character A, B, ...

Check vowel using switch.
➤ Hint: switch(ch) with multiple cases

Print language menu: 1. English 2. Hindi 3. Marathi
➤ Hint: Use integer input with switch

Check odd/even using switch.
➤ Hint: num % 2 == 0 => case 0:

✅ 4. Loops (For, While, Do-While) – 10 Assignments
Print numbers from 1 to 100.
➤ Hint: Use for, while, or do-while

Print all even numbers from 1 to N.
➤ Hint: Use if (i % 2 == 0)

Print sum of first N natural numbers.
➤ Hint: Use loop and sum += i

Print table of a number.
➤ Hint: n * 1, n * 2...

Find factorial of a number.
➤ Hint: fact *= i from 1 to n

Print reverse of a number.
➤ Hint: Extract digits using % and /

Check if number is palindrome.
➤ Hint: Reverse number and compare

Count digits in a number.
➤ Hint: Keep dividing by 10

Print Fibonacci series till N terms.
➤ Hint: Use 3 variables: a=0, b=1, c=a+b

Print sum of digits of a number.
➤ Hint: Use % 10 to get digit and add

// -------------------------------------------------------








🔸1. Calculate Area and Perimeter of Rectangle
Question:
Write a program to find area and perimeter of rectangle.
Hint: Area = l * b, Perimeter = 2 * (l + b)




int l = 5, b = 3;
int area = l * b;
int perimeter = 2 * (l + b);
System.out.println("Area: " + area);
System.out.println("Perimeter: " + perimeter);




🔸2. Swap Two Numbers Without Third Variable
Question:
Swap two integers using arithmetic operators only.
Hint: Use a = a + b, b = a - b, a = a - b


int a = 10, b = 20;
a = a + b;
b = a - b;
a = a - b;
System.out.println("a = " + a + ", b = " + b);






// Java Assignment Practice: Operators
public class OperatorsAssignments {

    public static void main(String[] args) {

        // 1. Calculate Area and Perimeter of Rectangle
        // Hint: Area = l * b, Perimeter = 2 * (l + b)
        int l = 5, b = 3;
        int area = l * b;
        int perimeter = 2 * (l + b);
        System.out.println("1. Area: " + area);
        System.out.println("1. Perimeter: " + perimeter);
        // Explanation: Used * and + arithmetic operators

        System.out.println("------------------------------------------------");

        // 2. Swap Two Numbers Without Third Variable
        // Hint: a = a + b; b = a - b; a = a - b;
        int a = 10, b1 = 20;
        a = a + b1;
        b1 = a - b1;
        a = a - b1;
        System.out.println("2. Swapped a = " + a + ", b = " + b1);
        // Explanation: Used addition and subtraction to swap values

        System.out.println("------------------------------------------------");

        // 3. Calculate Simple Interest
        // Hint: SI = (P * R * T) / 100
        int P = 1000, R = 5, T = 2;
        int SI = (P * R * T) / 100;
        System.out.println("3. Simple Interest = " + SI);
        // Explanation: Used arithmetic formula for interest

        System.out.println("------------------------------------------------");

        // 4. Check Even or Odd
        // Hint: num % 2 == 0 means even
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("4. Even");
        } else {
            System.out.println("4. Odd");
        }
        // Explanation: Used modulus operator

        System.out.println("------------------------------------------------");

        // 5. Calculate Total and Percentage of 5 Subjects
        // Hint: Total = sum of marks, Percentage = total / 5
        int m1 = 70, m2 = 80, m3 = 90, m4 = 85, m5 = 75;
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;
        System.out.println("5. Total: " + total);
        System.out.println("5. Percentage: " + percentage + "%");
        // Explanation: Used + and / operators

        System.out.println("------------------------------------------------");

        // 6. Convert Celsius to Fahrenheit
        // Hint: F = (C * 9/5) + 32
        double C = 25;
        double F = (C * 9/5) + 32;
        System.out.println("6. Fahrenheit: " + F);
        // Explanation: Used conversion formula with *, /, +

        System.out.println("------------------------------------------------");

        // 7. Evaluate Expression a + b * c - d / e
        int a1 = 5, b2 = 3, c1 = 2, d = 10, e = 2;
        int result = a1 + b2 * c1 - d / e;
        System.out.println("7. Result of expression = " + result);
        // Explanation: Follows operator precedence (* and / before + and -)

        System.out.println("------------------------------------------------");

        // 8. Check Whether Two Numbers Are Equal
        // Hint: Use == operator
        int x = 10, y = 15;
        if (x == y) {
            System.out.println("8. Equal");
        } else {
            System.out.println("8. Not Equal");
        }
        // Explanation: Used equality operator ==

        System.out.println("------------------------------------------------");

        // 9. Increment and Decrement a Variable
        int z = 5;
        System.out.println("9. Original z: " + z);
        System.out.println("9. z++ = " + (z++));  // Post increment
        System.out.println("9. ++z = " + (++z));  // Pre increment
        System.out.println("9. z-- = " + (z--));  // Post decrement
        System.out.println("9. --z = " + (--z));  // Pre decrement
        // Explanation: Demonstrates pre and post increment/decrement

        System.out.println("------------------------------------------------");

        // 10. Check if a Year is Divisible by 4 and 100
        // Hint: year % 4 == 0 && year % 100 == 0
        int year = 1900;
        if (year % 4 == 0 && year % 100 == 0) {
            System.out.println("10. Year is divisible by both 4 and 100");
        } else {
            System.out.println("10. Year is not divisible by both");
        }
        // Explanation: Used modulus % and logical AND &&
    }
}


// -----------------------------------------------------



// Java Assignment Practice: If-Else Conditions
public class IfElseAssignments {
    public static void main(String[] args) {

        // 1. Check if number is positive, negative, or zero
        // Hint: Use if-else-if ladder
        int num1 = -5;
        if (num1 > 0) {
            System.out.println("1. Positive");
        } else if (num1 < 0) {
            System.out.println("1. Negative");
        } else {
            System.out.println("1. Zero");
        }
        // Explanation: Compared using relational operators >, <

        System.out.println("------------------------------------------------");

        // 2. Find the greatest of three numbers
        int a = 10, b = 20, c = 15;
        if (a >= b && a >= c) {
            System.out.println("2. A is greatest");
        } else if (b >= a && b >= c) {
            System.out.println("2. B is greatest");
        } else {
            System.out.println("2. C is greatest");
        }
        // Explanation: Used logical AND to compare all values

        System.out.println("------------------------------------------------");

        // 3. Check if number is divisible by 5 or 11
        int num2 = 55;
        if (num2 % 5 == 0 || num2 % 11 == 0) {
            System.out.println("3. Divisible by 5 or 11");
        } else {
            System.out.println("3. Not Divisible");
        }
        // Explanation: Used modulus and logical OR

        System.out.println("------------------------------------------------");

        // 4. Check if person is eligible to vote (age >= 18)
        int age = 17;
        if (age >= 18) {
            System.out.println("4. Eligible to vote");
        } else {
            System.out.println("4. Not eligible");
        }

        System.out.println("------------------------------------------------");

        // 5. Check whether character is vowel or consonant
        char ch = 'e';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("5. Vowel");
        } else {
            System.out.println("5. Consonant");
        }

        System.out.println("------------------------------------------------");

        // 6. Check leap year
        int year = 2024;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("6. Leap Year");
            } else {
                System.out.println("6. Not a Leap Year");
            }
        } else {
            System.out.println("6. Not a Leap Year");
        }

        System.out.println("------------------------------------------------");

        // 7. Check pass or fail (marks >= 40)
        int marks = 38;
        if (marks >= 40) {
            System.out.println("7. Pass");
        } else {
            System.out.println("7. Fail");
        }

        System.out.println("------------------------------------------------");

        // 8. Assign grade based on marks
        // A: 90+, B: 75–89, C: 60–74, D: <60
        int score = 78;
        if (score >= 90) {
            System.out.println("8. Grade A");
        } else if (score >= 75) {
            System.out.println("8. Grade B");
        } else if (score >= 60) {
            System.out.println("8. Grade C");
        } else {
            System.out.println("8. Grade D");
        }

        System.out.println("------------------------------------------------");

        // 9. Check triangle is valid based on 3 angles
        int angle1 = 60, angle2 = 60, angle3 = 60;
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("9. Valid Triangle");
        } else {
            System.out.println("9. Invalid Triangle");
        }

        System.out.println("------------------------------------------------");

        // 10. Check if number is even and divisible by 3
        int num3 = 12;
        if (num3 % 2 == 0 && num3 % 3 == 0) {
            System.out.println("10. Even and divisible by 3");
        } else {
            System.out.println("10. Condition not satisfied");
        }
    }
}





// Java Assignment Practice: Switch Statements
import java.util.Scanner;

public class SwitchAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Print day name based on number (1–7)
        int day = 3;
        switch (day) {
            case 1: System.out.println("1. Sunday"); break;
            case 2: System.out.println("1. Monday"); break;
            case 3: System.out.println("1. Tuesday"); break;
            case 4: System.out.println("1. Wednesday"); break;
            case 5: System.out.println("1. Thursday"); break;
            case 6: System.out.println("1. Friday"); break;
            case 7: System.out.println("1. Saturday"); break;
            default: System.out.println("1. Invalid Day");
        }
        // Explanation: Day numbers matched to case blocks

        System.out.println("------------------------------------------------");

        // 2. Simple calculator using switch ( +, -, *, / )
        int a = 10, b = 5;
        char op = '*';
        switch (op) {
            case '+': System.out.println("2. Sum: " + (a + b)); break;
            case '-': System.out.println("2. Difference: " + (a - b)); break;
            case '*': System.out.println("2. Product: " + (a * b)); break;
            case '/': System.out.println("2. Quotient: " + (a / b)); break;
            default: System.out.println("2. Invalid Operator");
        }

        System.out.println("------------------------------------------------");

        // 3. Display month name based on number (1–12)
        int month = 12;
        switch (month) {
            case 1: System.out.println("3. January"); break;
            case 2: System.out.println("3. February"); break;
            case 3: System.out.println("3. March"); break;
            case 12: System.out.println("3. December"); break;
            default: System.out.println("3. Unknown Month");
        }

        System.out.println("------------------------------------------------");

        // 4. Print weekday or weekend
        int dayNum = 6;
        switch (dayNum) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("4. Weekday"); break;
            case 6: case 7:
                System.out.println("4. Weekend"); break;
            default:
                System.out.println("4. Invalid");
        }

        System.out.println("------------------------------------------------");

        // 5. Menu driven area calculator
        int choice = 2;
        switch (choice) {
            case 1: // Area of circle
                double r = 4;
                System.out.println("5. Area of Circle: " + (3.14 * r * r));
                break;
            case 2: // Area of square
                int s = 5;
                System.out.println("5. Area of Square: " + (s * s));
                break;
            case 3: // Area of rectangle
                int l = 4, br = 6;
                System.out.println("5. Area of Rectangle: " + (l * br));
                break;
            default:
                System.out.println("5. Invalid Option");
        }

        System.out.println("------------------------------------------------");

        // 6. Season based on month
        int seasonMonth = 4;
        switch (seasonMonth) {
            case 3: case 4: case 5:
                System.out.println("6. Season: Spring"); break;
            case 6: case 7: case 8:
                System.out.println("6. Season: Summer"); break;
            case 9: case 10: case 11:
                System.out.println("6. Season: Autumn"); break;
            case 12: case 1: case 2:
                System.out.println("6. Season: Winter"); break;
            default:
                System.out.println("6. Invalid Month");
        }

        System.out.println("------------------------------------------------");

        // 7. Assign grade using switch
        char grade = 'B';
        switch (grade) {
            case 'A': System.out.println("7. Excellent"); break;
            case 'B': System.out.println("7. Good"); break;
            case 'C': System.out.println("7. Average"); break;
            default: System.out.println("7. Try Harder");
        }

        System.out.println("------------------------------------------------");

        // 8. Check vowel using switch
        char ch = 'i';
        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("8. Vowel"); break;
            default:
                System.out.println("8. Consonant");
        }

        System.out.println("------------------------------------------------");

        // 9. Language selection menu
        int lang = 3;
        switch (lang) {
            case 1: System.out.println("9. English"); break;
            case 2: System.out.println("9. Hindi"); break;
            case 3: System.out.println("9. Marathi"); break;
            default: System.out.println("9. Invalid language code");
        }

        System.out.println("------------------------------------------------");

        // 10. Check even/odd using switch
        int num = 11;
        switch (num % 2) {
            case 0: System.out.println("10. Even"); break;
            case 1: System.out.println("10. Odd"); break;
        }

        sc.close();





   // Java Assignment Practice: Loops (for, while, do-while)
public class LoopAssignments {
    public static void main(String[] args) {

        // 1. Print numbers from 1 to 100
        System.out.println("1. Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------------------------------");

        // 2. Print all even numbers from 1 to N
        int N = 20;
        System.out.println("2. Even numbers from 1 to " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println("\n------------------------------------------------");

        // 3. Print sum of first N natural numbers
        int num = 10, sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("3. Sum of first " + num + " numbers: " + sum);
        // Explanation: Sum updated in each loop iteration

        System.out.println("------------------------------------------------");

        // 4. Print table of a number
        int tableOf = 7;
        System.out.println("4. Table of " + tableOf);
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }

        System.out.println("------------------------------------------------");

        // 5. Find factorial of a number
        int factNum = 5, fact = 1;
        for (int i = 1; i <= factNum; i++) {
            fact *= i;
        }
        System.out.println("5. Factorial of " + factNum + " = " + fact);
        // Explanation: fact *= i repeatedly multiplies values

        System.out.println("------------------------------------------------");

        // 6. Print reverse of a number
        int revNum = 1234, rev = 0;
        while (revNum != 0) {
            rev = rev * 10 + revNum % 10;
            revNum /= 10;
        }
        System.out.println("6. Reversed number: " + rev);
        // Explanation: Extract last digit and shift

        System.out.println("------------------------------------------------");

        // 7. Check if number is palindrome
        int original = 121, reverse = 0, temp = original;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if (original == reverse) {
            System.out.println("7. Palindrome");
        } else {
            System.out.println("7. Not Palindrome");
        }

        System.out.println("------------------------------------------------");

        // 8. Count digits in a number
        int digitNum = 56789, count = 0;
        int tempNum = digitNum;
        while (tempNum != 0) {
            count++;
            tempNum /= 10;
        }
        System.out.println("8. Number of digits in " + digitNum + ": " + count);

        System.out.println("------------------------------------------------");

        // 9. Print Fibonacci series till N terms
        int terms = 10, a = 0, b = 1;
        System.out.println("9. Fibonacci Series (first " + terms + " terms):");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\n------------------------------------------------");

        // 10. Sum of digits of a number
        int digitSumNum = 12345, digitSum = 0;
        int tempVal = digitSumNum;
        do {
            digitSum += tempVal % 10;
            tempVal /= 10;
        } while (tempVal != 0);
        System.out.println("10. Sum of digits of " + digitSumNum + " = " + digitSum);
    }
}



















































/*
 * Java Arrays - Complete Notes with Examples and Assignments
 * Author: Shiddat Programming Institute
 * Description: This Java file contains deep detailed notes, examples,
 * and interview-level assignments with step-by-step explanations.
 */

public class JavaArraysCompleteNotes {

    public static void main(String[] args) {

        /*
         * ---------------------------
         * 1. Introduction to Arrays:
         * ---------------------------
         * An array in Java is a container object that holds a fixed number of values of a single type.
         * It is a data structure used to store multiple values in a single variable.
         *
         * Syntax:
         * dataType[] arrayName = new dataType[size];
         */

        int[] numbers = new int[5]; // Declare an integer array of size 5

        // Initializing values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing values
        System.out.println("Element at index 2: " + numbers[2]);

        /*
         * --------------------------------------
         * 2. Array Declaration and Initialization
         * --------------------------------------
         */

        int[] marks = { 90, 85, 70, 95, 88 }; // Declaration with initialization
        String[] names = new String[] { "Shahid", "Aman", "Rahul" }; // Another way

        /*
         * ----------------------------
         * 3. Types of Arrays in Java:
         * ----------------------------
         * - One-Dimensional Array
         * - Multi-Dimensional Array (2D, 3D, etc.)
         */

        // 1D Example:
        int[] age = { 18, 20, 22 };

        // 2D Array Example:
        int[][] matrix = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        System.out.println("2D Element [1][1]: " + matrix[1][1]);


          




        /*
         * -----------------------
         * 4. Array Iteration:
         * -----------------------
         */

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks[" + i + "]: " + marks[i]);
        }

        // Enhanced For Loop
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        /*
         * ---------------------------
         * 5. Common Array Methods:
         * ---------------------------
         * Arrays is a utility class in java.util package for array operations
         */

        java.util.Arrays.sort(marks); // Sorting array
        java.util.Arrays.fill(numbers, 100); // Fill all elements with 100
        int index = java.util.Arrays.binarySearch(marks, 85); // Binary search (must be sorted)

        System.out.println("Sorted Marks:");
        for (int mark : marks) System.out.print(mark + " ");
        System.out.println("\nIndex of 85 in sorted array: " + index);

        /*
         * -----------------------------------
         * 6. Multi-Dimensional Array Example
         * -----------------------------------
         */
        int[][] table = new int[3][3]; // 3x3 matrix
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = value++;
            }
        }

        // Printing 2D Array
        System.out.println("3x3 Matrix:");
        for (int[] row : table) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        /*
         * ----------------------
         * 7. Array Cloning:
         * ----------------------
         */
        int[] original = {1, 2, 3};
        int[] clone = original.clone();
        clone[0] = 99;
        System.out.println("Original[0]: " + original[0]); // Remains 1
        System.out.println("Clone[0]: " + clone[0]);       // Changed to 99

        /*
         * ---------------------------
         * 8. Jagged Arrays:
         * ---------------------------
         * A 2D array with different column sizes
         */
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[1];

        /*
         * ---------------------------
         * 9. Limitations of Arrays:
         * ---------------------------
         * - Fixed Size
         * - No built-in methods to add/remove elements (use ArrayList instead)
         * - No automatic resizing
         */

        /*
         * -----------------------------------
         * 10. Arrays Utility Class Methods:
         * -----------------------------------
         * - sort()
         * - fill()
         * - equals()
         * - copyOf()
         * - toString()
         */

        int[] a = {5, 2, 1};
        java.util.Arrays.sort(a);
        System.out.println("Sorted: " + java.util.Arrays.toString(a));

        int[] b = java.util.Arrays.copyOf(a, 5);
        System.out.println("Copied Array: " + java.util.Arrays.toString(b));

        boolean eq = java.util.Arrays.equals(a, b);
        System.out.println("Are a and b equal? " + eq);

        /*
         * -------------------------------
         * 11. Final Tips:
         * -------------------------------
         * - Always check array bounds
         * - Use enhanced for-loops when no index is needed
         * - Prefer ArrayList for dynamic data
         */

        // ----------------------------
        // Array Assignments + Answers
        // ----------------------------

        System.out.println("\n\n------ Array Assignments with Explanation ------");

        // Q1: Find maximum element in array
        int[] arr1 = {10, 25, 5, 90, 45};
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) max = arr1[i];
        }
        System.out.println("Q1. Max Element: " + max); // 90

        // Q2: Reverse an array
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp;
        }
        System.out.print("Q2. Reversed: ");
        for (int i : arr2) System.out.print(i + " ");
        System.out.println();

        // Q3: Sum of array
        int[] arr3 = {5, 5, 5};
        int sum = 0;
        for (int val : arr3) 
        sum += val;
        System.out.println("Q3. Sum: " + sum);

        // Q4: Check if array is sorted
        boolean sorted = true;
        int[] arr4 = {10, 20, 30, 40};
        for (int i = 0; i < arr4.length - 1; i++) {
            if (arr4[i] > arr4[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Q4. Is Sorted? " + sorted);

        // Q5: Find duplicate elements
        int[] arr5 = {1, 2, 3, 2, 4, 5, 1};
        System.out.print("Q5. Duplicates: ");
        for (int i = 0; i < arr5.length; i++) {
            for (int j = i + 1; j < arr5.length; j++) {
                if (arr5[i] == arr5[j]) {
                    System.out.print(arr5[i] + " ");
                    break;
                }
            }
        }

        // More 5 Assignments (Q6 to Q10) with explanations can be added on next update.
    }
} // End of Class













    }
}



