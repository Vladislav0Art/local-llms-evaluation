package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatCssTextWithChangesTest {

    @Test
    public void doFormatCssTextWithChangesTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);

        String cssText = "body{color:#fff;}";
        String result = null;
        try {
            result = formatter.doFormat(cssText, null);
        } catch (IOException e) {
            fail("IOException thrown.");
        }

        assertNotNull(result);
    }

}