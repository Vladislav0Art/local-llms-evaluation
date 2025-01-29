package net.revelc.code.formatter.css;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Parser;
import org.junit.Test;

public class GeneratedTestDoFormat_HasInvalidStyleRule {

    @Test
    public void testDoFormat_HasInvalidStyleRule() throws IOException {
        final Parser parser = new Parser();
        final String code = "{\n  background-color: #f2f2f2;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #ffffff; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

}