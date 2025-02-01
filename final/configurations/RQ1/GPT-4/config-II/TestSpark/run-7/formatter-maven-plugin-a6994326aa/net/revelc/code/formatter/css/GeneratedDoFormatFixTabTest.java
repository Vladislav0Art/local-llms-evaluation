package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatFixTabTest {

    @Test
    public void DoFormatFixTabTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);

        String code = "p { color: green; word-wrap:\t; }"; // code taken from cssparser issue #11
        String result = cssFormatter.doFormat(code, null);
        assertEquals("p {\n    color : green;\n    word-wrap :\\9;\n}", result);
    }

}