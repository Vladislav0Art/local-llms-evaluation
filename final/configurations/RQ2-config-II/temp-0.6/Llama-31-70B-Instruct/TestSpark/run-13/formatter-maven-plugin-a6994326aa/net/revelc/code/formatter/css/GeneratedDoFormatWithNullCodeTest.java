package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithNullCodeTest {

    @Test
    public void doFormatWithNullCodeTest() {
        var code = null;
        var ending = LineEnding.UNIX;
        var formatter = new CssFormatter();
        formatter.init(Map.of(), null);

        var formattedCode = formatter.doFormat(code, ending);

        assertNull(formattedCode);
    }

}