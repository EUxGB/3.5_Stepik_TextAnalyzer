import interfaces.Label;
import interfaces.TextAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords_negative = { ":(" , ":|" , "=(" };

    @Override
    protected String [] getKeywords() {
        return keywords_negative;
    }

    @Override
     protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    public Label processText(String my_text) {
        String[] words_negative = getKeywords();
        for (String key_i : words_negative) {
            boolean check = my_text.contains(key_i);
            if (check) return getLabel();
        }
        return Label.OK;
    }
}
