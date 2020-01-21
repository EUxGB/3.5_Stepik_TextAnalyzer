import interfaces.Label;
import interfaces.TextAnalyzer;

import java.util.Arrays;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {


    String[] keywords_negative = new String[]{":(", ":|", "=("};


    public Label processText(String text) {

        return null;

    }

    @Override
    String [] getKeywords() {
        return keywords_negative;

    }

    @Override
    Label getLabel() {
        String [] key = getKeywords();

        return Label.OK;

    }
}
