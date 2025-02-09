package net.revelc.code.formatter.css;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.*;

public class GeneratedDoFormatBasicTest {

    @Test
    public void doFormatBasicTest() throws IOException {
        String code = "body {background-color: lightblue;}";
        LineEnding ending = LineEnding.CRLF;

        CssFormatter cssFormatter = new CssFormatter();
        assertNotNull(cssFormatter.doFormat(code, ending));
    }

}