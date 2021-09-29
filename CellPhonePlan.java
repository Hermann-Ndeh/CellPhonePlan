import java.util.*;

public class CellPhonePlan{

           private static Scanner input = new Scanner(System.in);
            
           


    // Returns true, if the month and day represent a date that is between January 10 and March 11, 2022, inclusive.
// Returns false, otherwise
    public static boolean isValidDate(int month, int day){
      if ((month > 3 || month < 1) || (day > 30 || day < 1)){
          System.out.println("Invalid Date");
          System.exit(1);
      }
      else{
          System.out.println();
      }

      return true;
    }



    // Returns true, if the data plan equals "4", "10", "15", "U", or "u"
// Returns false, otherwise
    public static boolean isValidPlan(String dataPlan){
        if (dataPlan.equals("4") || dataPlan.equals("10") || dataPlan.equals("15") || dataPlan.equals("U") || dataPlan.equals("u")){
            System.out.println();
        }
        else{
            System.out.println("Invalid Plan");
            System.exit(1);
        }
        return true;
    }

// Throw an IllegalArgumentException with the message, "Invalid number", if the number of students
// is less than 1 or greater than 3
// Throws an IllegalArgumentException with the message, "Invalid plan", if the plan is invalid
// HINT: Use the isValidPlan() method to determine this
// NOTE: You must check for invalid parameters (arguments) in the order given above.
//
// Returns the 90 day cost of the cell phone plan as defined above
    public static int getPlanCost(int numberOfStudents, String dataPlan){
        System.out.print("Number of Students: ");
        numberOfStudents = input.nextInt();
        
        int sad = 0;
        if (numberOfStudents == 2){
        //conditionals to check dataPlan input and calculate cost for 90 days
            if (dataPlan.equals("4")){
                System.out.println();
                int cost = 10 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");
                
            }
            else if(dataPlan.equals("10")){
                System.out.println();
                int cost = 15 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }
            else if(dataPlan.equals("15")){
                System.out.println();
                int cost = 20 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }
            else if(dataPlan.equals("U") || dataPlan.equals("u")){
                System.out.println();
                int cost = 25 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }
        }
        else if (numberOfStudents == 3){
        //conditionals to check dataPlan input and calculate cost for 90 days
            if (dataPlan.equals("4")){
                System.out.println();
                int cost = 5 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");
                
            }
            else if(dataPlan.equals("10")){
                System.out.println();
                int cost = 10 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }
            else if(dataPlan.equals("15")){
                System.out.println();
                int cost = 15 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }
            else if(dataPlan.equals("U") || dataPlan.equals("u")){
                System.out.println();
                int cost = 20 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }
 
        }
        else{
            System.out.println("Too many or too little students for a group plan");
            System.exit(0);
        }
 
        return sad;
     }
     
// Throws an IllegalArgumentException with the message, "Invalid date", if the date is invalid
// HINT: Use the isValidDate() method to determine this
//
// Determines the cell phone plan end date that is 89 days later than the given month/day in 2022.
// Returns the end date as a String in which the month, day, and year, 22, are separated
// by a forward slash, "/", for example, "4/21/22"
    public static String getEndDate(int month, int day){
        int numOfMonths = 3;
        int d = numOfMonths + month;
        int d2 = day;
        System.out.println("End date: " + d + "/" + d2 + "/22");
        String dataPlan = null;

        return dataPlan;
        
    } 
    public static void main(String[] args){
        System.out.println("           Welcome to the Wolfpack Cell Phone Company!     \n We offer 90 day individual and group plans for up to 3 students. \n Plans must start between Jan 10 and Mar 11, 2022. You may choose \n from data plans offering 4, 10, 15, or unlimited GB per month! \n When prompted, please enter the start date, whether it is a group \n plan and the number of students in the group, and your data plan \n choice. Your total plan cost and end date will be output.");


        System.out.println();

        System.out.print("Start date (month day, eg. 2 17): ");
        int month = input.nextInt();
        int day = input.nextInt();
        isValidDate(month, day);

       
        System.out.print("Group plan (y,n):  ");
        String confirmType = input.next();


        if ((confirmType.equals("Y")) || (confirmType.equals("y"))){
            System.out.print("Data plan (4, 10, 15, U): "); 
            String dataPlan = input.next();
            isValidPlan(dataPlan);
            getPlanCost(0, dataPlan);

        
        }
        
        else if ((!confirmType.equals("Y") && (!confirmType.equals("y")))){
            System.out.print("Data plan (4, 10, 15, U): "); 
            String dataPlan = input.next();
            isValidPlan(dataPlan);

//conditional to check the dataPlan input for 1 student
            if (dataPlan.equals("4")){
                System.out.println();
                int cost = 15 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");
                
            }
            else if(dataPlan.equals("10")){
                System.out.println();
                int cost = 20 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }
            else if(dataPlan.equals("15")){
                System.out.println();
                int cost = 25 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }
            else if(dataPlan.equals("U") || dataPlan.equals("u")){
                System.out.println();
                int cost = 30 * 3 ;
                System.out.println("Plan cost: $" + cost + ".00");

            }


        }
        
        getEndDate(month,day);

        

    }
}