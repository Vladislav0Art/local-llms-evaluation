package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.CssFormatter;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedInitWithInvalidConfig {

    private static final String DEFAULT_CONTENT = "body { background-color: #f2f2f2; }";

    @Test
    public void initWithInvalidConfig() {
        Map<String, String> options = new java.util.HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.getFormat()).thenReturn("invalid");
        CssFormatter formatter = new CssFormatter();
        assertNotEquals(0, formatter.init(options, cfg));
    }

}