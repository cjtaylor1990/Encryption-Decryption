package encryptdecrypt;

public class ReadCMD implements DataReadStrategy {
    private UserInput input;

    public ReadCMD(UserInput input) {
        this.input = input;
    }

    @Override
    public String readInput() {
        return this.input.getData();
    }
}
