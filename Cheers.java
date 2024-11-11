// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String s = args[0];
        int N = Integer.parseInt(args[1]);
        int i = 0;
        int length =s.length();
        while (0<length) {
                String aOrAn = "a ";
                if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'F' || s.charAt(i) == 'H' ||
                 s.charAt(i) =='I' || s.charAt(i) =='L' || s.charAt(i) =='M' || s.charAt(i) =='N' ||
                  s.charAt(i) =='O' ||s.charAt(i) == 'R' ||s.charAt(i) =='S' || s.charAt(i) =='X') {
                aOrAn = "an ";
                }
                System.out.println("Give me " + aOrAn + " " + s.charAt(i) + ": " + s.charAt(i) + "!");
                length--;
                i++;
        }
        System.out.println ("What does that spell?");
        int j =0;
        while (j<N) {
                System.out.println(s +"!!!");
                j++;
        }
        }
}
