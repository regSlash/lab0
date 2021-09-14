package lab0;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Variant1 {

    /**
     *
     * @param n integer in range from 10 to 99
     * @return array of two numbers
     */
    public int[] integerTask(int n) {
        assert n >= 10 && n <= 99: "Parameter n should be in range from 10 to 99"; // Викидання експешна
        return new int[] {Math.floorDiv(n, 10), Math.floorMod(n, 10)};
    }


    /**
     * @param a integer number
     * @param b integer number
     * @param c integer number
     * @return result of comparison a < b < c
     */
    public boolean booleanTask(int a, int b, int c) {
        return a < b && b < c;
    }


    /**
     * @param parameter1 integer number
     * @param parameter2 integer number
     * @return the greater number
     */
    public int ifTask(int parameter1, int parameter2) {
        return parameter1 >= parameter2?
                parameter1
                :parameter2;
    }


    /**
     * @param number number of unit of measure
     * @param length length of the line
     * @return length in metres
     */
    public double switchTask(int number, int length) {
        assert number >= 1 && number <= 5: "Parameter number1 must be in range from 1 to 5";
        assert length >= 0: "Length cannot be lesser than zero";
        switch (number) {
            case 1:{
                return length/10.0;
            }
            case 2:{
                return length*1000.0;
            }
            case 3:{
                return length;
            }
            case 4:{
                return length/1000.0;
            }
            case 5:{
                return length/100.0;
            }
            default:{
                return -1;
            }
        }
    }


    /**
     *
     * @param n is integer number
     * @return approximated value of exp(1)
     */
    public double[] forTask(double n) {
        assert n > 0: "Price should be more than zero";
        double[] res = new double[5];
        double j = 1.2;
        for (int i = 0; i < 5; i++, j += 0.2) {
            res[i] = j * n;
        }
        return res;
    }


    /**
     * @param n
     * @return double factorial
     */
    public double whileTask(int n) {
        assert n >= 0: "Argument should be more than zero";
        double res = 1;
        while (n >= 1) {
            res *= n;
            n -= 2;
        }
        return n;
    }

    /**
     * @param array array of integers
     * @return array of indexex of the first minimum and the last maximum
     */
    public int[] minMaxTask(int[] array) {
        int[] indexes = new int[]{0,0};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                indexes[1] = i;
            }
            if (min > array[i]) {
                min = array[i];
                indexes[0] = i;
            }
        }
        return indexes;
    }

    /**
     * @param n
     * @param a
     * @param b
     * @return new formed array according to the variant
     */
    public int[] arrayTask(int n, int a, int b) {
        assert n > 2: "N should be more than two";
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        for (int i = 2; i < n; i++) {
            array[i] = array[i-1]+array[i-2];
        }
        return array;
    }


    /**
     * @param array array of N elements
     * @param m columns' length
     * @param q multiplier
     * @return matrix
     */
    public int[][]  twoDimensionArrayTask(int[] array, int m, int q) {
        int[][] matrix = new int[m][array.length];
        System.arraycopy(array, 0, matrix[0], 0, array.length);//Копіювання масиву
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = matrix[i-1][j];
            }
        }
        return matrix;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}