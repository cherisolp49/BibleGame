package Gameplay;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cherisolp49
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

public class GameTester {

    public static void main(String[] args) throws IOException 
    {
//        try{
        Date date = new Date();

        boolean more = true;
        while(more)
        {
            String welcome = JOptionPane.showInputDialog(null, "Welcome to the Truth Bible Game!!\nPlease select "
                + "a game mode:\n1) Bible Topics\n2) Whats That Verse!\n3) Where's That Place!!"
                    + "\n4) Who's That Person!\n5) View Results\n6) Exit");
            String players = "Select number of players:\n1) 1 Player\n2) 2 Players\n3) 3 Players\n4) 4 Players";
            int i = Integer.parseInt(welcome);
            switch(i)
            {
                case 1:
                    //JOptionPane.showMessageDialog(null, players);
                    String topic = JOptionPane.showInputDialog(null, "Select a topic to learn about:\n1) All Topics\n2) Mark of the Beast\n3) The Sanctuary " );
                    i = Integer.parseInt(topic);
                    
                    switch(i)
                    {
                        case 1:
                            BibleTruth new1 = new BibleTruth("Topics\\Q&A.txt", 28);
                            new1.gameOn();
                            break;
                            
                        case 2:
                            new1 = new BibleTruth("Topics\\MarkOfTheBeast.txt",10);
                            new1.gameOn();
                            break;
                            
                        case 3:
                            new1 = new BibleTruth("Topics\\Sanctuary.txt",10);
                            new1.gameOn();
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Invalid Input");
                            break; 
                    }
                     break;
                case 2:
                    //JOptionPane.showMessageDialog(null, players);
                    WhatsThatVerse obj = new WhatsThatVerse("WhatsThatVerse.txt",9);
                    obj.gameOn();
                    break;
                case 3:
                    //JOptionPane.showMessageDialog(null, players);
                    JOptionPane.showMessageDialog(null, "Currently Under Construction");
                    break;
                case 4:
                    //JOptionPane.showMessageDialog(null, players);
                    JOptionPane.showMessageDialog(null, "Currently Under Construction");
                    break;
                case 5:
                    openFile();
                case 6:
                    more = false;
                    break;
                case 7:
                    BibleTruth new10 = new BibleTruth("test.txt", 28);
                    new10.printArray();
                    more = false;
                    break;
                default:
                    System.out.println("Not Valid");
                    break;
                
            }        
        }
//        }catch (NumberFormatException | NullPointerException d)
//    {
//      System.out.println("The Selection you made ether returned a null value \n");
//      System.out.println("Or you tried to click okay without actually entering a value ");
//    }
    }
    /*
     *This method basically opens up a file without having to go through the hassle of opening it manually.
    */
    static void openFile() throws IOException
            
    {
          Runtime rt=Runtime.getRuntime();
          
          String file = "C:\\Users\\Patrick\\Documents\\NetBeansProjects\\TheTruthBibleGame\\testthisfilething1.txt";
          Process p = rt.exec("notepad " + file);
        
    }
    
    
} 