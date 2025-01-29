package net.revelc.code.formatter.css;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Parser;
import org.junit.Test;

public class GeneratedTestDoFormat_EmptyStyles {

    @Test
    public void testDoFormat_EmptyStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

}