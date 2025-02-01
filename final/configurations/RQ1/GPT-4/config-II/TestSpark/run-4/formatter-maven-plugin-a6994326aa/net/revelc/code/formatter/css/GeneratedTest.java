package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void initTest() {
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "true");

        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatCaseOneTest() throws IOException {
        String code = "color: red";
        CssFormatter formatter = new CssFormatter();
        assertEquals("color:red;", formatter.doFormat(code, LineEnding.AUTO));
    }

    @Test
    public void doFormatCaseTwoTest() throws IOException {
        String code = "color: tab";
        CssFormatter formatter = new CssFormatter();
        assertEquals("color:\\9;", formatter.doFormat(code, LineEnding.AUTO));
    }

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        String code = "";
        CssFormatter formatter = new CssFormatter();
        assertNull(formatter.doFormat(code, LineEnding.AUTO));
    }

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}