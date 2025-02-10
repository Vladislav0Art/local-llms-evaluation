package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.CssFormatter;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedTest {

    private static final String DEFAULT_CONTENT = "body { background-color: #f2f2f2; }";

    @Test
    public void initWithEmptyOptions() {
        Map<String, String> options = new java.util.HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initWithValidConfig() {
        Map<String, String> options = new java.util.HashMap<>();
        options.put("format", "css3");
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getFormat()).thenReturn("css3");
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initWithInvalidConfig() {
        Map<String, String> options = new java.util.HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getFormat()).thenReturn("invalid");
        CssFormatter formatter = new CssFormatter();
        assertNotEquals(0, formatter.init(options, cfg));
    }

    @Test
    public void doFormatEmptyContent() {
        String expected = "";
        CssFormatter formatter = new CssFormatter();
        assertEquals(expected, formatter.doFormat(DEFAULT_CONTENT, LineEnding.LF));
    }

    @Test
    public void doFormatSingleLine() {
        String content = "body { background-color: #f2f2f2; }";
        String expected = CSSFormat.CSS3.format(content);
        CssFormatter formatter = new CssFormatter();
        assertEquals(expected, formatter.doFormat(content, LineEnding.LF));
    }

    @Test
    public void doFormatMultiLine() {
        String content = "body { background-color: #f2f2f2; }\n" +
                ".header { font-size: 1.5em; color: #333; }";
        String expected = CSSFormat.CSS3.format(content);
        CssFormatter formatter = new CssFormatter();
        assertEquals(expected, formatter.doFormat(content, LineEnding.LF));
    }

    @Test
    public void doFormatInvalidContent() {
        assertThrows(IOException.class, () -> new CssFormatter().doFormat(" invalid content", LineEnding.LF));
    }

}