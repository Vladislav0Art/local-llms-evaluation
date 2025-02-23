package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void initTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
        assertNotNull(cssFormatter.formatter);
    }

    @Test
    public void doFormatTest() {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "some code";
        String formattedCode = cssFormatter.doFormat(code, null);
        assertNotNull(formattedCode);
    }

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        boolean isInitialized = cssFormatter.isInitialized();
        assertTrue(isInitialized);
    }

}