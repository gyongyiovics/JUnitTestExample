package main.tasks;

public class LairOfUnimplementedMethods {

    /**
     * Find the Nth digit after the decimal point in a double number.<br>
     * If n is greater than the amount of digits after the decimal point, then returns
     * the last digit of the number.<br>
     * If n is lesser than or equal to 0, then returns -1.
     * @param number is the number, which can be negative, positive or zero as well
     * @param n is the number of the digit after the decimal point to return
     * @return the Nth digit after the decimal point in the double number<br>
     *      or see details above!
     */
    public int getNthDigitAfterDecimalPoint(double number, int n) {
        /* megírandó...
            az n-ről el kell dönteni, hogy 0-nál nagyobb-e
            a number tizedespont utáni részével kell csak foglalkozni
            meg kell állapítani, hogy van-e annyi számjegy a tizedespont után, mint amekkora n
            vissza kell adni az N-edik számjegyet number-ből, a tizedespont után számolva
         */
        return -1;
    }

    /**
     * Counts the characters in the text that are numeric characters.
     * @param text is the text in which counts numeric characters
     * @return the number of counted numeric characters,<br>
     *      or -1 if the text is null or blank
     */
    public int countDigitsInText(String text) {
        /* megírandó...
            meg kell nézni, hogy a szöveg null értékű-e vagy üres-e
            a szöveget vizsgálni kell karakterenként, és nézni, hogy szám típusú karakter-e vagy sem
            a szám típusú karaktereket meg kell számolni, és visszatérni az eredménnyel
         */
        return -1;
    }

    /**
     * Capitalizes the first letters of the words in the text, then returns the formatted text.<br>
     * <i>Capitalizes letters after spaces.</i>
     * @param text is the text to capitalize
     * @return the formatted text,<br>
     *      or null if the text is null,<br>
     *      or a blank String if the text is blank
     */
    public String capitalizeFirstLetters(String text) {
        /* megírandó...
            meg kell nézni, hogy a text null értékű-e vagy üres-e
            nézni kell, hogy a text-ben hol van szóköz, és az azutáni karaktert nagybetűsíteni kell
            ügyelni kell arra, hogy legyen karakter a szóköz után, és az nem egy újabb szóköz!
                (mi van akkor, ha pl. a text utolsó karaktere szóköz?)
         */
        return "";
    }

    /**
     * Counts how many local values in two numbers have the same digit.<br><br>
     * <i>For example:
     * <ul>
     *     <li>n1 = 1234</li>
     *     <li>n2 = 123454</li>
     *     <li>returns 1, because only the last digit of the two numbers is the same</li>
     * </ul></i>
     * @param n1 is the first number
     * @param n2 is the second number
     * @return how many local values in two numbers have the same digit
     */
    public int countSameLocalValues(long n1, long n2) {
        /* megírandó...
            a két számot a legkisebb helyi értéktől a nagyobb felé érdemes vizsgálni (hátulról előre)
                (mi van akkor, ha az egyik vagy akár mindkét szám negatív?)
                (és ha az egyik szám pl. 0, a másik pedig 120?)
            mindkét szám utolsó számjegyét le kell csippenteni a számról, és összehasonlítani
                ha egyenlőek, counter++
            addig kell menni, amíg az egyik szám teljesen elfogy... úgymond
         */
        return -1;
    }

    /**
     * Concatenates the elements of the char[] array into text, starting with the element on the 0. index,
     * and ending with the element on the last index.
     * @param letters the array to concatenate its elements
     * @return the concatenated text,<br>
     *      or null if the array is null,<br>
     *      or a blank String if the array is empty
     */
    public static String concatLetters(char[] letters) {
        /* megírandó...
            ellenőrizni kell, hogy a letters null értékű-e vagy üres-e
            össze kell fűzni a letters elemeit String-gé, a 0. indextől kezdve
         */
        if(letters == null){
            return null;
        } else if (letters.length > 0) {
            String concatenated = "";
            for (int i = 0; i < letters.length; i++) {
                concatenated += letters[i];
            }
            return concatenated;
        }
        return "";
    }

    /**
     * Creates a char[] array from a text by adding the characters of the text to an array in reverse order.
     * @param text is the text to work with
     * @return the array of the characters of the text, in reverse order,<br>
     *      or null if the text is null,<br>
     *      or an empty array if the text is blank
     */
    public char[] reverseTextLettersIntoArray(String text) {
        /* megírandó...
            ellenőrizni kell, hogy a text null értékű-e vagy üres-e
            új char[] tömb kell, ami text hosszúságú
            a text-en végig kell menni úgy, hogy a text utolsó karaktere a tömb első eleme legyen
                (és a text első karaktere a tömb utolsó eleme)
         */
        return null;
    }

}
