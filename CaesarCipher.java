public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        String result = "";

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch))
                    result = result + (char) ((ch - 'A' + k + 26) % 26 + 'A');
                else
                    result = result + (char) ((ch - 'a' + k + 26) % 26 + 'a');
            } else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("Hello", 3));
    }
}