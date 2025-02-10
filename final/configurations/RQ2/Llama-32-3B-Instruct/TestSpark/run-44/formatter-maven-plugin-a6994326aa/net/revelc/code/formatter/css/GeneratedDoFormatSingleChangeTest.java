package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.Map;

public class GeneratedDoFormatSingleChangeTest {

    @Test
    public void doFormatSingleChangeTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: black; }";
        String expectedOutput = "body { color: blue; }";
        assertEquals(expectedOutput, formatter.doFormat(code + "\n", LineEnding.LF));
    }

}