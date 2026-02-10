import java.util.Arrays;

class code11 {
    public static void main(String[] args) {
        String s1 = "Dormitory";
        String s2 = "Dirty room";

        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        // Convert to char arrays
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare arrays
        if(Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
