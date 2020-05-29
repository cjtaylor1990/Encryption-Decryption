package encryptdecrypt;

public abstract class ShiftTemplate implements EncryptionStrategy {
    protected int key;

    public ShiftTemplate(int key) {
        this.key = key;
    }

    protected abstract char shift(int key, char input);

    protected String encrypt(int key, String data) {
        char[] plainChars = data.toCharArray();
        char[] encryptedChars = new char[plainChars.length];
        for (int i = 0; i < plainChars.length; i++) {
            encryptedChars[i] = this.shift(key, plainChars[i]);
        }
        return new String(encryptedChars);
    }

    public String encrypt(String data) {
        return this.encrypt(this.key, data);
    }

    public abstract String decrypt(String data);
}
