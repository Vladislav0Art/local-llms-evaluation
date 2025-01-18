package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.nio.charset.StandardCharsets;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.io.File;

public class GeneratedTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: blue; }";
        String formattedCode = formatter.doFormat(code, LineEnding.LF);
        Assert.assertEquals("body {\n  color: blue;\n}\n", formattedCode);
    }

    @Test
    public void doFormatInvalidCodeThrowsExceptionTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String invalidCode = "body { color";
        formatter.doFormat(invalidCode, LineEnding.LF);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
        formatter.init(new HashMap<>(), null);
        Assert.assertTrue(formatter.isInitialized());
    }

}