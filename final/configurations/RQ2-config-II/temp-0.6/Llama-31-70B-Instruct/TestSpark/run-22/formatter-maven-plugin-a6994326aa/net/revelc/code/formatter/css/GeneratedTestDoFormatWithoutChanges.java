package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTestDoFormatWithoutChanges {

    private CssFormatter cssFormatter;

    @Test
    public void testDoFormatWithoutChanges() throws IOException {
        final String code = "body {\n    margin: 0\n}\n";
        final LineEnding lineEnding = LineEnding.LF;

        cssFormatter = new CssFormatter();

        final String formattedCode = cssFormatter.doFormat(code, lineEnding);

        assertEquals(null, formattedCode);
    }

}