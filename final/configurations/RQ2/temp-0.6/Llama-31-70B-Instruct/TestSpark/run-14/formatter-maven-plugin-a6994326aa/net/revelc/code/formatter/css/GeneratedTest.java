package net.revelc.code.formatter.css;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Formatter;

public class GeneratedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "test";
        LineEnding ending = LineEnding.LF;
        assertNotNull(cssFormatter.doFormat(code, ending));
    }

    @Test
    public void doFormatTest_WhenNullCode() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = null;
        LineEnding ending = LineEnding.LF;
        assertNull(cssFormatter.doFormat(code, ending));
    }

    @Test
    public void doFormatTest_WhenNullLineEnding() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "test";
        LineEnding ending = null;
        assertNotNull(cssFormatter.doFormat(code, ending));
    }

}