package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithNullCfgTest {

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