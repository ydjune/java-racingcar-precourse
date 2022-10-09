package racingcar.utils;

import racingcar.view.io.OutputFunction;

public class InputString {

    public static final int MAX_CAR_NAME_LENGTH = 5;

    private String strValue;
    public InputString(String inputStr){

        isNull(inputStr);
        validLength(inputStr);

        this.strValue = inputStr;
    }

    public static boolean isNull(String input) {

        if ("".equals(input)) {
            OutputFunction.print("[Error]");
            return false;
        }

        return true;
    }

    public static boolean validLength(String carName) {
        if (carName.length() > MAX_CAR_NAME_LENGTH) {
            OutputFunction.print("[Error]");

            return false;
        }

        return true;
    }

    public String getStrValue() {
        return this.strValue;
    }
}
