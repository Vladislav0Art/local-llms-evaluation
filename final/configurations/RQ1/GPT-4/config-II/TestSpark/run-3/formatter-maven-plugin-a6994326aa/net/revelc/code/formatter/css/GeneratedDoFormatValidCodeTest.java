package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatValidCodeTest {

    @Test
    public void doFormatValidCodeTest() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();

        String code = "body {background-color: #ffffff;}";

        assertEquals("body {background-color: #ffffff;}", cssFormatter.doFormat(code, null));
    }

}