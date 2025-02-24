package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "div { color: red; }";
        LineEnding lineEnding = LineEnding.UNIX;
        String formattedCode = cssFormatter.doFormat(code, lineEnding);
        assertTrue(formattedCode.equals(code));
    }

}