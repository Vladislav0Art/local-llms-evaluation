package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        String inputCode = "body { background-color: black; }";
        String result = cssFormatter.doFormat(inputCode, LineEnding.AUTO);
        assertNotNull(result);
        assertTrue(result.contains("{\n    background-color: black\n}"));
    }

}