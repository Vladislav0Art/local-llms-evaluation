package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatCssTextWithoutChangesTest {

    @Test
    public void doFormatCssTextWithoutChangesTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);

        String cssText = "body { color: #fff; }";
        String result = null;
        try {
            result = formatter.doFormat(cssText, null);
        } catch (IOException e) {
            fail("IOException thrown.");
        }

        assertNull(result);
    }

}