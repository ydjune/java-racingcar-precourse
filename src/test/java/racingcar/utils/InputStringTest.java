package racingcar.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class InputStringTest {


    @Test
    void 입력문자가_null인지확인(){

        boolean result = InputString.isNull("");
        assertThat(result).isFalse();
    }



}
