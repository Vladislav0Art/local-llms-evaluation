package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatInvalidCodeTest {

    public static CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String code = "body { color: red";
        LineEnding ending = LineEnding.LF;
        assertThrows(IOException.class, () -> cssFormatter.doFormat(code, ending));
        assertEquals(1, outContent.size());
    }

}