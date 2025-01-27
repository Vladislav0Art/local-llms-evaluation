package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormat_InvalidInput {

    @Test
    public void doFormat_InvalidInput() throws IOException {
        String input = "{ invalid css ";
        LineEnding ending = LineEnding.LF;
        try {
            ((CssFormatter) new CssFormatter()).doFormat(input, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

}