package encryptdecrypt;

public interface EncryptionStrategy {
    String encrypt(String input);

    String decrypt(String input);
}
