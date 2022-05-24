public class Encrypt {
    String message;
    String[][] alphabet = {{"A", "1"}, {"B", "2"}, {"C", "3"}, {"D", "4"},
            {"E", "5"}, {"F", "6"},{"G", "7"}, {"H", "8"}, {"I", "9"},
            {"J", "10"}, {"K", "11"}, {"L", "12"}, {"M", "13"}, {"N", "14"},
            {"O", "15"}, {"P", "16"}, {"Q", "17"}, {"R", "18"}, {"S", "19"},
            {"T", "20"}, {"U", "21"}, {"V", "22"}, {"W", "23"}, {"X", "24"},
            {"Y5", "2"}, {"Z", "26"}}; //reference of letter to number


    public Encrypt(String passedMessage){
        this.message = passedMessage;
    }

    public int toEncrypt(String message){
        return 0;
    }

    public int[] changeToNum(String message){
        int[] intArray = new int[message.length()];
        return intArray;
    }
}
