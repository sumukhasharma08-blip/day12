class code12 {
    public static void main(String[] args) {
        String s = "swiss";
        int[] freq = new int[256];

        // Count frequency of each character
        for(char c : s.toCharArray()) {
            freq[c]++;
        }

        // Find first non-repeating character
        boolean found = false;
        for(char c : s.toCharArray()) {
            if(freq[c] == 1) {
                System.out.println(c);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("None");
        }
    }
}
