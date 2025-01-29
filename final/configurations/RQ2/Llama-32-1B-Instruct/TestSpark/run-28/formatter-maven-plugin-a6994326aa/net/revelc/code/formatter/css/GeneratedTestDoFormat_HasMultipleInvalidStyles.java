package net.revelc.code.formatter.css;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Parser;
import org.junit.Test;

public class GeneratedTestDoFormat_HasMultipleInvalidStyles {

    @Test
    public void testDoFormat_HasMultipleInvalidStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "{\n  background-color: #f2f2f2;\n  invalid-style; }\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

}