package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithNullEndingTest {

    @Test
    public void doFormatWithNullEndingTest() {
        var code = "/* test */";
        var ending = null;
        var formatter = new CssFormatter();
        formatter.init(Map.of(), null);

        var formattedCode = formatter.doFormat(code, ending);

        assertNotNull(formattedCode);
    }

}