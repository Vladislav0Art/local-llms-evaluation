package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
        assertNotNull(cssFormatter.formatter);
    }

}