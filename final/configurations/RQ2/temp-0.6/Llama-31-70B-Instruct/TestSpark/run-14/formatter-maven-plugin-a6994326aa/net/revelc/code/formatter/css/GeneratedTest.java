package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;
import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedTest {

    private static final String code = "code";
    private static final String formattedCode = "formattedCode";
    private static final String codeWithIE9Hack = "codeWithIE9Hack";
    private static final String codeWithoutIE9Hack = "codeWithoutIE9Hack";

    @Test
    public void testInit() {
        final Map<String, String> options = new TreeMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        final var cfg = mock(ConfigurationSource.class);
        final var cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);
        assertTrue(cssFormatter.isInitialized());
    }

}