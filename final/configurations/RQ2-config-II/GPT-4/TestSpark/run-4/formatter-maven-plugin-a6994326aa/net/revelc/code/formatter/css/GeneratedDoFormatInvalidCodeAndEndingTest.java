package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatInvalidCodeAndEndingTest {

    @Test
    public void doFormatInvalidCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "Invalid CSS code";
        LineEnding ending = LineEnding.AUTO;

        String formattedCode = formatter.doFormat(code, ending);

        assertEquals("", formattedCode);
    }

}