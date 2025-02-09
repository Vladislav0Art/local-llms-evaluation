package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void initValidOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(new HashMap<>(), cfg);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initNullOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(null, cfg);
        assertFalse(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatNullCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat(null, LineEnding.AUTO);
    }

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String formattedCode = cssFormatter.doFormat("", LineEnding.AUTO);
        assertEquals("", formattedCode);
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {margin: 0; padding: 0;}";
        String formattedCode = cssFormatter.doFormat(code, LineEnding.AUTO);
        assertEquals("body { margin: 0; padding: 0; }", formattedCode);
    }

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        cssFormatter.init(new HashMap<>(), cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}