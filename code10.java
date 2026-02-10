class code10 {
    public static void main(String[] args) {
        String s = "banana";
        String result = "";

        for(char c : s.toCharArray()) {
            if(!result.contains(String.valueOf(c))) {
                result += c;
            }
        }

        System.out.println(result);
    }
}
