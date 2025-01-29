package net.revelc.code.formatter.css;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Parser;
import org.junit.Test;

public class GeneratedTestDoFormat_HasInvalidStyleAttribute {

    @Test
    public void testDoFormat_HasInvalidStyleAttribute() throws IOException {
        final Parser parser = new Parser();
        final String code = "{\n  background-color: #f2f2f2;\n  invalid-style; }";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #f2f2f2; invalid-style; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

}