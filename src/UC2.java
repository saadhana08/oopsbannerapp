public class UC2 {
    public static void main(String[] args) {
        // Print top row: full horizontal bars for 'O', 'O', 'P', 'S'
        System.out.println("***" + " " + "***" + " " + "***" + " " + "***");
        
        // Print second row: sides of 'O', sides of 'O', sides of 'P'; left side of 'S'
        System.out.println("*       " + " " + "       " + " " + "       " + " " + "        ");
        
        // Print third row (same pattern as second row)
        System.out.println("*       " + " " + "       " + " " + "       " + " " + "        ");
        
        // Print fourth row: sides of 'O', sides of 'O'; full horizontal bars for 'P' and 'S'
        System.out.println("*       " + " " + "       " + " " + "***" + " " + "****");
        
        // Print fifth row: sides of 'O', sides of 'O'; left side of 'P'; right side of 'S'
        System.out.println("*       " + " " + "       " + " " + "        " + " " + "        *");
        
        // Print sixth row (same pattern as fifth row)
        System.out.println("*       " + " " + "       " + " " + "        " + " " + "        *");
        
        // Print seventh row: bottom bars for 'O', bottom bars for 'O'; left side of 'P'; bottom bar for 'S'
        System.out.println("***" + " " + "***" + " " + "*        " + " " + "***");
    }
}