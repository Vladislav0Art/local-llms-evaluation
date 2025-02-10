package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.Map;

public class GeneratedDoFormatMultipleChangesTest {

    @Test
    public void doFormatMultipleChangesTest() throws Exception {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: black; }\nh1 { color: red; }";
        String expectedOutput = "body { color: blue; }\nh1 { color: green; }";
        assertEquals(expectedOutput, formatter.doFormat(code + "\n", LineEnding.LF));
    }

}