/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

/**
 *
 * @author USER
 */
public class Seconds
{
   // instance variable
   double time;
   
   // Constructor method
   public Seconds (double t)
   {
      time = t;
   }
     
   // returns time formatted as minutes:seconds.milliseconds
   public String format()
   {
   // Declare local variables
      String timeString = null;
      int minutes;
      int seconds;
      int milliseconds;
     
   // Calculate minutes, seconds, milliseconds
   // Hint: use type casting to convert time from double to int
   // You figure out this part
     
   // Create the string minutes:seconds.milliseconds using concatenation
   // You figure out this part
   
      return timeString;
   }
}
