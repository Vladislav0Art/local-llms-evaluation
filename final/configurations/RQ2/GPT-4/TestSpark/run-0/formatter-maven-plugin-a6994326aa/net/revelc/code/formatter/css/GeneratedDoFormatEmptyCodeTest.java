package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class GeneratedDoFormatEmptyCodeTest {

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat("", LineEnding.LF);
        Assert.assertEquals("", result);
    }

}