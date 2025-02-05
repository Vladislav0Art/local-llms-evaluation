package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        String code = "p { color: red; }";
        LineEnding ending = LineEnding.CRLF;
        CssFormatter cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat(code, ending);
        // Add validation
        assertEquals("p { color: red; }\r\n", result);
    }

}