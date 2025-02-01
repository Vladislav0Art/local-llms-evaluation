package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatDifferentCodeTest {

    @Test
    public void doFormatDifferentCodeTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        String cssCode = "body    {   color   :   #000 ; }   ";
        assertNotNull(formatter.doFormat(cssCode, null));
    }

}