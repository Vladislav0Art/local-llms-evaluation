package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.io.StringReader;

public class GeneratedTest {

    @Test
    public void testDoFormat_SimpleCss() {
        String cssCode = "@media print { body { color: blue; } }";
        when(getCssOMParser()).thenReturn(new SACParserCSS3());
        when(getCssOMParser().parse(cssCode)).thenReturn("body { color: blue; }");
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(cssCode, LineEnding.LF);
        assertEquals("<style>body { color: blue; }</style>", result);
    }

    @Test
    public void testDoFormat_InvalidCss() {
        when(getCssOMParser()).thenReturn(new SACParserCSS3());
        when(getCssOMParser().parse("invalid css code")).thenReturn("css code");
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat("", LineEnding.LF);
        assertEquals(null, result);
    }

    @Test
    public void testDoFormat_NoStylesheet() {
        when(getCssOMParser()).thenReturn(new SACParserCSS3());
        CssFormatter formatter = new CssFormatter();
        String cssCode = "";
        when(getCssOMParser().parse(cssCode)).thenReturn("div { color: red; }");
        String result = formatter.doFormat(cssCode, LineEnding.LF);
        assertEquals("div { color: red; }", result);
    }

    @Test
    public void testDoFormat_NoStylesheetNoStyles() {
        when(getCssOMParser()).thenReturn(new SACParserCSS3());
        CssFormatter formatter = new CssFormatter();
        String cssCode = "@media print { body { background-image: url('image.jpg'); } }";
        when(getCssOMParser().parse(cssCode)).thenReturn("body { background-image: url('image.jpg'); }");
        String result = formatter.doFormat(cssCode, LineEnding.LF);
        assertEquals("<style>body { background-image: url('image.jpg'); }</style>", result);
    }

    @Test
    public void testIsInitialized_SimpleCss() {
        when(getConfig()).thenReturn(new ConfigurationSource());
        CssFormatter formatter = new CssFormatter();
        boolean isInitialized = formatter.isInitialized();
        assertTrue(isInitialized, "Expected isInitialized to return true");
    }

    @Test
    public void testIsInitialized_NoOptions() {
        when(getConfig()).thenReturn(null);
        CssFormatter formatter = new CssFormatter();
        boolean isInitialized = formatter.isInitialized();
        assertTrue(isInitialized, "Expected isInitialized to return false");
    }

}