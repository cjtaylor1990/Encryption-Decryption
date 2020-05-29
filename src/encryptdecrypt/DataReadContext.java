package encryptdecrypt;

public class DataReadContext {
    private DataReadStrategy reader;

    public void setReader(UserInput input) {
        this.reader = input.getData().isEmpty() ? new ReadFile(input) : new ReadCMD(input);
    }

    public String readData() {
        return this.reader.readInput();
    }
}
