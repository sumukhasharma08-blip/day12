class code14 {
    public static void main(String[] args) {
        String s = "Java is extremely powerful";

        // Split words (handles multiple spaces)
        String[] words = s.trim().split("\\s+");

        String longest = "";

        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest Word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
