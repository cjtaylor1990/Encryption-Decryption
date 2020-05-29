package encryptdecrypt;

public class AlphabetShift extends ShiftTemplate{
    public AlphabetShift(int key) {
        super(key);
    }

    @Override
    protected char shift(int key, char input) {
        if (Character.isLetter(input)) {
            int alphaStart = Character.isUpperCase(input) ? (int) 'A' : (int) 'a';
            int relativePlainInt = input - alphaStart;
            int relativeEncryptedInt = (key + relativePlainInt) % 26;
            int encryptedInt = relativeEncryptedInt + alphaStart;
            return (char) encryptedInt;
        } else {
            return input;
        }
    }

    @Override
    public String decrypt(String data) {
        return encrypt(26 - key, data);
    }
}
