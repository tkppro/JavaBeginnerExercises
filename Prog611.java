import javax.swing.*;
public class Prog611
{
	public static void main( String [] args)
	{
		String name = JOptionPane.showInputDialog("What is your name ?");
		String input = JOptionPane.showInputDialog("How old are you?");
		String year = JOptionPane.showInputDialog(" Your DOB?");
		int age = Integer.parseInt(input);
		
		System.out.print( "Hello, " + name + "." );
		System.out.println("Next year, you'll be " + (age+1) + year);
		System.exit(0);
	}


}
