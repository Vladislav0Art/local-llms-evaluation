package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatEmptyCodeTest {

    public static CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String code = "";
        LineEnding ending = LineEnding.LF;
        assertTrue(cssFormatter.doFormat(code, ending).equals(""));
        assertEquals(0, outContent.size());
    }

}