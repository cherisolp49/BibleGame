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
import javax.swing.JOptionPane;

class GetData
{
	static double getDouble(String s)
	{
		return Double.parseDouble(   getWord(s)    );
	}
	
	static int getInt(String s)
	{
		return Integer.parseInt(getWord(s));
	}
	
	static String getWord(String s)
	{
		return JOptionPane.showInputDialog(s);
	}
	
	static char getChar(String s)
	{
		 String str = getWord(s);
		 return str.charAt(0);
	}
}