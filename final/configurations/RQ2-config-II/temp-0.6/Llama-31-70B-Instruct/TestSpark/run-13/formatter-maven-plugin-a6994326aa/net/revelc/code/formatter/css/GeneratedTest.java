package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void doFormatTest() throws IOException {
        var code = "/* test */";
        var ending = LineEnding.UNIX;
        var formatter = new CssFormatter();
        formatter.init(Map.of(), null);

        var formattedCode = formatter.doFormat(code, ending);

        assertNotEquals(code, formattedCode);
    }

    @Test
    public void doFormatWithNullCodeTest() {
        var code = null;
        var ending = LineEnding.UNIX;
        var formatter = new CssFormatter();
        formatter.init(Map.of(), null);

        var formattedCode = formatter.doFormat(code, ending);

        assertNull(formattedCode);
    }

    @Test
    public void doFormatWithNullEndingTest() {
        var code = "/* test */";
        var ending = null;
        var formatter = new CssFormatter();
        formatter.init(Map.of(), null);

        var formattedCode = formatter.doFormat(code, ending);

        assertNotNull(formattedCode);
    }

    @Test
    public void doFormatWithNullOptionsTest() {
        var code = "/* test */";
        var ending = LineEnding.UNIX;
        var formatter = new CssFormatter();
        formatter.init(null, null);

        var formattedCode = formatter.doFormat(code, ending);

        assertNotNull(formattedCode);
    }

    @Test
    public void doFormatWithNullCfgTest() {
        var code = "/* test */";
        var ending = LineEnding.UNIX;
        var formatter = new CssFormatter();
        formatter.init(Map.of(), null);

        var formattedCode = formatter.doFormat(code, ending);

        assertNotNull(formattedCode);
    }

}