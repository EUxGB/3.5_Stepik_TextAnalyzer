import interfaces.Label;
import interfaces.TextAnalyzer;

 class CheckLables {


     public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for(TextAnalyzer obj_txt_an : analyzers) {
            Label label_check = obj_txt_an.processText(text);
            if (label_check != Label.OK) return label_check;
        }
        return Label.OK;
    }


}
