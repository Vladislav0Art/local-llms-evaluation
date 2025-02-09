package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatEmptyCodeTest {

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat("", LineEnding.AUTO);

        Assert.assertEquals("", result);
    }

}