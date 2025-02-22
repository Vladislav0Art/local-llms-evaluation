package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestInit {

    private CssFormatter cssFormatter;

    @Test
    public void testInit() {
        Map<String, String> options = null;
        ConfigurationSource cfg = null;

        cssFormatter = new CssFormatter();
        cssFormatter.init(options, cfg);

        assertNotNull(cssFormatter);
    }

}