    import java.util.Scanner;

    public class project {
        public static void main(String[] args) {
            //number of elements (numbers)
            Scanner sc = new Scanner(System.in);
            System.out.println("Print number of elements: ");
            int n = sc.nextInt();
            int[] array=new int[n];
            for (int i=0; i<n; i++)
                array[i]=sc.nextInt();
            sc.close();

            //-92, -86, 4, 5, 5, 7, 7, 25, 25, 564

            System.out.println("Count number of elements: " + count(array));
            System.out.println("Print the different numbers: " + diffNum(array));
            System.out.println("Print even numbers: " + evenNum(array));
            System.out.println("Print odd numbers: " + oddNum(array));

            // FLAGS
            System.out.println("Print repetition of numbers: " + repetitionNum(array));

            //
            System.out.println("Maximum occurrence: " + maximumOccurrenceNum(array));

            System.out.println("Largest number: " + largestNum(array));
            System.out.println("Second smallest number: " + secondSmallestNum(array));
            System.out.println("Average number: " + averageNum(array));

            //
            System.out.println("Standard deviation: " + standardDeviationNum(array));

            //??
            System.out.println("Median: " + medianNum(array));

            System.out.println("Sum of all numbers: " + sumOfAllNum(array));
            System.out.println("Palindromic numbers: " + palindromicNum(array));
            System.out.println("largest palindromic number: " + largestNum(array));

            System.out.println(reversedNum(array));
        }
        public static int count(int[] count) {
            return count.length;
        }
        //number of different numbers
        public static int diffNum(int[] array) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                int j;
                for (j = 0; j < array.length; j++) {
                    if (array[i] == array[j])
                        break;
                }
                if (i == j)
                    counter++;
            }
            return counter;
        }
        //number of even numbers
        public static int evenNum(int[] array) {
            int counter = 0;
            int number = array.length;
            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0) {
                    counter++;
                }
            }
            return counter;
        }
        //number of odd numbers
        public static int oddNum(int[] array) {
            int counter = 0;
            int number = array.length;
            for (int i = 0; i <= number; i++) {
                if (i % 2 != 0) {
                    counter++;
                }
            }
            return counter;
        }
        //frequency of repetition for each number (in percentage)
        public static String repetitionNum(int[] array) {
            String result = "";
            int[] temparray = new int[array.length];
            int number=array.length;
            //temparray = array;
            for (int i = 0; i < number; i++)
                temparray[i] = array[i];
            for (int i = 0; i < number; i++) {
                if (temparray[i] != 1001) {
                    int repeatNum = 1;
                    for (int j = i + 1; j < number; j++) {
                        if (temparray[i] == temparray[j]) {
                            repeatNum++;
                            temparray[j] = 1001;
                        }
                    }
                    result += "\n\tNum " + array[i] + ":\t" + repeatNum + "times," + (((float) repeatNum / array.length) * 100) + "%";
                }
            }
            return result;
        }
        //the number with the maximum occurrence
        public static int maximumOccurrenceNum(int[] array) {
            int result=0;
            int counter = 0;
            int number=array.length;
            for (int i=0; i<number; i++) {
                counter = 0;
                for (int j=0; j<number; j++) {
                    if (array[i] == array[j])
                        counter++;
                }
                if(result<counter)
                    result=counter;

            }
            return result;
        }
        //largest number
        public static int largestNum(int[] array) {
            int temp;
            int number = array.length;
            for (int i = 0; i < number; i++) {
                for (int j = i + 1; j < number; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return array[number - 1];
        }
        //second smallest number
        public static int secondSmallestNum(int[] array) {
            int temp;
            int number = array.length;
            for (int i = 0; i < number; i++) {
                for (int j = i + 1; j < number; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return array[1];
        }
        //the average of all numbers
        public static double averageNum(int[] array) {
            int sum = 0;
            int number = array.length;
            int i = 0;
            while (i < number) {
                sum += array[i];
                i++;
            }
            return ((double) sum / number);

        }
        //standard deviation
        public static double standardDeviationNum(int[] array) {
            double sum = 0;
            for (double i : array) {
                sum += i;
            }
            int length = array.length;
            double num2 = sum / length;
            double standardDeviationNum = 0;
            for (double num : array) {
                standardDeviationNum += Math.pow(num - num2, 2);
            }
            return Math.sqrt(standardDeviationNum / length);
        }
        //median
        public static int medianNum(int[] array) {
            int m=0;
                if (array.length % 2 == 1) {
                    m = array[(array.length + 1) / 2 - 1];
                } else {
                    m = ((array[array.length / 2 ] + array[array.length / 2])-1) / 2;
                }
            return m;
        }
        //sum of all numbers
        public static int sumOfAllNum(int[] array) {
            int sum = 0;
            int number = array.length;
            for (int i = 0; i < number; i++) {
                sum += array[i];
            }
            return sum;
        }
        // count the number of palindromic number numbers
        public static int palindromicNum(int[] array) {
            int counter = 0;
            for (int j : array) {
                int temp = j;
                int reversed = 0;
                int last;
                while (temp > 0) {
                    last = temp % 10;
                    reversed = reversed * 10 + last;
                    temp = temp / 10;
                }
                if (reversed == j)
                    counter++;
            }
            return counter;
        }

        //largest palindromic number, that is smaller then the greatest number in the
        //list

        public static String largestPalindromicNum(int[] array) {
            String result = "No repeating numbers";
            int number=largestNum(array)-1;
            if (largestNum(array) > 0) {
                for (int i = number; i >= 0; i--) {
                    int reversed = 0;
                    int temp = i;
                    int last;
                    while (temp > 0) {
                        last = temp % 10;
                        reversed = reversed * 10 + last;
                        temp = temp / 10;
                    }
                    if (reversed == i) {
                        result = "" + i;
                        break;
                    }
                }
            }
            return result;
        }
        //the program must end by printing out the received numbers in the reversed order delimited by a comma
        public static int reversedNum(int[] array) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.print(array[array.length - i - 1]);
                } else {
                    System.out.print(array[array.length - i - 1] + ", ");
                }
            }
            counter++;
            return counter;
        }
    }
