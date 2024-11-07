public class NyString {
    
    private final String userInput;

    public NyString(String userInput) {

        this.userInput = userInput;
    }

    public String getUserInput() {
        return userInput;
    }

    public String shortener() {

        String[] userInputArr = userInput.split(" ");

        String a = "";

        for(String Ord : userInputArr){
            a += Ord.charAt(0);
        }
        return a;
    }
}
