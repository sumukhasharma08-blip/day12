class code15 {
    public static void main(String[] args) {
        String email = "test@gmail.com";

        // Check no spaces
        if(email.contains(" ")) {
            System.out.println("Invalid");
            return;
        }

        // Check exactly one '@'
        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');

        if(atIndex <= 0 || atIndex != lastAtIndex) {
            System.out.println("Invalid");
            return;
        }

        // Check at least one '.' after '@'
        int dotIndex = email.indexOf('.', atIndex);
        if(dotIndex == -1 || dotIndex == email.length() - 1) {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Valid");
    }
}
