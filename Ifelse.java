import java.util.*;

// if-else practice questions

// ------------positive or negetive number--------------1

/*
   public class Ifelse {
   
   public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR NUMBER");
   
   int num = sc.nextInt();
   
   if (num >= 0) {
   System.out.println("positive number ");
   
   }else{
   System.out.println("negative number");
   }
   }
   }
 */

// ---------------even or odd number-----------------2

/*
   public class Ifelse {
   public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   
   System.out.println("ENTER YOUR NUMBER");
   
   int num = sc.nextInt();
   
   if(num % 2 == 0){
   System.out.println("EVEN");
   }else{
   System.out.println("ODD");
   }
   }
   
   }
 */

// --------------Check eligible for vote------------3

/*
   public class Ifelse {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR AGE");
   int age = sc.nextInt();
   
   if(age >= 18){
   System.out.println("Eligible for vote");
   }else{
   System.out.println("Not eligible for vote");
   }
   }
   }
 */

// ------------Vowel and consonent----------------4

/*
   public class Ifelse {
   
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR ALPHABET");
   int alpha = sc.next().charAt(0);
   
   
   if(alpha == 'e' || alpha == 'a' || alpha == 'i' || alpha == 'o' || alpha ==
   'u' ){
   System.out.println("It is vowel");
   }else{
   System.out.println("It is consonent");
   }
   }
   }
 */

// --------------student score---------------5


 /*public class Ifelse {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR MARKS");
   int marks = sc.nextInt();
   if(marks >= 90){
   System.out.println("A GRADE");
   }
   else if(marks >= 70){
   System.out.println("B GRADE");
   }
   else if(marks >= 50){
   System.out.println("C GRADE");
   }
   else if(marks >= 35){
   System.out.println("D GRADE");
   }
   else{
   System.out.println("Fail");
   }
   }
 
 }*/


// ----------------check range----------------6

/*
   public class Ifelse {
   
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR NUMBER");
   int num = sc.nextInt();
   if(num <= 100){
   System.out.println("In range");
   }else{
   System.out.println("Not in range");
   }
   }
   }
 */

// ----------------find max number----------7

/*
   public class Ifelse {
   
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR NUMBERS");
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   
   if (a > b && a > c) {
   System.out.println("A is greter");
   } else if (b > a && b > c) {
   System.out.println("B is greter");
   }
   
   else if (c > a && c > b) {
   System.out.println("C is greter");
   }
   }
   }
 */

// -------------check if year is leap------------8

/*
   public class Ifelse {
   
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR YEAR");
   int year = sc.nextInt();
   if((year % 4==0) && (year % 100!=0) || (year % 400 ==0)){
   System.out.println(year + " : " + "Year is leap");
   }else{
   System.out.println(year + " : " + "year is not leap");
   }
   }
   }
 */

// -----------------switch case------------------9

/*
   public class Ifelse {
   
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR DAY NUMBER");
   int day = sc.nextInt();
   switch (day) {
   case 1:
   System.out.println("MONDAY");
   break;
   
   case 2:
   System.out.println("TUSEDAY");
   break;
   
   case 3:
   System.out.println("WEDNESDAY");
   break;
   
   case 4:
   System.out.println("THURSDAY");
   break;
   
   case 5:
   System.out.println("FRIDAY");
   break;
   
   case 6:
   System.out.println("SURTADAY");
   break;
   
   case 7:
   System.out.println("SUNDAY");
   break;
   
   
   default:
   System.out.println("Invalid number");
   break;
   }
   
   
   }
   }
 */

// --------------- check Teenagers age-----------------10

/*
   public class Ifelse {
   
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR AGE");
   int age = sc.nextInt();
   if (age >= 13 && age <= 19) {
   System.out.println("Teenager");
   } else {
   System.out.println("Not teenager");
   }
   
   }
   }
 */

// -----------------discount eligible---------------------11

/*
   public class Ifelse {
   
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER YOUR AGE");
   int age = sc.nextInt();
   if(age >=60){
   System.out.println("Eligible for senior citizen discount");
   }else{
   System.out.println("Not eligible");
   }
   }
   }
 */

// ----------------multiple of 3 and even---------------12

/*
  public class Ifelse {
  
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER YOUR NUMBER");
  int num = sc.nextInt() ;
  if(num%3==0 && num%2==0){
  System.out.println("Multiply of 3 and Even number");
  }else{
  System.out.println("Not multiply of 3 and Even number ");
  }
  
  
  }
  }
 */
