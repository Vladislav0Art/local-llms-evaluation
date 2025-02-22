package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestIsInitialized {

    private CssFormatter cssFormatter;

    @Test
    public void testIsInitialized() {
        cssFormatter = new CssFormatter();
        assertEquals(true, cssFormatter.isInitialized());
    }

}