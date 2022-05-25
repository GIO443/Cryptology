

public class Encrypt {
    String message;
    final String[] alphabet = {"A", "B", "C", "D",
            "E", "F","G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
            "T", "U", "V", "W", "X",
            "Y", "Z"}; //alphabet; if letter # needed use index + 1


    public Encrypt(String passedMessage){
        this.message = passedMessage;
    }

    private int toEncrypt(String message){
        return 0;
    }

    public int changeToNum(String message){
        int[] intArray = new int[message.length()];
        String[] charArray = message.split("");

        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if(charArray[i].equals(alphabet[j])){
                    intArray[i] = j+1;
                    break;
                }
            }
        }
        int result = numArraytoInt(intArray);
        return result;
    }

    public int numArraytoInt(int[] intArray){
        String result = "";
        for (int i = 0; i < intArray.length; i++) {
            result = result + intArray[i];
        }
        return Integer.parseInt(result);

    }
}
