/*
Class for examining user input and catching exceptions if any were to occur. Once finished the input is returned, unchanged.
*/
import java.util.*;
class ErrorHandler {
  
  static Scanner sc = new Scanner(System.in);
  
  //enter and check an int
  public static int getInt()
    { 
      int integer;
      do{
        try
        {
          integer = sc.nextInt();
          break;
        }
        catch(Exception e)
        {
          sc.next();
          System.out.println("\nInvalid entry.\n");
        }
      } while(true);
      return integer;
    }

    //enter and check a double, which in this case represents stats. This also checks if the number is between 0-80.
    public static double getStats()
    {
      double dec;
      do{
        try
        {
          dec = sc.nextDouble();
          if(dec <0 || dec > 80)
          {
          System.out.println("\nInvalid entry, must be a positive number from 0 and 80.\n");
          }
          else
          {
          break;
          }
        }
        catch(Exception e)
        {
          sc.next();
          System.out.println("\nInvalid entry.\n");
        }
      } while(true);
      return dec;
    }

    //enter and check an int (special handler meant for selecting amount of entries, so number needs to be above 0.)
    public static int getSpecialInt()
    { 
      int SpecInteger;
      do{
        try
        {
          SpecInteger = sc.nextInt();
          if(SpecInteger <=0)
          {
          System.out.println("\nInvalid entry, must be above 0.\n");
          }
          else
          {
          break;
          }
        }
        catch(Exception e)
        {
          sc.next();
          System.out.println("\nInvalid entry.\n");
        }
      } while(true);
      return SpecInteger;
    }
  
}
