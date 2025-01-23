package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
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

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);
        assertNotNull(cssFormatter);
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.UNIX;
        String formattedCode = cssFormatter.doFormat(code, ending);
        assertNotNull(formattedCode);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        boolean initialized = cssFormatter.isInitialized();
        assertTrue(initialized);
    }

}