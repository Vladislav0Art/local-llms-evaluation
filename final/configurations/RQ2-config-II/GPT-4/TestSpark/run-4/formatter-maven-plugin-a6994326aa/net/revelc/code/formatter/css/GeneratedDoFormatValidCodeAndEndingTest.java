package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatValidCodeAndEndingTest {

    @Test
    public void doFormatValidCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body{color: black;background: white;}";
        LineEnding ending = LineEnding.AUTO;

        String formattedCode = formatter.doFormat(code, ending);

        assertEquals("body { color: black; background: white; }", formattedCode);
    }

}