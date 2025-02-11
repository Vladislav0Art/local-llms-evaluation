package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInit_withRgbAsHexTest {

    @Test
    public void init_withRgbAsHexTest() {
        // Given:
        Map<String, String> options = java.util.Map.of("rgbAsHex", Boolean.TRUE.toString());
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        // When:
        formatter.init(options, cfg);
        // Then:
        assertTrue(formatter.getFormatter().getProperties().getRgbAsHex());
    }

}