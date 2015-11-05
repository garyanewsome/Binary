/*
 * This serves as a driver for a simple binary password class
 */
package binarypasswordapp;

/**
 *
 * @author garyanewsome
 */
public class BinaryPasswordApp {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    BinaryPassword psswrd = new BinaryPassword();

    int login = psswrd.checkPassword();

    if (login != 0) {
      println("Welcome.");
    } else {
      println("Login: FAILURE. Have a pleasanat day.");
    }

  } // end main

  public static void println(String msg) {
    System.out.println(msg);
  } // end println

} // end BinaryPasswordApp

