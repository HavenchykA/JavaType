import java.sql.SQLOutput;

public class HomeWork2 {
        public static void main(String[] args) {
            int[] surrogates = {0xD83D, 0xDC7D};
            String alienEmojiString = new String(surrogates, 0, surrogates.length);
            System.out.println(alienEmojiString);

        }
}
