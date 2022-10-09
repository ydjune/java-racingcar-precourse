package racingcar.functions;

import racingcar.view.io.OutputFunction;

public class ValidationFunction {

    public static final int MAX_CAR_NAME_LENGTH = 5;

    public static boolean validCarName(String carList) {

        if ("".equals(carList)) {
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
}
