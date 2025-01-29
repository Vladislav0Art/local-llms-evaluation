package net.revelc.code.formatter.css;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Parser;
import org.junit.Test;

public class GeneratedTestDoFormat_HasInvalidStyleAttributeInStyles {

    @Test
    public void testDoFormat_HasInvalidStyleAttributeInStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "{\n  invalid-style: #f2f2f2;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { invalid-style: #ffffff; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

}