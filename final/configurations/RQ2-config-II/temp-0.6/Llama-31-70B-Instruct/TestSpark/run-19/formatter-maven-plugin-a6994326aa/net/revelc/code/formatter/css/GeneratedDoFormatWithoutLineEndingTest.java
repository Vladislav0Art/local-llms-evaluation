package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithoutLineEndingTest {

    private CssFormatter formatter;

    @Test
    public void doFormatWithoutLineEndingTest() throws IOException {
        String code = "test";
        formatter = new CssFormatter();
        String result = formatter.doFormat(code, null);
        assertNotNull(result);
    }

}