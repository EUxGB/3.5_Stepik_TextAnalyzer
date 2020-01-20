import interfaces.Label;
import interfaces.TextAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {


    private static class SpamAnalyzer (String [] keywords){
       String[] keywords = new String[this.keywords.length];
        this.keywords = keywords;

    }

    @Override
    String getKeywords() {
        return null;
    }

    @Override
    Label getLabel() {
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
