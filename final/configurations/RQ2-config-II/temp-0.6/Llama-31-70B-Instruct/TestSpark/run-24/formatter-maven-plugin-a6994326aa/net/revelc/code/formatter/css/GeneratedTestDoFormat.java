package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDoFormat {

    @Test
    public void testDoFormat() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body { background: #f00; }";
        LineEnding ending = LineEnding.WINDOWS;
        String expected = "body {\n    background: #f00;\n}\n";
        String actual = cssFormatter.doFormat(code, ending);
        assertEquals(expected, actual);
    }

}