package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

public class GeneratedDoFormat_CRLFTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormat_CRLFTest() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.CRLF;
        String expectedOutput = "body {\n  background-color: #f2f2f2;\n}\r\n";
        assertEquals(expectedOutput, formatter.doFormat(code, ending));
    }

}