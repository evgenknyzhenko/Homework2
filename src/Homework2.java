/**
 * Created by Евгений on 05.05.2018.
 */
public class Homework2 {

        public static void main(String[] args) {
            task_2_1();
            //task_2_2();
            //task_2_3();
        }

        private static void task_2_1() {
            String word = "Madam";

            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();

            if (word.equalsIgnoreCase(reverseWord.toString())) {
                System.out.println("Is palindrome");
            }
            else {
                System.out.println("Isn't palindrome");
            }
        }

        //============================================

        private static void task_2_2() {
            char[] characters = {'a','b','c','d','e','f','g'};
            int i = 2;
            int j = 4;

            for (int k = i; k < j; k++) {
                char a = characters[k];
                characters[k] = characters[j];
                characters[j] = a;
                j--;
            }

            for (char ch : characters) {
                System.out.print(ch + " ");
            }
        }

        //============================================

        private static void task_2_3() {
            String str = "aaa156aadfsdaeraaaawq";
            char ch = 'a';
            int countChar = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i+1).equals(String.valueOf(ch))) {
                    countChar++;
                }
            }
            System.out.println(countChar);
        }


    }