package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

public class GeneratedTestIsInitialized {

    private CssFormatter cssFormatter;

    @Test
    public void testIsInitialized() {
        cssFormatter = new CssFormatter();
        assertNotNull(cssFormatter.isInitialized());
    }

}