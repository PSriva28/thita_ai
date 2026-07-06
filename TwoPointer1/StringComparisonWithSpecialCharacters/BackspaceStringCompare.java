public class BackspaceStringCompare {

    /**
     * Helper function to find the next valid character index in a string.
     * Processes backspaces ('#') and skips erased characters.
     *
     * @param str   The input string to process
     * @param index The current index to start from (moving backwards)
     * @return The index of the next valid character, or -1 if none left
     */
    private static int getNextValidCharIndex(String str, int index) {
        int backspaceCount = 0;
        while (index >= 0) {
            if (str.charAt(index) == '#') {
                // Found a backspace, increment counter
                backspaceCount++;
            } else if (backspaceCount > 0) {
                // Skip this character, as it will be "erased"
                backspaceCount--;
            } else {
                // This character is valid
                break;
            }
            index--;
        }
        return index;
    }

    /**
     * Main function to compare two strings with backspaces.
     * Uses two pointers to traverse both strings from the end,
     * applying backspace logic to each.
     *
     * @param s First input string
     * @param t Second input string
     * @return true if both strings are equal after applying backspaces, false otherwise
     */
    public static boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1; // Pointer for s
        int j = t.length() - 1; // Pointer for t

        while (i >= 0 || j >= 0) {
            // Find next valid character in both strings
            i = getNextValidCharIndex(s, i);
            j = getNextValidCharIndex(t, j);

            // If both pointers are negative, both strings are fully processed
            if (i < 0 && j < 0) return true;

            // If only one is negative, strings are of different lengths after processing
            if (i < 0 || j < 0) return false;

            // If characters don't match, strings are not equal
            if (s.charAt(i) != t.charAt(j)) return false;

            // Move to the previous character
            i--;
            j--;
        }
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t)); // Output: true
    }
}