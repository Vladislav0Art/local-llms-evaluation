package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Test
    public void testInit() {
        Map<String, String> options = null;
        ConfigurationSource cfg = null;

        cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);

        assertNotNull(cssFormatter);
    }

    @Test
    public void testDoFormat() throws IOException {
        String code = "code";
        LineEnding ending = null;

        cssFormatter = new CssFormatter();
        String result = cssFormatter.doFormat(code, ending);

        assertNotNull(result);
    }

    @Test
    public void testIsInitialized() {
        cssFormatter = new CssFormatter();
        boolean result = cssFormatter.isInitialized();

        assertTrue(result);
    }

}