package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatDifferentTest {

    @Test
    public void doFormatDifferentTest() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);

        String cssCode = "body{font-size:16px;}";
        assertNotNull(cssFormatter.doFormat(cssCode, LineEnding.LF));
    }

}