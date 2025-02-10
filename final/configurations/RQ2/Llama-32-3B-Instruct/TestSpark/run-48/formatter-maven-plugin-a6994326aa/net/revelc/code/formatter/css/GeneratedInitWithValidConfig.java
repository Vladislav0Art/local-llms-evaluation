package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.CssFormatter;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedInitWithValidConfig {

    private static final String DEFAULT_CONTENT = "body { background-color: #f2f2f2; }";

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

}