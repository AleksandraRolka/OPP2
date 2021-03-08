/**
 * AGH - WFiIS
 * OOP2 - Java - lab04
 * @author Aleksandra Rolka
 */


/**
 * <u>Class lab04string</u> with static methods:
 *  <ul>
 *    <li> int <b>dlugosc</b>(String)</li>
 *    <li> int <b>ile_razy_literka_wystepuje</b>(String,char)</li>
 *    <li> boolean <b>czy_takie_same</b>(String,String)</li>
 *    <li> String <b>wspak</b>(String)</li>
 *    <li> boolean <b>czy_plaindrom</b>(String)</li>
 *    <li> boolean <b>czy_abecadlowe</b>(String)</li>
 *    <li> String <b>rot13</b>(String str)</li>
 *   </ul>
 */
public class lab04string{

    /**
     * @param str string
     * @return a length of the string
     */
    static int dlugosc(String str)
    {
        return str.length();
    }

    /**
     * @param str string
     * @param c char
     * @return number of how many times the char occur in th string
     */
    static int ile_razy_literka_wystepuje(String str, char c)
    {
        int len = str.length();
        char [] str_charArr = str.toCharArray();
        int counter = 0;

        for (int i = 0; i < len; i++){
            if (str_charArr[i] == c)
                counter ++;
        }
        return counter;

    }

    /**
     * @param str1 first string
     * @param str2 second string
     * @return true / false depending whether strings are the same (char-wise) or not
     */
    static boolean czy_takie_same(String str1, String str2)
    {
        return str1.equals(str2);
    }

    /**
     * @param str string
     * @return backwards string of the given one
     */
    static String wspak( String str)
    {
        char [] strArr = str.toCharArray();
        int len = str.length();
        char [] backwardsArr = new char[len];

        for (int i = 0; i < len; i++)
        {
            backwardsArr[i] = strArr[len-1-i];
        }
        String backwardsStr = new String (backwardsArr);

        return backwardsStr;
    }

    /**
     * @param str string
     * @return return true / false depending whether string is a palindrome or not
     */
    static boolean czy_plaindrom(String str)
    {
        String backwardsStr = wspak(str);

        return str.equals(backwardsStr);
    }

    /**
     * @param str string
     * @return return true / false depending whether chars in the string follow the order of the letters in the alphabet or not
     */
    static boolean czy_abecadlowe(String str)
    {
        char [] arr = str.toCharArray();
        char tmp = arr[0];
        int len = str.length();
        for (int i = 1; i < len; i++)
        {
            if ( arr[i] >= tmp )
                tmp = arr[i];
            else
                return false;
        }
        return true;
    }

    /**
     * encodes a string by shifting chars by 13 forward, according to the alphabet (excluding special characters - they stay the same)
     * @param str string
     * @return coded string
     */
    static String rot13(String str)
    {
        char [] arr = str.toCharArray();
        int len = str.length();
        char [] resArr = new char [len];

        for (int i = 0; i < len; i++)
        {
            if ( arr[i] > 'A' && arr[i] < 'Z') {
                resArr[i] = (char) ( ( (arr[i] - 'A' + 13) % 26) + 'A' );
            } else if ( arr[i] > 'a' && arr[i] < 'z') {
                resArr[i] = (char) ( ( (arr[i] - 'a' + 13) % 26) + 'a' );
            }
            else{
                resArr[i] = arr[i];
            }
        }
        String rot13Str = new String (resArr);

        return rot13Str;
    }
}