import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (int i = 0; i < arr.length;i++)
    {
      String target = arr[i];
      if (target.length() == targetLength)
      {
        count++;
      } 
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length;i++)
    {
      if (arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length;i++)
    {
      int target = arr[i];
      for (int j = 1+1; j < arr.length;j++)
      {
        if(arr[j] == target)
        {
          return true;
        }
      }
    }
    return false;
  }

  public static int findMode(int[] arr)
  {
    int mode = arr[0];
    int count = 0;
    int maxCount = 0;
    for(int i = 0; i < arr.length; i++)
    {
      int target = arr[i];
      count = 0;
      for (int j = 1+1; j < arr.length;j++)
      {
        if(arr[j] == target)
        {
          count++;
        }
      }
      if (count > maxCount)
      {
        maxCount = count;
        mode = target;
      }
    }
    return mode;
  }
}
