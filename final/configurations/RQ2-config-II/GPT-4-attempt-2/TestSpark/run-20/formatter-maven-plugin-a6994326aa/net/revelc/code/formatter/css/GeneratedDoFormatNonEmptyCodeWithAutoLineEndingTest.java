package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatNonEmptyCodeWithAutoLineEndingTest {

    @Test
    public void doFormatNonEmptyCodeWithAutoLineEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = ".class { color: #000; }";

        String result = formatter.doFormat(code, LineEnding.AUTO);

        Assert.assertEquals(code, result);
    }

}