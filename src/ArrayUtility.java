public class ArrayUtility {

    public static void print(int[] array) {
        // Method called print that prints out each element in an array of integers on a single line.
        // The format will be: 12, 34, 67, 89, 91, 34 Takes an array of integers as a parameter.
        // Does not return any data.
        String result = "";

        for(int i = 0; i<array.length; i++)
        {
            result = result + array[i];
        }

        System.out.println(result);
    }

    public static int sum(int[] array)
    {
        int result = 0;
        for(int i =0; i<array.length; i++)
        {
            result = result + array[i];
        }
        return result;
    }

    public static double average(int[] array)
    {
        double result = 0.0;

        for(int i = 0; i<array.length; i++)
        {
            result = result + array[i];
        }


        result = result/array.length;
        String r = String.valueOf(result);
        if(r.length()>4)
        {
            String rr = r.substring(0, 5);
            return Double.parseDouble(rr);
        }

        return Double.parseDouble(r);

    }


    public static int minimum(int[] array)
    {
        int result = 10;

        for(int i =0; i<array.length; i++)
        {
            if(array[i] < result)
            {
                result = array[i];
            }
        }
        return result;
    }

    public static int maximum(int[] array)
    {
        int result = 0;

        for(int i =0; i<array.length; i++)
        {
            if(array[i] > result)
            {
                result = array[i];
            }
        }
        return result;
    }

    public static int evenCount(int[] array)
    {
       int result = 0;
        for(int n: array)
        {
            if(n%2 == 0)
            {
                result ++;
            }
        }
        return result;
    }

    public static int[] reverseOne(int[] array)
    {
        int n = 0;
        int[] result = new int [array.length];
        for(int i = array.length-1; i>=0; i--)
        {
            result[array.length - 1 - i] = array[i];
        }
        return result;
    }

    public static void reverseTwo(int[] array)
    {
        int[] result = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--)
        {
            result[array.length - 1 - i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = result[i];
        }

    }

    public static boolean linearSearchInt(int[] array, int num)
    {
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str)
    {
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == str) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            array[i] = array[i]*2;
        }

    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i<array.length; i++)
        {
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] array)
    {
        String result = "";
        for(int i = 0; i<array.length-1; i++)
        {
            result = result + array[i] + ", ";
        }

        result = result + array[array.length-1];

        return result;

    }

    public static boolean twoSum(int[] array, int num)
    {
        for(int i = 0; i < array.length; i++) {

            for(int j = 0; j < i; j++) {
                if(array[i] + array[j] == num)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {

        int last = array[array.length-1];
        for(int i = array.length-1; i>0; i--)
        {
            array[i] = array[i-1];
        }

        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int first = array[0];
        for(int i = 0; i<array.length-1; i++)
        {
            array[i] = array[i+1];
        }

        array[array.length-1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n)
    {
        for(int i = 0; i<n; i++)
        {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n)
    {
        for(int i = 0; i<n; i++)
        {
            shiftLeft(array);
        }
    }


}
