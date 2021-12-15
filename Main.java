import java.util.Arrays;
import java.util.*;
class Main {

  static Scanner sc = new Scanner(System.in);
  
  public static int repeat;
  public static int entries;
  public static int length;
  public static int select;
  
  public static double[] age;
  public static double[] phys;
  public static double[] adapt;
  public static double[] soc_emo;
  public static double[] cog;
  public static double[] comm;

  //start of the program, initializes number of entries in each array.
  public static void start() {
    System.out.println("How many entries would you like to make?");
    entries = ErrorHandler.getSpecialInt();
    System.out.println("You've decided to enter "+entries+" people into the graph.");
    System.out.println("");
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
      age[i] = ErrorHandler.getDouble();

      System.out.print ("Physical Develpoment: ");
      phys[i] = ErrorHandler.getDouble();

      System.out.print ("Adaptive Development: ");
      adapt[i] = ErrorHandler.getDouble();
      
      System.out.print ("Social-Emotional Development: ");
      soc_emo[i] = ErrorHandler.getDouble();

      System.out.print ("Cognitive Development: ");
      cog[i] = ErrorHandler.getDouble();

      System.out.print ("Communication Development: ");
      comm[i] = ErrorHandler.getDouble();
    }
  }

  public static void data() {
    System.out.println("\nAges "+Arrays.toString(age));
    System.out.println("Physical "+Arrays.toString(phys));
    System.out.println("Adaptive "+Arrays.toString(adapt));
    System.out.println("Social-Emotional "+Arrays.toString(soc_emo));
    System.out.println("Cognitive "+Arrays.toString(cog));
    System.out.println("Communication "+Arrays.toString(comm)+"\n");
  }

  public static void selection() {
    //change text later
    System.out.println("");
    System.out.print("Enter number: ");
    System.out.println("");
    select = ErrorHandler.getInt();
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
        break;
      } else {
        Graphing.makeGraph(select-1);
      }
    } while(true);

  }
}
