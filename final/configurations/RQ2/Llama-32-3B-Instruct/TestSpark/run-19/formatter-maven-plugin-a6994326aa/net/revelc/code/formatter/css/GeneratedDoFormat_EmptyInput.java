package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormat_EmptyInput {

    @Test
    public void doFormat_EmptyInput() throws IOException {
        String input = "";
        LineEnding ending = LineEnding.LF;
        String expectedOutput = "";
        String actualOutput = ((CssFormatter) new CssFormatter()).doFormat(input, ending);
        assertEquals(expectedOutput, actualOutput);
    }

}