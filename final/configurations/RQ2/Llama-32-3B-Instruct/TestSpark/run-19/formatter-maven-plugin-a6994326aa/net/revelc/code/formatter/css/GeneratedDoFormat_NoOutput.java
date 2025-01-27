package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormat_NoOutput {

    @Test
    public void doFormat_NoOutput() throws IOException {
        String input = "body { color: red; }\n";
        LineEnding ending = LineEnding.CRLF;
        boolean actualOutput = ((CssFormatter) new CssFormatter()).doFormat(input, ending);
        assertFalse(actualOutput);
    }

}