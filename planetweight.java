import java.util.Scanner;

public class planetweight
{
    public static void main( String[] args )
    {
      Scanner keyboard = new Scanner(System.in);
      double earthWeight;
      int planet;


      System.out.println("Please enter your current weight relative to earth(in pounds):");
      earthWeight = keyboard.nextDouble();

      System.out.println("I have information for the following planets:\n1.Venus\n2.Mars\n3.Jupiter\n4.Saturn\n5.Uranus\n6.Neptune");

      System.out.println("Which planet are you visiting?");
      planet = keyboard.nextInt();

      if (planet == 1) {
      earthWeight = earthWeight * 0.78;
      }
      else if (planet == 2) {
        earthWeight = earthWeight * 0.39;
      }
      else if (planet == 3) {
        earthWeight = earthWeight * 2.65;
      }
      else if (planet == 4) {
        earthWeight = earthWeight * 1.17;
      }
      else if (planet == 5) {
        earthWeight = earthWeight * 1.05;
      }
      else if (planet == 6) {
        earthWeight = earthWeight * 1.23;
      }
      else {
        System.out.println("Error");
        }
    System.out.println("Your weight on that planet is \n" + earthWeight + "pounds\nsafe travels");
    }
}
