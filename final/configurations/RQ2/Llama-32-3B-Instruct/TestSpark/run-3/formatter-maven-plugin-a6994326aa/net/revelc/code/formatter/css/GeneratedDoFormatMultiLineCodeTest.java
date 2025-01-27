package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatMultiLineCodeTest {

    public static CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatMultiLineCodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String code = "body { color: red;\nfont-size: 12px;\n}";
        LineEnding ending = LineEnding.LF;
        assertTrue(cssFormatter.doFormat(code, ending).contains("color: red;"));
        assertTrue(cssFormatter.doFormat(code, ending).contains("font-size: 12px;"));
        assertEquals(2, outContent.size());
    }

}