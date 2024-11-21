import javax.print.DocFlavor.STRING;

public class Cheers {
        public static void main(String[] args) {
                String charsToCheers = (args[0]).toUpperCase();
                int  count = Integer.parseInt(args[1]);
                String needAnChars = "AEFHILMNORSX";

                for (int i = 0 ; i < charsToCheers.length() ; i++) {
                    char oneChar = charsToCheers.charAt(i);
        
                    if (needAnChars.indexOf(oneChar) >= 0) {
                        System.out.println("Give me an  " + oneChar + " : " + oneChar + "!");
                    } else {
                        System.out.println("Give me a " + oneChar + " : " + oneChar + "!");
                    }
                }

                System.out.println("What does that spell?");
                for (int j = 0 ; j < count ; j++)
                System.out.println(charsToCheers + "!!!");
            }
        }
