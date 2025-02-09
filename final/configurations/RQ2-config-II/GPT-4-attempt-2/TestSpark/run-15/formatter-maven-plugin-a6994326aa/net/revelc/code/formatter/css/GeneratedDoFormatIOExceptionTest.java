package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedDoFormatIOExceptionTest {

    @Test
    public void doFormatIOExceptionTest() throws IOException {
        CssFormatter testFormatter = new CssFormatter();
        testFormatter.doFormat("css code", LineEnding.AUTO);
    }

}