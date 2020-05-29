package encryptdecrypt;

public class EncryptionContext {
    private EncryptionStrategy encryption;

    public void setEncryption(UserInput input) {
        switch (input.getAlgName()) {
            case "shift":
                encryption = new AlphabetShift(input.getKey());
                break;
            case "unicode":
                encryption = new UnicodeShift(input.getKey());
                break;
            default:
                System.out.printf("Unknown encryption algorithm: %s%n", input.getAlgName());
        }
    }

    public String useEncryption(UserInput input, String data) {
        switch (input.getMode()) {
            case "enc":
                return encryption.encrypt(data);
            case "dec":
                return encryption.decrypt(data);
            default:
                System.out.printf("Unknown mode: %s%n", input.getMode());
                return null;
        }
    }
}
