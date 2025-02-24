package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private CssFormatter formatter;

    @Test
    public void initSuccessfulTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initWithNullOptionsTest() {
        ConfigurationSource cfg = new ConfigurationSource();
        formatter = new CssFormatter();
        formatter.init(null, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initWithNullConfigurationSourceTest() {
        Map<String, String> options = new HashMap<>();
        formatter = new CssFormatter();
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatWithLineEndingTest() throws IOException {
        String code = "test";
        LineEnding ending = LineEnding.WINDOWS;
        formatter = new CssFormatter();
        String result = formatter.doFormat(code, ending);
        assertNotNull(result);
    }

    @Test
    public void doFormatWithoutLineEndingTest() throws IOException {
        String code = "test";
        formatter = new CssFormatter();
        String result = formatter.doFormat(code, null);
        assertNotNull(result);
    }

}