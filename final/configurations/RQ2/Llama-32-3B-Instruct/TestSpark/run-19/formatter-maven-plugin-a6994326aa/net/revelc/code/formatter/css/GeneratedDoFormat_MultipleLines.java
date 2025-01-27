package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormat_MultipleLines {

    @Test
    public void doFormat_MultipleLines() throws IOException {
        String input = "body { color: red; }\ndiv { font-size: 12px; }";
        LineEnding ending = LineEnding.CRLF;
        String expectedOutput = "body { color: red; }\n\ndiv { font-size: 12px; }\n";
        String actualOutput = ((CssFormatter) new CssFormatter()).doFormat(input, ending);
        assertEquals(expectedOutput, actualOutput);
    }

}