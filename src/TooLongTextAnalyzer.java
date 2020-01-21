import interfaces.Label;
import interfaces.TextAnalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {

    int maxLength;

   public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;

    }


    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) return Label.TOO_LONG;
        return Label.OK;

    }
}
