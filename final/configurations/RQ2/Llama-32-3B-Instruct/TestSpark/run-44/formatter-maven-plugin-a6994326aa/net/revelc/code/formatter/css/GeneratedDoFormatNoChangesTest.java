package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.Map;

public class GeneratedDoFormatNoChangesTest {

    @Test
    public void doFormatNoChangesTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: black; }";
        String expectedOutput = "body { color: black; }";
        assertEquals(expectedOutput, formatter.doFormat(code, LineEnding.LF));
    }

}