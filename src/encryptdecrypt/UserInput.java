package encryptdecrypt;

public class UserInput {
    private static UserInput instance;
    private String mode;
    private String data;
    private String in;
    private String out;
    private int key;
    private String algName;

    private UserInput(
            String mode,
            String data,
            String in,
            String out,
            String algName,
            int key
    ) {
        this.mode = mode;
        this.data = data;
        this.in = in;
        this.out = out;
        this.algName = algName;
        this.key = key;
    }

    public String getMode() {
        return this.mode;
    }

    public String getData() {
        return this.data;
    }

    public String getIn() {
        return this.in;
    }

    public String getOut() {
        return this.out;
    }

    public int getKey() {
        return this.key;
    }

    public String getAlgName() {
        return this.algName;
    }

    public static UserInput getUserInput(String[] input) {
        if (instance == null) {
            instance = new UserInput("enc", "", "", "", "shift", 0);
            String currentArgument;
            String currentValue;
            for (int i = 0; i < input.length; i += 2) {
                currentArgument = input[i];
                currentValue = input[i + 1];
                switch (currentArgument) {
                    case "-mode":
                        instance.mode = currentValue;
                        break;
                    case "-data":
                        instance.data = currentValue;
                        break;
                    case "-in":
                        instance.in = currentValue;
                        break;
                    case "-out":
                        instance.out = currentValue;
                        break;
                    case "-key":
                        instance.key = Integer.parseInt(currentValue);
                        break;
                    case "-alg":
                        instance.algName = currentValue;
                        break;
                    default:
                        System.out.printf("%s is not a valid argument%n", currentArgument);
                }
            }
        }
        return instance;
    }
}
