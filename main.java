import java.util.Arrays;
import java.util.*;
class Main {

  static Scanner sc = new Scanner(System.in);
  
  public static int repeat;
  public static int entries;
  public static int length;
  public static int select;
  
  //variables for statistics: age (in months), physical, adaptive, social emotional, cognitive, and communication.
  public static double[] age;
  public static double[] phys;
  public static double[] adapt;
  public static double[] soc_emo;
  public static double[] cog;
  public static double[] comm;

  //start of the program, initailizes number of entries in each array.
  public static void start() {
    System.out.print("How many entries would you like to make? ");
    entries = ErrorHandler.getSpecialInt();
    if(entries == 1)
    {
      System.out.println("You've decided to enter "+entries+" person's statistics.\n");
    }
    else
    {
    System.out.println("You've decided to enter "+entries+" people's statistics.\n");
    }
  }

  //fill in each of the required arrays to be used in the future.
  public static void fill() {
    //before the loop starts, initialize all of the arrays
    age = new double[entries];
    phys = new double[entries];
    adapt = new double[entries];
    soc_emo = new double[entries];
    cog = new double[entries];
    comm = new double[entries];

    //Add an amount of values to each array depending on the value previously assigned to entries.
    for(int i=0; i<entries; i++) {
      System.out.println("Please enter the following information about person #"+(i+1)+".");
      
      System.out.print("Age in Months: ");
      age[i] = ErrorHandler.getStats();

      System.out.print ("Physical Develpoment: ");
      phys[i] = ErrorHandler.getStats();

      System.out.print ("Adaptive Development: ");
      adapt[i] = ErrorHandler.getStats();
      
      System.out.print ("Social-Emotional Development: ");
      soc_emo[i] = ErrorHandler.getStats();

      System.out.print ("Cognitive Development: ");
      cog[i] = ErrorHandler.getStats();

      System.out.print ("Communication Development: ");
      comm[i] = ErrorHandler.getStats();
    }
  }

  //Print out all of the arrays containing the specified data.
  public static void data() {
    System.out.println("\nAges "+Arrays.toString(age));
    System.out.println("Physical "+Arrays.toString(phys));
    System.out.println("Adaptive "+Arrays.toString(adapt));
    System.out.println("Social-Emotional "+Arrays.toString(soc_emo));
    System.out.println("Cognitive "+Arrays.toString(cog));
    System.out.println("Communication "+Arrays.toString(comm)+"\n");
  }

  //allows the user to select the graph they would like to see.
  public static void selection() {
    System.out.print("\nEnter the number of the graph you want to see: ");
    select = ErrorHandler.getInt();
    System.out.println("");
  }

  //code runs here.
  public static void main(String[] args) {
    start();
    fill();
    data();
    Graphing.makeMeanGraph();
    Graphing.makeMedianGraph();
    
    //graph viewing loop
    System.out.println("To end the program enter 0.");
    do {  
      selection();
      if(select < 0 || select > entries) {
        System.out.println("Invalid entry.");
      } else if(select == 0) {
        System.out.println("Thank you for using this program.");
        break;
      } else {
        Graphing.makeGraph(select-1);
        System.out.println("\nAge: " + age[select-1] + " Phy: " + phys[select-1] + " Ada: " + adapt[select-1] + " S-E: " + soc_emo[select-1] + " Cog: " + cog[select-1] + " Com: " + comm[select-1]);
      }
    } while(true);

  }
}
