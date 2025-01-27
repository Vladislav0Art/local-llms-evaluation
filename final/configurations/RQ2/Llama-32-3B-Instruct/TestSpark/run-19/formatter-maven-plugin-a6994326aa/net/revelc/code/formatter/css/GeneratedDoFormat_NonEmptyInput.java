package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormat_NonEmptyInput {

    @Test
    public void doFormat_NonEmptyInput() throws IOException {
        String input = "body { color: red; }";
        LineEnding ending = LineEnding.CRLF;
        String expectedOutput = "body { color: red; }\n";
        String actualOutput = ((CssFormatter) new CssFormatter()).doFormat(input, ending);
        assertEquals(expectedOutput, actualOutput);
    }

}