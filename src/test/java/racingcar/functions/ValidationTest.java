package racingcar.functions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private static final String ERROR_MESSAGE = "[Error]";

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    void 입력문자가_null인지확인(){

        boolean result = ValidationFunction.validCarName("");
        assertThat(result).isFalse();
    }


    @Test
    void 차이름이_5자_이상이면_false(){
        boolean result = ValidationFunction.validLength("asdfasd");
        assertThat(result).isFalse();
    }

    @Test
    void 차이름이_5자_이상이면_Error출력(){
        ValidationFunction.validLength("asdfasd");
        assertThat(ERROR_MESSAGE).isEqualTo(outContent.toString());
    }
}
