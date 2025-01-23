package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedDoFormatWithValidCodeAndEndingTest {

    @Test
    public void doFormatWithValidCodeAndEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.UNIX;
        String formattedCode = formatter.doFormat(code, ending);
        assertNotNull(formattedCode);
        assertEquals(code, formattedCode);
    }

}