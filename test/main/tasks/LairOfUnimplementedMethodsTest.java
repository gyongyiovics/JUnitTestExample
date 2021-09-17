package main.tasks;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LairOfUnimplementedMethodsTest {
    private static LairOfUnimplementedMethods unimplemented;
    private char[] chars = new char[]{'a', 'b', 'c'};
    private char[] charsEmpty = new char[]{};
    private char[] charsNull = null;

    @BeforeClass
    public static void setUp(){
        unimplemented = new LairOfUnimplementedMethods();
        System.out.println("Class is set up");
    }

    /***
     * testCase 1 ->
     *      * number = 1.123 n = 0
     *      * expected output = -1
     *
     * testCase 2 ->
     *      * number = 1.123 n = 2
     *      * expected output = 2
     *
     * testCase 3 ->
     *      * number = 1.123 n = 5
     *      * expected output = 3
     *      *
     * testCase 4 ->
     *      * number = 1.123 n = 3
     *      * expected output = 3
     *      same as testCase 2?
     *
     * testCase 5 ->
     *      * number = 0.0 n = 3
     *      * expected output = -1
     *      handle this with an exception as well
     */
    @Test
    public void testGetNthDigitAfterDecimalPointZero() {
        int result = unimplemented.getNthDigitAfterDecimalPoint(1.123, 0);
        assertEquals(-1, result);
    }

    @Test
    public void testGetNthDigitAfterDecimalPoint() {
        int result = unimplemented.getNthDigitAfterDecimalPoint(1.123, 2);
        assertEquals(2, result);
    }

    @Test
    public void testGetNthDigitAfterDecimalPointBigger() {
        int result = unimplemented.getNthDigitAfterDecimalPoint(1.123, 5);
        assertEquals(3, result);
    }

    @Test
    public void testGetNthDigitAfterDecimalPointLast() {
        int result = unimplemented.getNthDigitAfterDecimalPoint(1.123, 3);
        assertEquals(3, result);
    }

    @Test
    public void testGetNthDigitAfterDecimalPointNull() {
        int result = unimplemented.getNthDigitAfterDecimalPoint(0.0, 3);
        assertEquals(-1, result);
    }

    /***
     * testCase 1 ->
     *      * text = "helloBaby"
     *      * expected output = 0
     *
     * testCase 2 ->
     *      * text = "helloBaby11"
     *      * expected output = 2
     *
     * testCase 3 ->
     *      * text = ""
     *      * expected output = -1
     *      *
     * testCase 4 ->
     *      * text = null
     *      * expected output = -1
     */

    @Test
    public void testCountDigitsInTextZero() {
        int digits = unimplemented.countDigitsInText("helloBaby");
        assertEquals(0, digits);
    }

    @Test
    public void testCountDigitsInText() {
        int digits = unimplemented.countDigitsInText("helloBaby11");
        assertEquals(2, digits);
    }

    @Test
    public void testCountDigitsInTextNoText() {
        int digits = unimplemented.countDigitsInText("");
        assertEquals(-1, digits);
    }

    @Test
    public void testCountDigitsInTextNull() {
        int digits = unimplemented.countDigitsInText(null);
        assertEquals(-1, digits);
    }

    /***
     * testCase 1 ->
     *      * text = "frici frédi"
     *      * expected output = "Frici Frédi"
     *
     * testCase 2 ->
     *      * text = "fricifrédi"
     *      * expected output = "Fricifrédi"
     *
     * testCase 3 ->
     *      * text = ""
     *      * expected output = ""
     *      *
     * testCase 4 ->
     *      * text = null
     *      * expected output = null
     *
     * testCase 5 ->
     *      * text = "oráng  után" -- 2 spaces!
     *      * expected output = ""
     *
     * testCase 6 ->
     *      * text = "oráng után " -- last character is space
     *      * expected output = ""
     */

    @Test
    public void testCapitalizeFirstLetters() {
        String result = unimplemented.capitalizeFirstLetters("frici frédi");
        assertEquals("Frici Frédi", result);
    }

    @Test
    public void testCapitalizeFirstLettersOneWord() {
        String result = unimplemented.capitalizeFirstLetters("fricifrédi");
        assertEquals("Fricifrédi", result);
    }

    @Test
    public void testCapitalizeFirstLettersNoWord() {
        String result = unimplemented.capitalizeFirstLetters("");
        assertEquals("", result);
    }

    @Test
    public void testCapitalizeFirstLettersNull() {
        String result = unimplemented.capitalizeFirstLetters(null);
        assertNull(result);
    }

    @Test
    public void testCapitalizeFirstLettersMoreSpaces() {
        String result = unimplemented.capitalizeFirstLetters("oráng  után");
        assertEquals("", result);
    }

    @Test
    public void testCapitalizeFirstLettersLastSpace() {
        String result = unimplemented.capitalizeFirstLetters("oráng után ");
        assertEquals("", result);
    }

    /***
     * testCase 1 ->
     *      * n1 = 123 n2 = 0
     *      * expected output = -1
     *
     * testCase 2 ->
     *      * n1 = 0 n2 = 12
     *      * expected output = -1
     *
     * testCase 3 ->
     *      * n1 = 12345545 n2 = 12335545
     *      * expected output = 4
     *      *
     * testCase 4 ->
     *      * n1 = -123 n2 = 123
     *      * expected output = 3 -> if I count backwards, however an abs
     */

    @Test
    public void testCountSameLocalValuesSecondNull() {
        int count = unimplemented.countSameLocalValues(123, 0);
        assertEquals(-1, count);
    }

    @Test
    public void testCountSameLocalValuesFirstNull() {
        int count = unimplemented.countSameLocalValues(0, 12);
        assertEquals(-1, count);
    }

    @Test
    public void testCountSameLocalValues() {
        int count = unimplemented.countSameLocalValues(12345545, 12335545);
        assertEquals(4, count);
    }

    @Test
    public void testCountSameLocalValuesMinus() {
        int count = unimplemented.countSameLocalValues(-123, 123);
        assertEquals(3, count);
    }

    /***
     * testCase 1 ->
     *      * letters = {'a', 'b', 'c'}
     *      * expected output = "abc"
     *
     * testCase 2 ->
     *      * letters = null
     *      * expected output = null
     *
     * testCase 3 ->
     *      * letters = []
     *      * expected output = ""
     */

    @Test
    public void testConcatLetters() {
        String result = LairOfUnimplementedMethods.concatLetters(chars);
        assertEquals("abc", result);
    }

    @Test
    public void testConcatLettersNull() {
        String result = LairOfUnimplementedMethods.concatLetters(charsNull);
        assertNull(result);
    }

    @Test
    public void testConcatLettersEmpty() {
        String result = unimplemented.concatLetters(charsEmpty);
        assertEquals("", result);
    }

    /***
     * testCase 1 ->
     *      * text = "cba"
     *      * expected output = new char[]{'a', 'b', 'c'}
     *
     * testCase 2 ->
     *      * text = null
     *      * expected output = null
     *
     * testCase 3 ->
     *      * text = ""
     *      * expected output = new char[]{}
     */

    @Test
    public void testReverseTextLettersIntoArray() {
        char[] reverse = unimplemented.reverseTextLettersIntoArray("cba");
        assertEquals(new char[]{'a', 'b', 'c'}, reverse);
    }

    @Test
    public void testReverseTextLettersIntoArrayNull() {
        char[] reverse = unimplemented.reverseTextLettersIntoArray(null);
        assertNull(reverse);
    }

    @Test
    public void testReverseTextLettersIntoArrayEmpty() {
        char[] reverse = unimplemented.reverseTextLettersIntoArray("");
        assertEquals(new char[]{}, reverse);
    }
}