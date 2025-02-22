package net.revelc.code.formatter.css;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String code = "h1 {font-size: 20px; color: #000;}";
        assertEquals("h1 {\n    font-size: 20px;\n    color: #000;\n}", formatter.doFormat(code, null));
    }

}