class code16 {
    public static void main(String[] args) {

        // Program 1: Using String
        long start = System.currentTimeMillis();

        String s = "";
        for(int i = 1; i <= 50000; i++) {
            s += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");

        // Program 2: Using StringBuilder
        start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 50000; i++) {
            sb.append(i);
        }

        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");
    }
}
