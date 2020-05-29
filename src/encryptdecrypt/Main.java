package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        UserInput input = UserInput.getUserInput(args);

        DataReadContext dataReader = new DataReadContext();
        dataReader.setReader(input);
        String inputData = dataReader.readData();

        EncryptionContext encryption = new EncryptionContext();
        encryption.setEncryption(input);
        String encryptedData = encryption.useEncryption(input, inputData);

        DataWriteContext dataWriter = new DataWriteContext();
        dataWriter.setWriter(input);
        dataWriter.writeData(encryptedData);
    }
}
