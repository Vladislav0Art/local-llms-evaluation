package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormatMethodUnderTest_emptyCodeWithLineEndingMacScenario_test {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormatMethodUnderTest_emptyCodeWithLineEndingMacScenario_test() throws IOException {
        String code = "";
        LineEnding ending = LineEnding.MAC;
        try {
            String result = formatter.doFormat(code, ending);
            assert false : "Expected exception was not thrown";
        } catch (IOException e) {
            assertTrue(false, e instanceof UnsupportedOperationException);
        }
    }

}