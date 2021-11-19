import java.util.*;
public class GuessNumbers {
  private static boolean gameOn = false;

  public static int[] rand() {
    int[] eightInt = new int[8];
    for (int i = 0; i < eightInt.length; i++) {
      eightInt[i] = (int) (Math.random()* 7);
    }
    return eightInt;
  }


  public static void guessed(int[] code) {
    
    int[] secretCode = new int[4];
    for (int i = 0; i < secretCode.length; i++) {
      secretCode[i] = code[i];
    }
    System.out.println(Arrays.toString(secretCode));

    gameOn = true;
    int counter = 0;
    
    String sec = Arrays.toString(secretCode);
    String crac = "";

    while (counter < 10) {
      System.out.println("Guess the numbers");
      Scanner input = new Scanner(System.in);
      int a = -1;
      int b = -1;
      int c = -1;
      int d = -1;

      for (int i = 0; i < 4; i++) {
        System.out.println("Please enter the " + (i+1) +  " col location");
        int choiceLocation = input.nextInt();  
        System.out.println("Please enter the cracker value");
        int value = input.nextInt();

        if (choiceLocation == 1)
          a = value;
        else if (choiceLocation == 2)
          b = value;
        else if (choiceLocation == 3)
          c = value;
        else if (choiceLocation == 4)
          d = value;
        else {
            System.out.println("Please enter the col location again");
              choiceLocation = input.nextInt();  
            System.out.println("Please enter the cracker value");
              value = input.nextInt();
        }
        
      }
      System.out.println(a + " " + b + " " + c + " " + d);
      
      String hints = "";

      for (int i = 0; i < secretCode.length; i++) {
        // a == secretCode[i]? hints += "*": hints += "t"; 
        if (a == secretCode[i])
        {
            hints += "| * |";
            crac += a;
        }
          
        else if (b == secretCode[i])
        {
          hints += "| * |";
            crac += b;
        } 
        else if (c == secretCode[i])
        {
          hints += "| * |";
            crac += c;
        }
        else if (d == secretCode[i])
          {
            hints += "| * |";
            crac += d;
          }
        else 
          hints += "| Y |";
      }
      System.out.println(hints);
      if (crac.equals(sec)) {
        break;
      }
      counter++;
      if (counter== 10) gameOn=false; 
      // gameOn = false;
    }
  }

}
