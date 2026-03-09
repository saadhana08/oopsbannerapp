public class UC7{

    /**
     * Inner class to encapsulate a character and its banner pattern.
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int row) {
            return pattern[row];
        }
    }

    public static void main(String[] args) {
        // Define patterns for each character
        CharacterPattern charO = new CharacterPattern('O', 
            new String[]{" OOO ", "O   O", "O   O", "O   O", "O   O", "O   O", " OOO "});
        CharacterPattern charP = new CharacterPattern('P', 
            new String[]{"PPPP ", "P   P", "P   P", "PPPP ", "P    ", "P    ", "P    "});
        CharacterPattern charS = new CharacterPattern('S', 
            new String[]{" SSSS", "S    ", "S    ", " SSS ", "    S", "    S", "SSSS "});

        // Use an array to store the 7 lines of the final banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            // Build each row by retrieving patterns from the CharacterPattern objects
            banner[i] = String.join("  ", 
                charO.getRow(i), 
                charO.getRow(i), 
                charP.getRow(i), 
                charS.getRow(i)
            );
        }

        // Print the final banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}