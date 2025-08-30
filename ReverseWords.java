public class ReverseWords {
    public static void main(String[] args) {
        String str = "Welcome to India";

        String[] words = str.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); 
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed.toString());
    }
}
