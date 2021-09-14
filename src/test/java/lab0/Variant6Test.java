package lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant6Test {

    public static double EPS = 0.0000001;

    ////////////////////////////////////////////////

    @Test(dataProvider = "integerProvider")
    public void integerTest(int p1, int[] expected) {
        assertEquals(new Variant6().integerTask(p1), expected);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 78, new int[]{7, 8} }, { 12, new int[]{1, 2} }, { 99, new int[]{9, 9} } };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeIntegerTest() {
        new Variant6().integerTask(-2);
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p3) {
        assertEquals(new Variant6().ifTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 10, 8, 10 }, { -11, -1, -1 }, { -3, -6, -3 } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, int p3, boolean p4) {
        assertEquals(new Variant6().booleanTask(p1, p2, p3), p4);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 5, 6, 7, true }, { 0, 2, 1, false }, { -3, 0, 10, true } };
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int p1, int p2, double p3) {
        assertEquals(new Variant6().switchTask(p1, p2), p3, EPS); //method changed
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { 100, 5, 1 }, { 120, 3, 120  } }; //test changed
    }

    @Test(expectedExceptions = AssertionError.class)
    public void switchNegativeTest() {
        new Variant6().switchTask(5, -1);
    }

    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int n, double[] p2) {
        assertEquals(new Variant6().forTask(n), p2, EPS);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] { { 2, new double[] {2.4, 2.8, 3.2, 3.6, 4.0} }, { 1, new double[] {1.2, 1.4, 1.6, 1.8, 2.0} } };
    }

    ///////////////////////////////////////////////////

    //////////////////////////////////////////

    @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int b, int c) {
        assertEquals(new Variant6().whileTask(a), c);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { { 10, 2, 0 }, { 12, 10, 2 }, { 12, 1, 0 }, { 25, 7, 4 } };
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
    public void negativeWhileTest(int a) {
        new Variant6().whileTask(a);
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][] { { -1, 2 }, { -2, 1 }, { 2, -1 } };
    }
    ///////////////////////////////////////////

    @Test(dataProvider = "minMaxProvider")
    public void minMaxTest(int[] array, int[] expected) {
        assertEquals(new Variant6().minMaxTask(array),expected);
    }

    @DataProvider
    public Object[][] minMaxProvider() {
        return new Object[][] {
                {new int[]{1, 1, 1, 2, 2, 1}, new int[]{0, 4}},
                {new int[]{2, 3, -1, -5, 1, 0}, new int[]{3, 1}},
        };
    }

    //////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int n, int a, int b, int[] expected) {
        assertEquals(new Variant6().arrayTask(n,a,b), expected);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { { 2, 1, 3, new double[] { 10, 2, 3 } }, { new double[] { 10, 2, 13 }, 10 },
                { new double[] { 4, 3, 5, -4, 9, 2 }, -4 } };
    }



    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[] array, int m, int q, int[][] output) {
        assertEquals(new Variant6().twoDimensionArrayTask(array,m, q), output);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input = {{2, 3, 6, 9, -9},
                {34, 98, -9, 2, 1},
                {-4, 2, 1, 6, 1},
                {-98, 8, 1, 5, 3}};

        int[][] input23 = {{2, 3, 6, 9, -9},
                {-4, 2, 1, 6, 1},
                {34, 98, -9, 2, 1},
                {-98, 8, 1, 5, 3}};

        int[][] input14 = {{-98, 8, 1, 5, 3},
                {-4, 2, 1, 6, 1},
                {34, 98, -9, 2, 1},
                {2, 3, 6, 9, -9}};

        return new Object[][] { {input, 2, 3, input23}, { input, 1,4, input14 } };

    }

    @Test
    public void arrayTest2(){
        assertEquals(new int[]{2, 3}, new int[]{2, 3});
    }

}