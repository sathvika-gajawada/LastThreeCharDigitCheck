public class LastThreeCharactersCheckForDigit {

    /**
     * Checks whether the last 3 characters of the given string contain a numeric digit.
     *
     * @param input The input string to check.
     * @return true if a digit is found in the last 3 characters, false otherwise.
     */
    public static boolean hasNumberInTheLastThreeCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Get the last 3 characters or the full string if shorter
        String lastThreeCharacters = input.length() <= 3 ? input : input.substring(input.length() - 3);

        // Check if any character is a digit
        for (int i=0; i<lastThreeCharacters.length(); i++) {
            if (Character.isDigit(lastThreeCharacters.charAt(i))) {
                return true;
            }
        }

        return false;
    }
   /**
 * Runs tests on the hasNumberInTheLastThreeCharacters method with sample inputs.
 */
    // --- Main method to test the function ---
    public static void main(String[] args) {
        String[] testCases = {
    "Test8RE",    // true
    "abc123",     // true
    "Welcome",    // false
    "hiHello9",   // true
    "xyz123hi",   // true
    "9",          // true
    "    ",       // false
    "",           // false
    null,         // false
    "a2 ",        // true
    "  5ab",      // false
    "12 ",        // true
    "abc1def",    // false
    "ab1c2",      // true
    "123",        // true
    "a1b"         // true
        };

        for (String test : testCases) 
        {
            // Trim leading/trailing whitespace from input before checking the last 3 characters for digits
            boolean result = (test!=null)?hasNumberInTheLastThreeCharacters(test.trim()):false;
            System.out.println("Input: " + (test == null ? "null" : "\"" + test + "\"") 
                + " -> Contains digit in last 3 characters? " + result);

        } 
    }
}