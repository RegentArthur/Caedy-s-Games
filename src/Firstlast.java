// Caedy's Code
public class Firstlast {
    public static int firstlast(String seq, char c){
        String remaining = seq;
        for (int i = 1; i < seq.length(); i++) {

            if (Character.isWhitespace(seq.charAt(i))) {
                if (remaining.charAt(0) == c && seq.charAt(i - 1) == c) {
                    return seq.lastIndexOf(remaining);
                }
            }
        }

        if (remaining.charAt(0) == c && seq.charAt(seq.length() - 1) == c) {
            return seq.lastIndexOf(remaining);
        }
        return -1;
    }
}
