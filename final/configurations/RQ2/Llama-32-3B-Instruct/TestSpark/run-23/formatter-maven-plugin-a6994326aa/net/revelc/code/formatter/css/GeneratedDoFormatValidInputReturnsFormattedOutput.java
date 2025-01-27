package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDoFormatValidInputReturnsFormattedOutput {

    @Test
    public void doFormatValidInputReturnsFormattedOutput() throws Exception {
        String input = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.CRLF;
        CssFormatter formatter = new CssFormatter();
        String output = formatter.doFormat(input, ending);
        assertEquals("body { background-color: #f2f2f2; }\n", output);
    }

}