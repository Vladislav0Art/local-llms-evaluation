package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotEquals;
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
    public void initNoOptionsTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public String getProperty(String name) {
                return "";
            }
        };
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertNotEquals(null, formatter.formatter);
    }

    @Test
    public void initOptionsTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public String getProperty(String name) {
                return "";
            }
        };
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertNotEquals(null, formatter.formatter);
    }

}