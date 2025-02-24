package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initIsInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initInitWithNullOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
    }

    @Test
    public void initInitWithEmptyOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
    }

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "div { color: red; }";
        LineEnding lineEnding = LineEnding.UNIX;
        String formattedCode = cssFormatter.doFormat(code, lineEnding);
        assertTrue(formattedCode.equals(code));
    }

}