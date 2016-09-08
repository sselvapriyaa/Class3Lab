
package model;

/**
 *
 * @author Gladwin
 */
public class WelcomeService {
    

/*create a private property for the current date
using the Calendar data type*/
    
java.util.Calendar now = new java.util.GregorianCalendar();

/*The first method to determine whether it is
morning, afternoon or evening */
                String tod = "";
                {
if (now.get(now.HOUR_OF_DAY) < 12) {
tod = "Morning!";
                } else if (now.get(now.HOUR_OF_DAY) < 18) {
tod = "Afternoon!";
                } else {
tod = "Evening!";
                }
 String Good =tod;
                }
                
 
 /*   create a method that takes a String value for a person’s
name, and constructor a return String that combines that name plus
the date result above into a welcome message */
       private String name;//instance variable



      // constructor initializes name with parameter name               
       public WelcomeService(String name) // constructor name is class name     
      {                                                                 
        this.name = name;                                              
      }                                                                 

     // method to set the name
     public void setName(String name)
      {
         this.name = name;
    }

      // method to retrieve the name
      public String getName()
      {
         return name;
      }
   } 


