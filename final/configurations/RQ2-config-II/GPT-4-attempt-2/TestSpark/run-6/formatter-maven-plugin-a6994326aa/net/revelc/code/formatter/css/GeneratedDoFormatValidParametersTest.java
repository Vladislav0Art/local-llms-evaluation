package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatValidParametersTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormatValidParametersTest() throws IOException {
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.CRLF;

        String formattedCode = formatter.doFormat(code, ending);

        // The result of the method will depend on the implementation. This is just an example.
        String expectedFormattedCode = "body {\r\n color: red;\r\n}";

        assertEquals(expectedFormattedCode, formattedCode);
    }

}