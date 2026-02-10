class code8 {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";

        // Remove spaces and convert to lowercase
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = "";
        for(int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Check palindrome
        if(cleaned.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
