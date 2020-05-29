package encryptdecrypt;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile implements DataWriteStrategy {
    private UserInput input;

    public WriteFile(UserInput input) {
        this.input = input;
    }

    @Override
    public void writeOutput(String outputData) {
        try (PrintWriter writer = new PrintWriter(this.input.getOut())) {
            writer.println(outputData);
        } catch (FileNotFoundException exception) {
            System.out.println("Error. Output file not found.");
        }
    }
}
