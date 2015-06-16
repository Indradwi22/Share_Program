/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author USER
 */
public class ANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

Calendar currentDate = Calendar.getInstance(); //Get the current date
SimpleDateFormat formatter= new SimpleDateFormat("yyyy/M/dd HH:mm:ss"); //format it as per your requirement
String dateNow = formatter.format(currentDate.getTime());
System.out.println("Now the date is :=>  " + dateNow);


    }
    
}
