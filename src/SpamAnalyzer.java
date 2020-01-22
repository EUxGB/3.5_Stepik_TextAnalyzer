import interfaces.Label;
import interfaces.TextAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
     protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    public Label processText(String my_text) {
        String[] words_spam = getKeywords();
        for (String key_i : words_spam) {
            boolean check = my_text.contains(key_i);
            if (check) return getLabel();
        }
        return Label.OK;
    }
}
