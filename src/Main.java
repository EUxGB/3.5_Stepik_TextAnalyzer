import interfaces.TextAnalyzer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String my_text = "Катерина не успела на автобус и заматерилась =) . 8) " +
                "Прохожий обернулся, и многозначительно взглянув на нее произнес. Мадам, а вы не =) !!! ";

        int maxLength = 50;
        String [] keywords_spam = new String[] {"взяглнув","реклама","цена"};

        TextAnalyzer txt_long = new TooLongTextAnalyzer(maxLength);
        TextAnalyzer txt_spam = new SpamAnalyzer(keywords_spam);
        TextAnalyzer txt_negative = new NegativeTextAnalyzer();

        
        txt_long.processText(my_text);
        txt_spam.processText(my_text);
        txt_negative.processText(my_text);

    }
}
