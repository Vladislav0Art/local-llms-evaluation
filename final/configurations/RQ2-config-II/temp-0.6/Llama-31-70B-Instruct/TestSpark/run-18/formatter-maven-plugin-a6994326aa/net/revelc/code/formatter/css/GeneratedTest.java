package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = null;
        ConfigurationSource cfg = null;
        formatter.init(options, cfg);
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "";
        LineEnding ending = null;
        String result = formatter.doFormat(code, ending);
        assertNotNull(result);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        boolean result = formatter.isInitialized();
        assertTrue(result);
    }

}