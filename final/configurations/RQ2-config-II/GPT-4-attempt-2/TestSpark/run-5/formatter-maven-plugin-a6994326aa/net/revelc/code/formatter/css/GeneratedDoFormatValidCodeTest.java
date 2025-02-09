package net.revelc.code.formatter.css;

import java.io.IOException;
import java.util.*;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body {background-color: lightblue;}";
        LineEnding ending = LineEnding.AUTO;

        String result = cssFormatter.doFormat(code, ending);

        Assert.assertEquals("body {\n  background-color: lightblue;\n}\n", result);
    }

}