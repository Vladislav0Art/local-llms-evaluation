package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithNullOptionsTest {

    @Test
    public void doFormatWithNullOptionsTest() {
        var code = "/* test */";
        var ending = LineEnding.UNIX;
        var formatter = new CssFormatter();
        formatter.init(null, null);

        var formattedCode = formatter.doFormat(code, ending);

        assertNotNull(formattedCode);
    }

}