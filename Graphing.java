/* 
Use this file for printing the graph itself. When setting up the graph, use the % symbol to represent 1 unit.

The x axis of the bar graph has one bar for each of the six values the user has entered.
The y axis will be used to measure how high the data is, by a scale of 10
*/


class Graphing {

  private static String barAge = "", barPhy = "", barAda = "", barS_e = "", barCog = "", barCom = "";
  
  public static void makeGraph(int subject) {
    //AGE
    for (int i = 1; i<80;i=i+2) {
      if (Main.age[subject] <= i) {
        i = 81;
      }
      else {
        barAge = barAge + "%";
      }
    }

    //PHYSICAL
    for (int i = 1; i<80;i=i+2) {
      if (Main.phys[subject] <= i) {
        i = 81;
      }
      else {
        barPhy = barPhy + "%";
      }
    }
    
    //ADAPTIVE
    for (int i = 1; i<80;i=i+2) {
      if (Main.adapt[subject] <= i) {
        i = 81;
      }
      else {
        barAda = barAda + "%";
      }
    }

    //SOCIAL EMOTIONAL
    for (int i = 1; i<80;i=i+2) {
      if (Main.soc_emo[subject] <= i) {
        i = 81;
      }
      else {
        barS_e = barS_e + "%";
      }
    }
    
    //COGNITIVE
    for (int i = 1; i<80;i=i+2) {
      if (Main.cog[subject] <= i) {
        i = 81;
      }
      else {
        barCog = barCog + "%";
      }
    }

    //COMUNICATION
    for (int i = 1; i<80;i=i+2) {
      if (Main.comm[subject] <= i) {
        i = 81;
      }
      else {
        barCom = barCom + "%";
      }
    }
    printGraph();
  }

  
  public static void makeMeanGraph() {
    //MEAN AGE
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMean(Main.age) <= i) {
        i = 81;
      }
      else {
        barAge = barAge + "%";
      }
    }
    
    //MEAN PHYSICAL
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMean(Main.phys) <= i) {
        i = 81;
      }
      else {
        barPhy = barPhy + "%";
      }
    }
    
    //MEAN ADAPTIVE
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMean(Main.adapt) <= i) {
        i = 81;
      }
      else {
        barAda = barAda + "%";
      }
    }

    //MEAN SOCIAL EMOTIONAL
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMean(Main.soc_emo) <= i) {
        i = 81;
      }
      else {
        barS_e = barS_e + "%";
      }
    }
    
    //MEAN COGNITIVE
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMean(Main.cog) <= i) {
        i = 81;
      }
      else {
        barCog = barCog + "%";
      }
    }

    //MEAN COMUNICATION
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMean(Main.comm) <= i) {
        i = 81;
      }
      else {
        barCom = barCom + "%";
      }
    }
    System.out.print("MEAN GRAPH: \n");
    printGraph();
  }

  public static void makeMedianGraph() {
    //MEDIAN AGE
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMedian(Main.age) <= i) {
        i = 81;
      }
      else {
        barAge = barAge + "%";
      }
    }
    
    //MEDIAN PHYSICAL
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMedian(Main.phys) <= i) {
        i = 81;
      }
      else {
        barPhy = barPhy + "%";
      }
    }
    
    //MEDIAN ADAPTIVE
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMedian(Main.adapt) <= i) {
        i = 81;
      }
      else {
        barAda = barAda + "%";
      }
    }

    //MEDIAN SOCIAL EMOTIONAL
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMedian(Main.soc_emo) <= i) {
        i = 81;
      }
      else {
        barS_e = barS_e + "%";
      }
    }
    
    //MEDIAN COGNITIVE
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMedian(Main.cog) <= i) {
        i = 81;
      }
      else {
        barCog = barCog + "%";
      }
    }

    //MEDIAN COMUNICATION
    for (int i = 1; i<80;i=i+2) {
      if (Averages.getMedian(Main.comm) <= i) {
        i = 81;
      }
      else {
        barCom = barCom + "%";
      }
    }
    System.out.print("MEDIAN GRAPH: \n");
    printGraph();
  }

  //Printing out the graph with bars.  
  public static void printGraph() {
    System.out.println("   0   10   20   30   40   50   60   70   80");
    System.out.println("   |    |    |    |    |    |    |    |    |");
    System.out.println("   |||||||||||||||||||||||||||||||||||||||||");
    System.out.println("   |");
    System.out.println("AGE|"+barAge);
    System.out.println("   |");
    System.out.println("PHY|"+barPhy);
    System.out.println("   |");
    System.out.println("ADA|"+barAda);
    System.out.println("   |");
    System.out.println("S-E|"+barS_e);
    System.out.println("   |");
    System.out.println("COG|"+barCog);
    System.out.println("   |");
    System.out.println("COM|"+barCom);
    //Reset the bars to 0 after printing.
    barAge = "";
    barPhy = "";
    barAda = "";
    barS_e = "";
    barCog = "";
    barCom = "";
  } 
}
