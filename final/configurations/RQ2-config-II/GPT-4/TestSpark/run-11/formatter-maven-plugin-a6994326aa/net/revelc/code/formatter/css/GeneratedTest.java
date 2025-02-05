package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void initOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource configurationSource = new ConfigurationSource();

        formatter.init(options, configurationSource);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatIOExceptionTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat("invalid css code", LineEnding.AUTO);
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String formattedCss = formatter.doFormat("body{background-color:#fff;}", LineEnding.AUTO);
        assertEquals("body {\n  background-color: #fff;\n}\n", formattedCss);
    }

    @Test
    public void isInitializedFalseTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}