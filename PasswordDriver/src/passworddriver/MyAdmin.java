/*
 * Admin login in protocol, to be called upon three failed attempts
 * in the BinaryPassword class
 */
package passworddriver;

import java.util.Scanner;

/**
 *
 * @author Gary
 */
public class MyAdmin {

  private boolean accepted;
  private int count;
  private String adminPass;
  private String yourAdmin;

  public MyAdmin() {
    this.accepted = false;
    this.count = 1;
    this.adminPass = "notPassword";
    this.yourAdmin = yourAdmin;
  }

  public boolean adminCheck() {
    Scanner keyboard = new Scanner(System.in);

    do {
      print("Admin: ");
      this.yourAdmin = keyboard.nextLine();

      if (this.yourAdmin.equals("notPassword")) {
        this.accepted = true;
      }
      this.count++;
    } while ((!this.yourAdmin.equals(adminPass) &&
            !this.yourAdmin.equals("hack") && count <= 2));
    
    if (this.yourAdmin.equals("hack")){
      Backdoor backdoor = new Backdoor();
      this.accepted = backdoor.checkBD();
      if(this.accepted){
        print("Intruder Alert, all systems halted. Shut Down Commencing...\n");
      }else{
        print("You are now off the perverbial grid.");
      }
    }

    return this.accepted;
  }

  public void print(String msg) {
    System.out.print(msg);
  } // end print

  public void println(String msg) {
    System.out.println(msg);
  } // end println
}
