package net.revelc.code.formatter.css;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Parser;
import org.junit.Test;

public class GeneratedTestDoFormat_HasMultipleStyles {

    @Test
    public void testDoFormat_HasMultipleStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "body {\n  background-color: #f2f2f2;\n  font-size: 14px;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #f2f2f2; font-size: 14px; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

}