public class TextMaster {
    
    private final String textString;

    public TextMaster(String textString){

        this.textString = textString;
    }

    public int wordAmount(){

        String[] textStringArr = textString.split(" ");

        return textStringArr.length;
    }

    public int sentenceAmount(){

        String[] textStringArr = textString.split("\\.|\\!|\\?");

        return textStringArr.length;
    }

    public double averageWordLength(){

        String[] textStringArr = textString.split(" ");

        int total = 0;
        for (String Ord : textStringArr) {
            total += Ord.length();
        }

        return total/textStringArr.length;
    }

    public double averageWordLengthSentence(){

        String[] textStringArr = textString.split("\\.|\\!|\\?");

        int total = 0;
        for (String Setning : textStringArr) {
            total += Setning.split(" ").length;
        }

        return total/textStringArr.length;
    }

    public String replaceWord( String In , String Out){

        return textString.replaceAll("\\b" + Out + "\\b",In);
    }

    public String getString(){
        return textString;
    }

    public String getStringtoUpper(){
        return textString.toUpperCase();
    }
}