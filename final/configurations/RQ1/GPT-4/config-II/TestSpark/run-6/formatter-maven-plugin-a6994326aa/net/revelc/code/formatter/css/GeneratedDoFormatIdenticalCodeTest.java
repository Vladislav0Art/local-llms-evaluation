package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatIdenticalCodeTest {

    @Test
    public void doFormatIdenticalCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String cssCode = "body { color: #000; }";
        assertNull(formatter.doFormat(cssCode, null));
    }

}