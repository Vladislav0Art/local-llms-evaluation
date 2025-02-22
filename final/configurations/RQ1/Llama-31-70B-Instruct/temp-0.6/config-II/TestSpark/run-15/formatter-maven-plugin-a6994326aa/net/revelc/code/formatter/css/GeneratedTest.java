package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "h1 {font-size: 20px; color: #000;}";
        assertEquals("h1 {\n    font-size: 20px;\n    color: #000;\n}", formatter.doFormat(code, null));
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.isInitialized());
    }

}