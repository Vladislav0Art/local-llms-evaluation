package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatMethodUnderTest_nonEmptyCodeWithLineEndingNativeScenario_test {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormatMethodUnderTest_nonEmptyCodeWithLineEndingNativeScenario_test() throws IOException {
        String code = "{ code }";
        LineEnding ending = LineEnding.NATIVE;
        try {
            String result = formatter.doFormat(code, ending);
            assert !result.isEmpty();
        } catch (IOException e) {
            assertTrue(false, false);
        }
    }

}