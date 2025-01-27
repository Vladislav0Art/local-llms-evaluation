package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatOneLineCodeTest {

    public static CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatOneLineCodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        assertTrue(cssFormatter.doFormat(code, ending).contains("color: red;"));
        assertEquals(1, outContent.size());
    }

}