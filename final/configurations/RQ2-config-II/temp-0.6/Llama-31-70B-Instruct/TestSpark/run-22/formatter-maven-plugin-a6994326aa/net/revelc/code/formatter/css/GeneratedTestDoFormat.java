package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTestDoFormat {

    private CssFormatter cssFormatter;

    @Test
    public void testDoFormat() throws IOException {
        final String code = "body { margin: 0; }";
        final LineEnding lineEnding = LineEnding.LF;

        cssFormatter = new CssFormatter();

        final String formattedCode = cssFormatter.doFormat(code, lineEnding);

        assertEquals("body {\n    margin: 0\n}\n", formattedCode);
    }

}