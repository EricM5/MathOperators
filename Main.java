import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.print("Please enter a number: ");
   double onenumber = in.nextInt();

   System.out.print("Please enter another number: ");
   double secondnumber = in.nextInt();
  
  double adding = onenumber + secondnumber;
  double subtracting = onenumber - secondnumber;
  double multiplying = onenumber * secondnumber;
  double dividing = onenumber / secondnumber;

   System.out.println(onenumber + " + " + secondnumber + " = " + adding);
   System.out.println(onenumber + " - " + secondnumber + " = " + subtracting);
   System.out.println(onenumber + " * " + secondnumber + " = " + multiplying);
   System.out.println(onenumber + " / " + secondnumber + " = " + dividing);
  }
}