package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedDoFormatWithTabTest {

    @Test
    public void doFormatWithTabTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");

        cssFormatter.init(options, null);

        String code = "body {\\9;color : black;}";
        String expected = "body {\n  \\9;\n  color: black;\n}";

        assertEquals(expected, cssFormatter.doFormat(code, null));
    }

}