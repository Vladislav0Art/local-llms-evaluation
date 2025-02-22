package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);
        assertNotNull(cssFormatter.formatter);
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        LineEnding lineEnding = LineEnding.LF;
        String code = "h1 {color:blue;font-size:14px;}";
        String expected = "h1 {\n    color: blue;\n    font-size: 14px;\n}";
        String actual = cssFormatter.doFormat(code, lineEnding);
        assertEquals(expected, actual);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

}