package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatEmptyStringTest {

    @Test
    public void doFormatEmptyStringTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);

        String result = null;
        try {
            result = formatter.doFormat("", null);
        } catch (IOException e) {
            fail("IOException thrown.");
        }

        assertNull(result);
    }

}