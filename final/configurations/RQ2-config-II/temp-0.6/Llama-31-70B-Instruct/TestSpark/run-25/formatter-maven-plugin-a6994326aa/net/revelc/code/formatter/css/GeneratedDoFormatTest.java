package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        assertNotNull(formatter.doFormat(null, LineEnding.LF));
    }

}