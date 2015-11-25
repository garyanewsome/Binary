/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passworddriver;

/**
 *
 * @author Gary
 */
public class PasswordDriver {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    BinaryPassword psswrd = new BinaryPassword();

    boolean login = psswrd.checkPassword();

    if (login) {
      println("Welcome.");
    } else {
      println("Login: FAILURE!");
      MyAdmin adminHelp = new MyAdmin();
      boolean admin = adminHelp.adminCheck();
      if (admin){
        println("Welcome Admin.");
      }else{
        println("Admin Failure, System Shut Down");
      }
      
    }

  } // end main

  public static void println(String msg) {
    System.out.println(msg);
  } // end println
}
