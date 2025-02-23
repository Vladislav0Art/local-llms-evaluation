package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedTest {

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, null);
        assertNotEquals(null, formatter.formatter);
    }

    @Test
    public void doFormatTest() throws IOException {
        String code = "test";
        LineEnding ending = new LineEnding();
        CssFormatter formatter = new CssFormatter();
        formatter.init(null, null);
        String result = formatter.doFormat(code, ending);
        assertNull(result);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertEquals(false, formatter.isInitialized());
    }

}