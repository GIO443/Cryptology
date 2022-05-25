public class Encrypt {
    String message;
    String[] alphabet = {"A", "B", "C", "D",
            "E", "F","G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
            "T", "U", "V", "W", "X",
            "Y", "Z"}; //alphabet; if letter # needed use index + 1


    public Encrypt(String passedMessage){
        this.message = passedMessage;
    }

    public int toEncrypt(String message){
        return 0;
    }

    public int[] changeToNum(String message){
        int[] intArray = new int[message.length()];

        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {

            }
        }
        return intArray;
    }
}
