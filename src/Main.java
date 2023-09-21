import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      System.out.println("Input num one ");
      int numOne = scanner.nextInt();
        System.out.println("Input num Two ");
      int numTwo = scanner.nextInt();
      int resultOne = add(numOne,numTwo);
      System.out.println(resultOne);
      scanner.nextLine();

      System.out.println("Please input your name");
      String name = scanner.nextLine();
      String resultTwo = greeting(name);
      System.out.println(resultTwo);


      System.out.println("Input first number ");
      int numberOne = scanner.nextInt();
      System.out.println("Input second number ");
      int numberTwo = scanner.nextInt();
      System.out.println("Input num three ");
      int numThree = scanner.nextInt();
      System.out.println("Input num four ");
      int numFour = scanner.nextInt();
      int resultThree = add(numberOne,numberTwo,numThree,numFour);
      System.out.print(resultThree);

      System.out.println('\n');
      scanner.nextLine();
      System.out.println("Write something you want to be printed back to you");
      String toBePrinted = scanner.nextLine();
      System.out.print(printMe(toBePrinted));
    }
    public static int add ( int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "Bonjour " + name + "!";
    }
    public static int add ( int numOne, int numTwo, int numThree, int numFour){
        return add(numOne, numTwo) + add(numThree, numFour) + add(0,0);
    }
    public static String printMe(String toBePrinted){
        return toBePrinted;
    }
}
