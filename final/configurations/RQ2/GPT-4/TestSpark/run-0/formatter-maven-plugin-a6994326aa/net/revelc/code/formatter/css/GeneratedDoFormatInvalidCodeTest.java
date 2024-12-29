package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class GeneratedDoFormatInvalidCodeTest {

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat("body { color : #fff ;", LineEnding.CRLF);
    }

}