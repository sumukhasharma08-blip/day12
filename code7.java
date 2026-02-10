class code7 {
    public static void main(String[] args) {
        String s = "Java is very powerful";

        // Remove extra spaces and split words
        String[] words = s.trim().split("\\s+");

        // Reverse order of words
        for(int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
