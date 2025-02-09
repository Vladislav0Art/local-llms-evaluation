package net.revelc.code.formatter.css;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithIOExceptionTest {

    @Test
    public void doFormatWithIOExceptionTest() throws IOException {
        String code = null; // This should cause IOException when trying to format
        LineEnding ending = LineEnding.CRLF;

        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat(code, ending);
    }

}