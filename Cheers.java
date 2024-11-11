// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String s = args[0];
        s = s.toUpperCase();
        int N = Integer.parseInt(args[1]);
        int i = 0;
        int length = s.length();

        while (i<length) {
                String aOrAn = "a ";
                char currentChar = s.charAt(i);
                if(currentChar == 'A' || currentChar == 'E' || currentChar =='F' ||currentChar =='H' || currentChar == 'I' || currentChar == 'L' || currentChar == 'M' || currentChar == 'N' ||
                currentChar =='O' || currentChar == 'R' || currentChar == 'X' || currentChar == 'S') {
                aOrAn = "an ";
                }
                System.out.println("Give me " + aOrAn + currentChar + ": " + currentChar + "!");
                i++;
        }
        System.out.println ("What does that spell?");
        int j =0;
        while (j<N) {
                System.out.println(s + "!!!");
                j++;
        }
        }
}
