package encryptdecrypt;

public class DataWriteContext {
    private DataWriteStrategy writer;

    public void setWriter(UserInput input) {
        this.writer = input.getOut().isEmpty() ? new WriteCMD() : new WriteFile(input);
    }

    public void writeData(String outputData) {
        this.writer.writeOutput(outputData);
    }
}
