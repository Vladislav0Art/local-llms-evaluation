package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatCodeWithoutNewLinesTest {

    @Test
    public void doFormatCodeWithoutNewLinesTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body{}";

        String formattedCode = cssFormatter.doFormat(code, LineEnding.CRLF);

        assertTrue(formattedCode.contains(LineEnding.CRLF.getChars()));
    }

}