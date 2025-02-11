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

public class GeneratedInit_noOptionsTest {

    @Test
    public void init_noOptionsTest() {
        // Given:
        Map<String, String> options = null;
        ConfigurationSource cfg = new ConfigurationSource();
        // When:
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        // Then:
        assertNull(formatter.getFormatter());
    }

}