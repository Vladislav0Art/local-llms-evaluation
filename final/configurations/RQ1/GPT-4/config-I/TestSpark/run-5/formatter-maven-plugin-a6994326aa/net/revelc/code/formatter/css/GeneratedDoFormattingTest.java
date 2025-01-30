package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormattingTest {

    @Test
    public void doFormattingTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        String code = "body {background-color: black; color: white}\n" +
                "h1   {color: #36CFFF; }";
        String formattedCode = cssFormatter.doFormat(code, null);

        assertNotEquals(code, formattedCode);
    }

}