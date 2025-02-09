package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatNonEmptyCodeWithUnixLineEndingTest {

    @Test
    public void doFormatNonEmptyCodeWithUnixLineEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = ".class { color: #000; }";

        String result = formatter.doFormat(code, LineEnding.UNIX);

        Assert.assertEquals(code, result);
    }

}