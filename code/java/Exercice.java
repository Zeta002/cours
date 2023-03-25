import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Exercice {

   public static void PrintTriangularPattern() {
      System.out.println("* * * * *");
      System.out.println(" *     *");
      System.out.println("  *   *");
      System.out.println("   * *");
      System.out.println("    *");
   }

   public static void PrintCheckerPattern() {
      System.out.println("* * * * *");
      System.out.println(" * * * * *");
      System.out.println("* * * * *");
      System.out.println(" * * * * *");
      System.out.println("* * * * *");
   }  

   public static void PrintSquarePattern() {
      System.out.println("* * * * *");
      System.out.println("*       *");
      System.out.println("*       *");
      System.out.println("*       *");
      System.out.println("* * * * *");
   }

   public static void PrintStarPattern() {
      System.out.println("    *");
      System.out.println("* *   * *");
      System.out.println("   * *");
      System.out.println("  *   *");
      System.out.println("*      *");
   }

   public static void PrintSheepPattern() {
      System.out.println("          '__'");
      System.out.println("          (oo)");
      System.out.println("  /========//");
      System.out.println(" / || @@ ||");
      System.out.println("   ||----||");
      System.out.println("   VV    VV");
      System.out.println("   ''    ''");
   }

   public static void FiveIntegerSum() {
      int number1 = 11;
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;

      int sum;

      sum = number1 + number2 + number3 + number4 + number5;

      System.out.print("The sum is ");

      System.out.println(sum);
   }

   public static void SixIntegerSum() {
      int number1 = 11;
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;
      int number6 = 66;

      int sum;

      sum = number1 + number2 + number3 + number4 + number5 + number6;

      System.out.print("The sum is ");

      System.out.println(sum);
   }

   public static void SevenIntegerSum() {
      int number1 = 11;
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;
      int number6 = 66;
      int number7 = 77;

      int sum;

      sum = number1 + number2 + number3 + number4 + number5 + number6 + number7;

      System.out.print("The sum is ");

      System.out.println(sum);
   }

   public static void FiveIntegerProduct() {
      int number1 = 11;
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;

      int sum;

      sum = number1 * number2 * number3 * number4 * number5;

      System.out.print("The sum is ");

      System.out.println(sum);
   }

   public static void circleComputation() {
      // Declare 3 double variables to hold radius, area and circumference.
      // A "double" holds floating-point number with an optional fractional part.
      double radius, area, circumference;
      // Declare a double to hold PI.
      // Declare as "final" to specify that its value cannot be changed (i.e.
      // constant).
      final double PI = 3.14159265;

      // Assign a value to radius. (We shall read in the value from the keyboard
      // later.)
      radius = 1.2;
      // Compute area and circumference
      area = radius * radius * PI;
      circumference = 2.0 * radius * PI;

      // Print results
      System.out.print("The radius is "); // Print description
      System.out.println(radius); // Print the value stored in the variable
      System.out.print("The area is ");
      System.out.println(area);
      System.out.print("The circumference is ");
      System.out.println(circumference);
   }

   public static void rectangleComputation() {
      double width, lenght, area, perimeter;
      width = 10;
      lenght = 20;
      area = width * lenght;
      perimeter = width * 2 + lenght * 2;

      System.out.println("Width is : " + width);
      System.out.println("Lenght is : " + lenght);
      System.out.println("Perimeter is : " + perimeter);
      System.out.println("Area is : " + area);
   }

   public static void cylinderComputation() {
      double radius, height, surfaceArea, baseArea, volume;
      final double PI = 3.14159265;
      radius = 10;
      height = 30;
      baseArea = PI * Math.pow(radius, 2);
      surfaceArea = baseArea * height;

      System.out.println("Radius is : " + radius);
      System.out.println("Height is : " + height);
      System.out.println("Base area is : " + baseArea);
      System.out.println("Surface area is : " + surfaceArea);
   }

   public static void ArithmeticTest() {
      int number1 = 98; // Declare an int variable number1 and initialize it to 98
      int number2 = 5; // Declare an int variable number2 and initialize it to 5
      int sum, difference, product, quotient, remainder; // Declare 5 int variables to hold results

      // Perform arithmetic Operations
      sum = number1 + number2;
      difference = number1 - number2;
      product = number1 * number2;
      quotient = number1 / number2;
      remainder = number1 % number2;

      // Print results
      System.out.print("The sum, difference, product, quotient and remainder of "); // Print description
      System.out.print(number1 + " and "); // Print the value of the variable
      System.out.print(number2 + " are ");
      System.out.print(sum + ", ");
      System.out.print(difference + ", ");
      System.out.print(product + ", ");
      System.out.print(quotient + ", and ");
      System.out.println(remainder);

      ++number1; // Increment the value stored in the variable "number1" by 1
                 // Same as "number1 = number1 + 1"
      --number2; // Decrement the value stored in the variable "number2" by 1
                 // Same as "number2 = number2 - 1"
      System.out.println("number1 after increment is " + number1); // Print description and variable
      System.out.println("number2 after decrement is " + number2);
      quotient = number1 / number2;
      System.out.println("The new quotient of " + number1 + " and " + number2
            + " is " + quotient);
   }

   public static void math1() {
      int number1 = 2;
      int number2 = 10;
      System.out.println(31 * number1 + 17 * number2);
   }

   public static void math2() {
      int number1 = 2;
      int number2 = 10;
      int number3 = 5;
      int sumOfNumber = number1 + number2 + number3;
      int productOfNumber = number1 * number2 * number3;
      System.out.println("Sum of the numbers : " + sumOfNumber);
      System.out.println("Product of the numbers : " + productOfNumber);
   }

   public static void runningNumberSum() {
      final int LOWERBOUND = 9; // Store the lowerbound
      final int UPPERBOUND = 899; // Store the upperbound
      int sum = 0; // Declare an int variable "sum" to accumulate the numbers
                   // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each
         // iteration
         sum = sum + number; // Accumulate number into sum
         ++number; // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void runningNumberOddSum() {
      final int LOWERBOUND = 1; // Store the lowerbound
      final int UPPERBOUND = 1000; // Store the upperbound
      int sum = 0; // Declare an int variable "sum" to accumulate the numbers
                   // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each
         // iteration
         sum = sum + number; // Accumulate number into sum
         number = number + 2; // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void runningNumberMod7Sum() {
      final int LOWERBOUND = 7; // Store the lowerbound
      final int UPPERBOUND = 1000; // Store the upperbound
      int sum = 0; // Declare an int variable "sum" to accumulate the numbers
                   // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each
         // iteration
         if (number % 7 == 0)
            sum = sum + number; // Accumulate number into sum
         number = number + 7; // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void runningNumberSquareSum() {
      final int LOWERBOUND = 1; // Store the lowerbound
      final int UPPERBOUND = 100; // Store the upperbound
      int sum = 0; // Declare an int variable "sum" to accumulate the numbers
                   // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each
         // iteration
         sum = sum + number * number; // Accumulate number into sum
         ++number; // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void runningNumberProduct() {
      final int LOWERBOUND = 1; // Store the lowerbound
      final int UPPERBOUND = 10; // Store the upperbound
      int product = 1; // Declare an int variable "sum" to accumulate the numbers
      // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each
         // iteration
         product = product * number; // Accumulate number into sum
         ++number; // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);
   }

   public static void threeFiveSevenSum() {
      final int LOWERBOUND = 1; // Store the lowerbound
      final int UPPERBOUND = 1000; // Store the upperbound
      int sum = 0; // Declare an int variable "sum" to accumulate the numbers
                   // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
         // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each
         // iteration
         if ((number % 3 == 0 || number % 5 == 0 || number % 7 == 0)
               && !(number % 15 == 0 || number % 21 == 0 || number % 35 == 0 || number % 105 == 0))
            sum = sum + number; // Accumulate number into sum
         ++number; // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void printLeapYears() {
      final int startYear = 999;
      final int stopYear = 2010;
      int count = 0;
      int start = startYear;
      int stop = stopYear;
      while (start <= stop) {
         if (((start % 4 == 0) && (start % 100 != 0)) || (start % 400 == 0))
            ++count;
         ++start;
      }
      System.out.println("Number off leap years between " + startYear + " and " + stopYear + " is " + count);
   }

   public static void checkPassFail() {
      int mark = 50;

      System.out.println("Mark is : " + mark);

      if (mark >= 50)
         System.out.println("PASS");
      else
         System.out.println("FAIL");

      System.out.println("DONE");
   }

   public static void checkOddEven() {
      int number = -2;

      if (number % 2 == 0)
         System.out.println(number + " is an even number");
      else
         System.out.println(number + " is and odd number");

      System.out.println("bye");
   }

   public static void printNumberInWord() {
      int number = 10;

      // if / else if

      System.out.println("With if / else if : ");

      if (number == 1)
         System.out.println("ONE");
      else if (number == 2)
         System.out.println("TWO");
      else if (number == 3)
         System.out.println("THREE");
      else if (number == 4)
         System.out.println("FOUR");
      else if (number == 5)
         System.out.println("FIVE");
      else if (number == 6)
         System.out.println("SIX");
      else if (number == 7)
         System.out.println("SEVEN");
      else if (number == 8)
         System.out.println("EIGHT");
      else if (number == 9)
         System.out.println("NINE");
      else if (number == 10)
         System.out.println("TEN");

      // switch case

      System.out.println("With switch case : ");

      switch (number) {
         case 1:
            System.out.println("ONE");
            break;
         case 2:
            System.out.println("TWO");
            break;
         case 3:
            System.out.println("THREE");
            break;
         case 4:
            System.out.println("FOUR");
            break;
         case 5:
            System.out.println("FIVE");
            break;
         case 6:
            System.out.println("SIX");
            break;
         case 7:
            System.out.println("SEVEN");
            break;
         case 8:
            System.out.println("EIGHT");
            break;
         case 9:
            System.out.println("NINE");
            break;
         case 10:
            System.out.println("TEN");
            break;

         default:
            System.out.println("OUT OF RANGE");
            break;
      }
   }

   public static void printDayInWord() {
      int day = 6;

      // if / else if

      System.out.println("With if / else if : ");

      if (day == 0)
         System.out.println("monday");
      else if (day == 1)
         System.out.println("tuesday");
      else if (day == 2)
         System.out.println("wednesday");
      else if (day == 3)
         System.out.println("thursday");
      else if (day == 4)
         System.out.println("friday");
      else if (day == 5)
         System.out.println("saturday");
      else if (day == 6)
         System.out.println("sunday");

      else
         System.out.println("Not a valid day");

      // switch case

      System.out.println("With switch case : ");

      switch (day) {
         case 0:
            System.out.println("monday");
            break;
         case 1:
            System.out.println("tuesday");
            break;
         case 2:
            System.out.println("wednesday");
            break;
         case 3:
            System.out.println("thursday");
            break;
         case 4:
            System.out.println("friday");
            break;
         case 5:
            System.out.println("saturday");
            break;
         case 6:
            System.out.println("sunday");
            break;

         default:
            System.out.println("Not a valid day");
            break;
      }
   }

   public static void add2Integer() {
      int number1, number2, sum;

      Scanner in = new Scanner(System.in);

      System.out.print("Enter the first integer : ");
      number1 = in.nextInt();
      System.out.print("Enter the second integer : ");
      number2 = in.nextInt();

      sum = number1 + number2;

      System.out.println("The sum of the two integer is : " + number1 + " + " + number2 + " = " + sum);
      in.close();
   }

   public static void oddEven() {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter an integer : ");
      int number = in.nextInt();

      if (number % 2 == 0)
         System.out.println("The integer " + number + " is even");
      else
         System.out.println("The integer " + number + " is odd");

      in.close();
   }

   public static void multiple() {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a first integer : ");
      int number1 = in.nextInt();
      System.out.print("Enter a second integer : ");
      int number2 = in.nextInt();

      if (number2 % number1 == 0)
         System.out.println(number1 + " is a multiple of " + number2);
      else
         System.out.println(number1 + " is not a multiple of " + number2);

      in.close();
   }

   public static void sumProductMinMax3() {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter 1st integer : ");
      int number1 = in.nextInt();
      System.out.print("Enter 2nd integer : ");
      int number2 = in.nextInt();
      System.out.print("Enter 3rd integer : ");
      int number3 = in.nextInt();

      int sum = number1 + number2 + number3, product = number1 * number2 * number3;
      int min, max;

      if (number1 < number2 && number1 < number3)
         min = number1;
      min = (number1 < number2 && number1 < number3) ? number2 : number3;

      if (number1 > number2 && number1 > number3)
         max = number1;
      max = (number1 > number2 && number1 > number3) ? number2 : number3;

      System.out.println("Sum : " + sum);
      System.out.println("Product : " + product);
      System.out.println("Min : " + min);
      System.out.println("Max : " + max);

      in.close();
   }

   public static void sumProductMinMax5() {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter 1st integer : ");
      int number1 = in.nextInt();
      System.out.print("Enter 2nd integer : ");
      int number2 = in.nextInt();
      System.out.print("Enter 3rd integer : ");
      int number3 = in.nextInt();
      System.out.print("Enter 4th integer : ");
      int number4 = in.nextInt();
      System.out.print("Enter 5th integer : ");
      int number5 = in.nextInt();

      int sum = number1 + number2 + number3 + number4 + number5;
      int product = number1 * number2 * number3 * number4 * number5;
      int min, max;

      if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5)
         min = number1;
      else if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5)
         min = number2;
      else if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5)
         min = number3;
      else
         min = (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5) ? number4 : number5;

      if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5)
         max = number1;
      else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5)
         max = number2;
      else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5)
         max = number3;
      else
         max = (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) ? number4 : number5;

      System.out.println("Sum : " + sum);
      System.out.println("Product : " + product);
      System.out.println("Min : " + min);
      System.out.println("Max : " + max);

      in.close();
   }

   public static void printDayInWord2() {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter an integer between 0 and 6 : ");
      int number = in.nextInt();

      switch (number) {
         case 0:
            System.out.println("Monday");
            break;
         case 1:
            System.out.println("Tuesday");
            break;
         case 2:
            System.out.println("Wednesday");
            break;
         case 3:
            System.out.println("Thursday");
            break;
         case 4:
            System.out.println("Friday");
            break;
         case 5:
            System.out.println("Saturday");
            break;
         case 6:
            System.out.println("Sunday");
            break;

         default:
            System.out.println("Out of range number");
            break;
      }

      System.out.println("Bye fils de palmier");

      in.close();
   }

   public static void printNumberInWord2() {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a number between 0 and 9 : ");
      int number = in.nextInt();

      in.close();

      switch (number) {
         case 0:
            System.out.println("ZERO");
            break;
         case 1:
            System.out.println("ONE");
            break;
         case 2:
            System.out.println("TWO");
            break;
         case 3:
            System.out.println("THREE");
            break;
         case 4:
            System.out.println("FOUR");
            break;
         case 5:
            System.out.println("FIVE");
            break;
         case 6:
            System.out.println("SIX");
            break;
         case 7:
            System.out.println("SEVEN");
            break;
         case 8:
            System.out.println("EIGHT");
            break;
         case 9:
            System.out.println("NINE");
            break;

         default:
            System.out.println("OTHER");
            break;

      }
   }

   public static void rectangleComputation2() {
      Scanner in = new Scanner(System.in);

      System.out.print("Lenght : ");
      int lenght = in.nextInt();
      System.out.print("Width : ");
      int width = in.nextInt();

      int perimeter = lenght * 2 + width * 2;
      int area = lenght * width;

      System.out.println("Perimeter : " + perimeter);
      System.out.println("Area : " + area);

      in.close();
   }

   public static void circleComputation2() {
      Scanner in = new Scanner(System.in);

      System.out.print("Radius : ");
      double radius = in.nextDouble();

      double area = Math.PI * radius * radius;
      double surfaceArea = 4.0 * Math.PI * radius * radius;
      double diameter = 2.0 * radius;
      double circumference = 2.0 * Math.PI * radius;
      double volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;

      System.out.printf("Diameter : %.2f%n", diameter);
      System.out.printf("circumference : %.2f%n", circumference);
      System.out.printf("Area : %.2f%n", area);
      System.out.printf("Surface area : %.2f%n", surfaceArea);
      System.out.printf("Volume : %.2f%n", volume);

      in.close();
   }

   public static void cylinderComputation2() {
      Scanner in = new Scanner(System.in);

      System.out.print("Radius : ");
      double radius = in.nextDouble();
      System.out.print("Height : ");
      double height = in.nextDouble();

      double surfaceArea, baseArea, volume;

      baseArea = Math.PI * Math.pow(radius, 2.0);
      surfaceArea = 2.0 * Math.PI * radius * height + 2.0 * baseArea;
      volume = baseArea * height;

      System.out.printf("Radius : %.2f%n", radius);
      System.out.printf("Height : %.2f%n", height);
      System.out.printf("Base area : %.2f%n", baseArea);
      System.out.printf("Surface area : %.2f%n", surfaceArea);
      System.out.printf("Volume : %.2f%n", volume);

      in.close();
   }

   public static void swapIntegers() {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the 1st integer : ");
      int nb1 = in.nextInt();
      System.out.print("Enter the 2nd integer : ");
      int nb2 = in.nextInt();
      
      System.out.println("nb1 = " + nb1);
      System.out.println("nb2 = " + nb2);

      int tmp = nb1;
      nb1 = nb2;
      nb2 = tmp;
      
      System.out.println("nb1 = " + nb1);
      System.out.println("nb2 = " + nb2);

      in.close();
   }

   public static void sumAvergage (){
      Scanner in = new Scanner(System.in);

      int sum = 0;
      double avg = 0;

      System.out.print("Enter the lowerbound : ");
      final int LOWERBOUND = in.nextInt();
      System.out.print("Enter the upperbound : ");
      final int UPPERBOUND = in.nextInt();

      for (int i = LOWERBOUND ; i <= UPPERBOUND ; ++i){
         sum += i;
         avg += (double)i;
      }

      avg /= ((double)UPPERBOUND - (double)LOWERBOUND + 1);

      System.out.println("Sum : " + sum);
      System.out.printf("Avg : %.2f%n", avg);

      in.close();
   }

   public static void incomeTaxCalculator (){
      Scanner in = new Scanner(System.in);

      System.out.print("Income : ");
      double income = in.nextDouble();

      final double TAX_RATE_ABOVE_20K = .1;
      final double TAX_RATE_ABOVE_40K = .2;
      final double TAX_RATE_ABOVE_60K = .3;

      System.out.println("Before taxes : " + income);
      
      if (income > 60000) income *= TAX_RATE_ABOVE_60K;
      else if (income > 40000) income *= TAX_RATE_ABOVE_40K;
      else if (income > 20000) income *= TAX_RATE_ABOVE_20K;
      
      System.out.printf("After taxes : %.2f%n", income);

      in.close();
   }

   public static void incomeTaxCalculatorWithSentinel (){
      Scanner in = new Scanner(System.in);

      double income = 0;

      while (income != -1.0){
         System.out.print("Income : ");
         income = in.nextDouble();

         if (income == -1) break;

         final double TAX_RATE_ABOVE_20K = .1;
         final double TAX_RATE_ABOVE_40K = .2;
         final double TAX_RATE_ABOVE_60K = .3;

         System.out.println("Before taxes : " + income);
      
         if (income > 60000) income *= TAX_RATE_ABOVE_60K;
         else if (income > 40000) income *= TAX_RATE_ABOVE_40K;
         else if (income > 20000) income *= TAX_RATE_ABOVE_20K;
      
         System.out.printf("After taxes : %.2f%n", income);
      }
      in.close();
   }

   public static void pensionContributionCalculator (){
      final int CONTRIBUTION_CELLING = 6000;

      final double EMPLOYEE_RATE_55 = .2;
      final double EMPLOYER_RATE_55 = .17;
      final double EMPLOYEE_RATE_55_60 = .13;
      final double EMPLOYER_RATE_55_60 = .13;
      final double EMPLOYEE_RATE_60_65 = .75;
      final double EMPLOYER_RATE_60_65 = .9;
      final double EMPLOYEE_RATE_65 = .5;
      final double EMPLOYER_RATE_65 = .75;

      Scanner in = new Scanner(System.in);

      System.out.print("Age : ");
      int age = in.nextInt();
      System.out.print("Salary : ");
      double salary = in.nextDouble();

      double contributionEmployee;
      double contributionEmployer;

      if (age > 65){
         contributionEmployee = salary * EMPLOYEE_RATE_65;
         contributionEmployer = salary * EMPLOYER_RATE_65;
      }
      else if (age > 60){
         contributionEmployee = salary * EMPLOYEE_RATE_60_65;
         contributionEmployer = salary * EMPLOYER_RATE_60_65;
      }
      else if (age > 55){
         contributionEmployee = salary * EMPLOYEE_RATE_55_60;
         contributionEmployer = salary * EMPLOYER_RATE_55_60;
      }
      else{
         contributionEmployee = salary * EMPLOYEE_RATE_55;
         contributionEmployer = salary * EMPLOYER_RATE_55;
      }

      double totalContribution = contributionEmployee + contributionEmployer;

      if (totalContribution >= CONTRIBUTION_CELLING) totalContribution = CONTRIBUTION_CELLING;

      System.out.printf("Employee contribution : %.2f%n", contributionEmployee);
      System.out.printf("Employer contribution : %.2f%n", contributionEmployer);
      System.out.printf("Total contribution = %.2f%n", totalContribution);

      in.close();
   }

      public static void pensionContributionCalculatorWithSentinel (){
      final int CONTRIBUTION_CELLING = 6000;

      final double EMPLOYEE_RATE_55 = .2;
      final double EMPLOYER_RATE_55 = .17;
      final double EMPLOYEE_RATE_55_60 = .13;
      final double EMPLOYER_RATE_55_60 = .13;
      final double EMPLOYEE_RATE_60_65 = .75;
      final double EMPLOYER_RATE_60_65 = .9;
      final double EMPLOYEE_RATE_65 = .5;
      final double EMPLOYER_RATE_65 = .75;
      double contributionEmployee;
      double contributionEmployer;
      int sentinel = -1;
      int age = 0;
      double salary = 0;
      double totalContribution = 0;

      Scanner in = new Scanner(System.in);
      while (salary != sentinel){
         System.out.print("Age : ");
         age = in.nextInt();
         System.out.print("Salary : ");
         salary = in.nextDouble();

         if (age > 65){
            contributionEmployee = salary * EMPLOYEE_RATE_65;
            contributionEmployer = salary * EMPLOYER_RATE_65;
         }
         else if (age > 60){
            contributionEmployee = salary * EMPLOYEE_RATE_60_65;
            contributionEmployer = salary * EMPLOYER_RATE_60_65;
         }
         else if (age > 55){
            contributionEmployee = salary * EMPLOYEE_RATE_55_60;
            contributionEmployer = salary * EMPLOYER_RATE_55_60;
         }
         else{
            contributionEmployee = salary * EMPLOYEE_RATE_55;
            contributionEmployer = salary * EMPLOYER_RATE_55;
         }

         totalContribution = contributionEmployee + contributionEmployer;

         if (totalContribution >= CONTRIBUTION_CELLING) totalContribution = CONTRIBUTION_CELLING;

         System.out.printf("Employee contribution : %.2f%n", contributionEmployee);
         System.out.printf("Employer contribution : %.2f%n", contributionEmployer);
         System.out.printf("Total contribution = %.2f%n", totalContribution);
         }
      
         in.close();
      }

      public static void salesTaxCalculator (){
         Scanner in = new Scanner(System.in);

         double price = 0;
         double priceTmp = 0;
         double priceTaxes = 0;
         double totalPrice = 0;
         double totalTaxes = 0;
         final double TAX = .07;
         final double SENTINEL = -1.0;

         while (priceTmp != SENTINEL){
            System.out.print("Price : ");
            priceTmp = in.nextDouble();

            if (priceTmp == SENTINEL) break;

            price = priceTmp;
            System.out.printf("Price before taxes : %.2f%n", price);
            totalPrice += price;
            priceTaxes = price * TAX;
            totalTaxes += priceTaxes;
            price -= priceTaxes;
            System.out.printf("Price taxes : %.2f%n", priceTaxes);
            System.out.printf("Price after taxes : %.2f%n", price);
         }

         System.out.printf("Total price : %.2f%n", totalPrice);
         System.out.printf("Total taxes : %.2f%n", totalTaxes);
         in.close();
      }
   public static void main(String[] args) {
      salesTaxCalculator();
   }
}
