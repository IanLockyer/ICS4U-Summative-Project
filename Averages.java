/*
Determine and output the mean, median, and mode of the given data.
*/
import java.util.Arrays;
import static java.lang.Math.*;
class Averages {

  public static int valNum;
  public static double sum;
  public static double meanReturn;

  public static int arrLen;
  public static int remainder;
  public static double medReturn = 0.0;

  public static int count1;
  public static int count2;
  public static int num1;
  public static int num2;

  public static double getMean(double[] b) {
    for (int i=0; i<Main.entries; i++) {
      sum += b[i];
    }
    meanReturn = sum/Main.entries;
    sum = 0;
    return meanReturn;
  }

  public static double getMedian(double[] c) {
    Arrays.sort(c);
    arrLen = c.length;
    remainder = arrLen%2;

    if (remainder == 0) {
      medReturn = (double)(c[arrLen/2] + (c[arrLen/2 - 1]))/2;
    } else {
      medReturn = (double)c[arrLen/2];
    }
    return medReturn;
  }

  public static double getMode(double d[]) {
    Arrays.sort(d);
    for (int i=0; i < Main.entries; i++) {
      num1 = (int)d[i];
      count1 = 1;
      for (int j = i + 1; j < d.length; j++) {
        if (num1 == d[j]) count1++;
      }
      if (count1 > count2) {
        num2 = num1;
        count2 = count1;
      }
      else if (count1 == count2) {
        num2 = Math.min(num2,num1);
      }
    }
    return count2;
  }
}