package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedDoFormat[]

Test_LF {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormat[] Test_LF() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.CRLF;
        String expectedOutput = "body {\n  background-color: #f2f2f2;\n}\r\n";
        assertEquals(expectedOutput, formatter.doFormat(code, ending));
    }

}