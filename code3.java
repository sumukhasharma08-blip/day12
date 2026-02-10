class code3 {
    public static void main(String[] args) {
        String s = "programming";
        String result = "";

        for(char c : s.toCharArray()) {
            if(!result.contains(String.valueOf(c))) {
                result += c;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}
