package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color : #fff ; }";
        String expected = "body {\n  color: #fff;\n}\n";
        String result = formatter.doFormat(code, LineEnding.CRLF);
        Assert.assertEquals(expected, result);
    }

}