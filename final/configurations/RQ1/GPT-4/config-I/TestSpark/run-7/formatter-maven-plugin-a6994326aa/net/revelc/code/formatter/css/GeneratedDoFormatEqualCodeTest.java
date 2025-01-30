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

public class GeneratedDoFormatEqualCodeTest {

    @Test
    public void doFormatEqualCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        String code = ".testClass { margin: 20px; }";

        var result = cssFormatter.doFormat(code, LineEnding.CRLF);

        assertNull(result);
    }

}