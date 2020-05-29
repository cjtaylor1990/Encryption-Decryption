package encryptdecrypt;

public class WriteCMD implements DataWriteStrategy {
    @Override
    public void writeOutput(String outputData) {
        System.out.println(outputData);
    }
}
