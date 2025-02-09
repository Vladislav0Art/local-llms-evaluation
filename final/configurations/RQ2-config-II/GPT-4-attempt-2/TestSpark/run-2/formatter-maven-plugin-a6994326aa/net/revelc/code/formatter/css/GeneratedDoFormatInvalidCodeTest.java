package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedDoFormatInvalidCodeTest {

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body {background-color: ;}"; // missing color name
        formatter.doFormat(code, LineEnding.LF);
    }

}