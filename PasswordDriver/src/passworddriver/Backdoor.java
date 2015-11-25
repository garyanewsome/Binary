/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passworddriver;

import java.util.Scanner;

/**
 *
 * @author Gary
 */
public class Backdoor {

  private boolean bdAccepted;
  private String bdPass;

  public void Backdoor() {
    this.bdAccepted = false;
    this.bdPass = "backd0or";
  }

  public boolean checkBD() {
    Scanner keyboard = new Scanner(System.in);
    
    print("Backd0or: ");
    String userHack = keyboard.nextLine();

    if (!this.bdPass.equals(userHack)) {
      println("You should have taken the blue pill.");
    }else{
      this.bdAccepted = true;
      println("Enter the Matrix.");
      
    }
    return this.bdAccepted;
  }
    public void print(String msg) {
    System.out.print(msg);
  } // end print

  public void println(String msg) {
    System.out.println(msg);
  } // end println
}
