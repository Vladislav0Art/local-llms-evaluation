package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestIsInitialized {

    private CssFormatter cssFormatter;

    @Test
    public void testIsInitialized() {
        cssFormatter = new CssFormatter();
        boolean result = cssFormatter.isInitialized();

        assertTrue(result);
    }

}