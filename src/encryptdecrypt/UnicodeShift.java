package encryptdecrypt;

public class UnicodeShift extends ShiftTemplate {
    public UnicodeShift(int key) {
        super(key);
    }

    @Override
    protected char shift(int key, char input) {
        return (char) (input + key);
    }

    @Override
    public String decrypt(String data) {
        return encrypt(-1 * this.key, data);
    }
}
