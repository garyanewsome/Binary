/*
 * This class will accept a users input and validate the entry 
 * program will then return a
 * 1 for authenticated and 0 for failed
 * - By default this program will change the password for each incorrect
 * attempt, up until the maximum incorrects are entered
 */
package binarypasswordapp;

import java.util.Scanner;

/**
 *
 * @author garyanewsome
 */
public class BinaryPassword {

  Scanner keyboard = new Scanner(System.in);

  private int binPassword1;
  private int binPassword2;
  private int binPassword3;

  public BinaryPassword() {
    this.binPassword1 = 1010110;
    this.binPassword2 = 1001011;
    this.binPassword3 = 1000101;
  }

  public int checkPassword() {
    print("Greetings: ");
    int login = keyboard.nextInt();
    if (login == binPassword1) {
      return 1;
    } else {
      print("Greetings? ");
      login = keyboard.nextInt();
      if (login == binPassword2) {
        return 1;
      } else {
        print("Hello??? ");
        login = keyboard.nextInt();
        if (login == binPassword3) {
          return 1;
        } else {
          return 0;
        }
      }

    }

  } // end checkPassword 

  public void print(String msg) {
    System.out.print(msg);
  } // end print

  public void println(String msg) {
    System.out.println(msg);
  } // end println

} // end BinaryPassword
