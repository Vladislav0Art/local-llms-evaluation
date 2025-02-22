package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        assertNull(formatter.doFormat("code", LineEnding.UNIX));
    }

}