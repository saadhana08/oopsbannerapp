public class UC5 {
    public static void main(String[] args) {
        // UC5 Goal: Combine declaration and initialization in one step
        String[] banner = {
            String.join("  ", " OOO ", " OOO ", "PPPP ", " SSSS"),
            String.join("  ", "O   O", "O   O", "P   P", "S    "),
            String.join("  ", "O   O", "O   O", "P   P", "S    "),
            String.join("  ", "O   O", "O   O", "PPPP ", " SSS "),
            String.join("  ", "O   O", "O   O", "P    ", "    S"),
            String.join("  ", "O   O", "O   O", "P    ", "    S"),
            String.join("  ", " OOO ", " OOO ", "P    ", "SSSS ")
        };

        // Use an enhanced for-loop to display the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}