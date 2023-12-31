package stringBasics;

public class CountingString {
    public static void main(String[] args) {
        int lowerCount = 0;
        int upperCount = 0;
        int rest = 0;
        char ch;
        String myString = "Roses are Red, Violets are Blue";

        for (int i = 0 ; i < myString.length(); i++) {
            ch = myString.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCount += 1;
            } else if (Character.isUpperCase(ch)) {
                upperCount += 1;
            } else {
                rest += 1;
            }
        }
        System.out.println("There are " + lowerCount + " lowercase characters.");
        System.out.println("There are " + upperCount + " uppercase characters.");
        System.out.println("There are " + rest + " other characters.");

    }
}
