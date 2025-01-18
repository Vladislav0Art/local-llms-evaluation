package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatNormalScenarioTest {

    @Test
    public void doFormatNormalScenarioTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body{}";
        String expectedCode = "body {\n}";

        cssFormatter.init(new HashMap<>(), new ConfigurationSource("source"));

        String actualCode = cssFormatter.doFormat(code, LineEnding.CRLF);

        assertEquals(expectedCode, actualCode);
    }

}