package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile implements DataReadStrategy {
    private UserInput input;

    public ReadFile(UserInput input) {
        this.input = input;
    }

    @Override
    public String readInput() {
        try (Scanner scanner = new Scanner(new File(this.input.getIn()))) {
            StringBuilder inData = new StringBuilder();
            while (scanner.hasNextLine()) {
                inData.append(scanner.nextLine());
            }
            return new String(inData);
        } catch (FileNotFoundException exception) {
            return "";
        }
    }
}
