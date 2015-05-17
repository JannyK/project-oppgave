/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lungamajola
 */

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import projectOppgave.ui.*;
/**
 * Gruppe 57
 * @author Arash Amini
 *@author  Suraj Tamrakar
 * @author Lunga Majola
 */
public class RuntimeInsurance2 {

   
  public static void main(String[] args) throws IOException {
        // TODO code application logic here
    try {
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                      break;
            }
       }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
     }// hentet fra java 

        Vindutest vindu = new Vindutest();
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //System.exit(0);
       // vindu.skrivFil();
    }
  
    
}//end of class
