import interfaces.Label;
import interfaces.TextAnalyzer;

import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

     String[] keywords;

    public   SpamAnalyzer (String [] keywords){
        this.keywords = keywords;

    }



    @Override
    String [] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        String [] key = getKeywords();

        return Label.OK;
    }

    @Override
    public Label processText(String text) {

        return null;
    }
}
