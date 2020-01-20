import interfaces.Label;
import interfaces.TextAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    public Label processText(String text) {
        return null;
    }

    @Override
    String getKeywords() {
        return null;
    }

    @Override
    Label getLabel() {
        return null;
    }
}
