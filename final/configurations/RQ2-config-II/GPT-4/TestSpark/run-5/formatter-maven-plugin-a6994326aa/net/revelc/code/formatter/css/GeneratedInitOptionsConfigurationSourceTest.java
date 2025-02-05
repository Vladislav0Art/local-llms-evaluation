package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitOptionsConfigurationSourceTest {

    @Test
    public void initOptionsConfigurationSourceTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<String, String>();
        options.put("option1", "value1");
        ConfigurationSource cfg = new ConfigurationSource() {
            @Override
            public LineEnding getLineEnding() {
                return LineEnding.CRLF;
            }
        };
        cssFormatter.init(options, cfg);
        // Add validation
        assertTrue(cssFormatter.isInitialized());
    }

}