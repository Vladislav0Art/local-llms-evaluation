package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "some code";
        String formattedCode = cssFormatter.doFormat(code, null);
        assertNotNull(formattedCode);
    }

}