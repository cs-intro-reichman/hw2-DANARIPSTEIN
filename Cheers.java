// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String s = args[0];
        s = s.toUpperCase();
        int N = Integer.parseInt(args[1]);
        int i = 0;
        while (i<s.length()) {
                String aOrAn = "a ";
                if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) =='I' || s.charAt(i) =='U' ||
                  s.charAt(i) =='O') {
                aOrAn = "an ";
                }
                System.out.println("Give me " + aOrAn +  s.charAt(i) + ": " + s.charAt(i) + "!");
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
