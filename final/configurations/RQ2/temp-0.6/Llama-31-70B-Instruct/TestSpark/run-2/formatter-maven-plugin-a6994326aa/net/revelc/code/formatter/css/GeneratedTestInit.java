package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

public class GeneratedTestInit {

    private CssFormatter cssFormatter;

    @Test
    public void testInit() {
        cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
        assertNotNull(cssFormatter.formatter);
    }

}