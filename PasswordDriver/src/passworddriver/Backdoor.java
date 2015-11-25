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
  private String userHack;

  public Backdoor() {
    this.bdAccepted = false;
    this.bdPass = "backdoor";
    this.userHack = userHack;
  }

  public boolean checkBD() {
    Scanner keyboard = new Scanner(System.in);
    
    print("Backdoor: ");
    this.userHack = keyboard.nextLine();

    if (!this.bdPass.equals(this.userHack)) {
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