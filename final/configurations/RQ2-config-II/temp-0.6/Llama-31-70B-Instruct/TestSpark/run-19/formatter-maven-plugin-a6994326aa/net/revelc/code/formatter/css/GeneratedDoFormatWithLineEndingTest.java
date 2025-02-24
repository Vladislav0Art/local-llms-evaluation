package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithLineEndingTest {

    private CssFormatter formatter;

    @Test
    public void doFormatWithLineEndingTest() throws IOException {
        String code = "test";
        LineEnding ending = LineEnding.WINDOWS;
        formatter = new CssFormatter();
        String result = formatter.doFormat(code, ending);
        assertNotNull(result);
    }

}