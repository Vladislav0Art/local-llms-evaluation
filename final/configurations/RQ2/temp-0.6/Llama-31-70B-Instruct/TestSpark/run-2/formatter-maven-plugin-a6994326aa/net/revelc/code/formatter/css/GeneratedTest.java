package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Test
    public void testFormat() throws IOException {
        cssFormatter = new CssFormatter();
        String code = "h1 {color: red;}";
        String formattedCode = cssFormatter.doFormat(code, LineEnding.WINDOWS);
        assertNotNull(formattedCode);
        assertNotEquals(code, formattedCode);
    }

    @Test
    public void testInit() {
        cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
        assertNotNull(cssFormatter.formatter);
    }

    @Test
    public void testIsInitialized() {
        cssFormatter = new CssFormatter();
        assertNotNull(cssFormatter.isInitialized());
    }

}