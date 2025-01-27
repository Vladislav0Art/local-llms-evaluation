package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

public class GeneratedDoFormat_LFTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormat_LFTest() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF;
        String expectedOutput = "body {\n  background-color: #f2f2f2;\n}\n";
        assertEquals(expectedOutput, formatter.doFormat(code, ending));
    }

}