/*
Determine and output the mean, median, and mode of the given data.
*/
import java.util.Arrays;
import static java.lang.Math.*;
class Averages {

  public static double sum;
  public static double meanReturn;

  public static int arrLen;
  public static double[] sub;
  public static int remainder;
  public static double medReturn = 0.0;

//get the mean of any array
  public static double getMean(double[] b) {
    for (int i=0; i<Main.entries; i++) {
      sum += b[i];
    }
    meanReturn = sum/Main.entries;
    sum = 0;
    return meanReturn;
  }

//get the median of any array
  public static double getMedian(double[] c) {
    sub = new double[Main.entries];
    for (int i=0; i<Main.entries; i++) {
      sub[i] = c[i];
    }
    Arrays.sort(sub);
    arrLen = sub.length;
    remainder = arrLen%2;

    if (remainder == 0) {
      medReturn = (double)(sub[arrLen/2] + (sub[arrLen/2 - 1]))/2;
    } else {
      medReturn = (double)sub[arrLen/2];
    }
    return medReturn;
  }

}
