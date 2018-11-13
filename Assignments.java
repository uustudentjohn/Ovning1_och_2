/*
 * 
 */
package assignments;

import javax.swing.*;
/**
 *
 * @author John
 */
public class Assignments {

    public static void main(String[] args) {
        assignment2_6();
        assignment3_3();
        assignment3_9();
        keys_assignment();
    }
    private static void assignment2_6()
    {
        //2.6
        
        String sentence;
        
        
        sentence = JOptionPane.showInputDialog("Write a sentence using at least 2 words:");
        
        String[] words = sentence.split(" ");
        
        if(words.length > 1)
        {
            JOptionPane.showMessageDialog(
                    null, "First Word is: " + words[0]
                    + "\nLast Word is: " + words[words.length - 1]
                    + "\nTotal Characters in sentence is: " + sentence.length());
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Sentence too short. Try Again.");
            assignment2_6();
        }
        
        
        
        
    }
    private static void assignment3_3()
    {
        
        String input;
        double result;
        
        input = JOptionPane.showInputDialog("Miles/Gallon:");
        
        result = 1/(((Double.parseDouble(input) * 1.609)/3.8)/10);
        
        JOptionPane.showMessageDialog(null, result + " Liter/mil");
        
    }
    private static void assignment3_9()
    {
        long randNumOne = Math.round(Math.random() * 100) + 1;
        long randNumTwo = Math.round(Math.random() * 100) + 1;
        long addition = randNumOne + randNumTwo;
        long subtraction = randNumOne - randNumTwo;
        long multiplication = randNumOne * randNumTwo;
        JOptionPane.showMessageDialog(null, "RandNumOne:" + randNumOne + "\nRandNumTwo:" + randNumTwo);
        JOptionPane.showMessageDialog(null, 
                "Addition:" + addition
                +"\nSubtraction:" + subtraction
                +"\nMultiplication:" + multiplication);
        
        
    }
    
    private static void keys_assignment()
    {
        JOptionPane.showMessageDialog(null, 
                "Java version:" + System.getProperty("java.version")
        +       "\nJava installation:" + System.getProperty("java.home")
        +       "\nOS name:" + System.getProperty("os.name")
        +       "\nOS architecture:" + System.getProperty("os.arch")
        +       "\nOS version:" + System.getProperty("os.version") 
        +       "\nSeparates individual file paths in a list of file paths:" + System.getProperty("file.separator")
        +       "\nCurrent users username:" + System.getProperty("user.name")
                //Windows: C:\Users\"username" Mac: Users\"username" Linux: "username".home
        +       "\nUsers home directory:" + System.getProperty("user.home")
                //The directory where java was run from. 
        +       "\nUsers working directory:" + System.getProperty("user.dir")
        );
        
    }
    
}
