package net.revelc.code.formatter.css;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import org.junit.Test;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDoFormatDifferentCodeTest {

    @Test
    public void doFormatDifferentCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        String code = "/* css comment */ .testClass { margin: 20px; }";

        String result = cssFormatter.doFormat(code, LineEnding.LF);

        assertNotNull(result);
    }

}