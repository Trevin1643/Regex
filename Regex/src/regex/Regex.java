/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

/**
 *
 * @author tmiller
 */
//import static java.lang.System.in;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String phoneNumber;
        Pattern p = Pattern.compile("([(]{0,})([0-9]{3})([)]{0,}[.]{0,}[-]{0,}[ ]{0,})([0-9]{3})([.]{0,}[-]{0,})([0-9]{4})");
        Scanner in = new Scanner(System.in);
        System.out.print("What is your phone number?");
        phoneNumber = in.next();
        
        while(!phoneNumber.equals(""))
        {
            Matcher numberM = p.matcher(phoneNumber);
            if(numberM.matches())
            {
                String notNumbers1 = numberM.group(1);
                String numberSection1 = numberM.group(2);
                String notNumbers2 = numberM.group(3);
                String numberSection2 = numberM.group(4);
                String notNumbers3 = numberM.group(5);
                String numberSection3 = numberM.group(6);
                System.out.println("(" + numberSection1 + ") " + numberSection2 + "-" + numberSection3);
            }
            System.out.print("What is your phone number?");
            phoneNumber = in.nextLine();
        }
        in.close();   
    }    
  
}
