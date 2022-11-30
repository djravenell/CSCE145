public class StringHelper {


    /**
     Returns a boolean value either true or false.
     The char argument specifies the character being checked.
     Checks whether the character is a vowel and changes the boolean vowel
     accordingly.
     * @param c
     * @return
     */
    public static boolean isVowel(char c) {
        boolean vowel = false;

        if (c == 'a') {
            vowel = true;
        } else if (c == 'e') {
            vowel = true;
        } else if (c == 'i') {
            vowel = true;
        } else if (c == 'o') {
            vowel = true;
        } else if (c == 'u') {
            vowel = true;
        }

        return vowel;
    }

    /**
     * Returns a String where the vowels are replaced with a phrase.
     * The s argument specifies the string that's being checked.
     * The r argument specifies the phrase that all vowels will be replaced with.
     * Checks whether the character is a vowel and replaces it with the given phrase.
     * @param s
     * @param r
     * @return
     */
    public static String replaceVowelsWith(String s, String r) {
        String replaced = "";

        for (int i = 0; i < s.length(); ++i) {
            if (isVowel(s.charAt(i))) {
                replaced += r;
            } else {
                replaced += s.charAt(i);
            }
        }

        return replaced;
    }


    /**
     * Returns a double value depending on the number of vowels and constants.
     * The s argument specifies the string being checked for its number of vowels
     * and constants.
     * Generates a double based on the number of vowels and constants where vowels
     * are weighted 2.5 and constants are weighted 3.4.
     * @param s
     * @return
     */
    public static double weight(String s) {
        double weight = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (isVowel(s.charAt(i))) {
                weight += 2.5;
            } else {
                weight += 3.4;
            }
        }

        return weight;
    }


    /**
     * Returns a String that is two strings mashed together.
     * The s1 argument specifies the string where every other odd character is
     * being used for a new string.
     * The s2 argument specifies the string where every other even character is
     * being used for a new string.
     * Generates a new string where each character was alternated from the given
     * strings until one runs out and puts the rest if need be.
     * @param s1
     * @param s2
     * @return
     */
    public static String mashStrings(String s1, String s2) {
        boolean s1Bigger = (s1.length() > s2.length());
        int length = 0;
        String mashed = "";

        if (s1Bigger) {
            length = s2.length();
        } else {
            length = s1.length();
        }

        for (int i = 0; i < length; ++i) {
            if (i % 2 == 0) {
                mashed += s1.charAt(i);
            } else {
                mashed += s2.charAt(i);
            }
        }

        if (s1Bigger) {
            for (int j = length; j < s1.length(); ++j) {
                mashed += s1.charAt(j);
            }
        } else {
            for (int j = length; j < s2.length(); ++j) {
                mashed += s2.charAt(j);
            }
        }
        return mashed;
    }

}
