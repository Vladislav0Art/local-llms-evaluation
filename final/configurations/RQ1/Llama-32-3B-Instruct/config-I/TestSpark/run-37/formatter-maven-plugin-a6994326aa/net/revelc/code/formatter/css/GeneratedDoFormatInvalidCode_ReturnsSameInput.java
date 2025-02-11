package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

public class GeneratedDoFormatInvalidCode_ReturnsSameInput {

    @Test
    public void doFormatInvalidCode_ReturnsSameInput() throws IOException {
        String code = "body { background-color: #fff }";
        LineEnding ending = LineEnding.LINE endings;
        CssFormatter formatter = new CssFormatter();
        Formatter result = formatter.init(new HashMap<>(), null);
        String formattedCode = (String) result.doFormat(code, ending);
        assertEquals(code, formattedCode);
    }

}