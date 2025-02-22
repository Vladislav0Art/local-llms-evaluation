package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestDoFormat {

    private CssFormatter cssFormatter;

    @Test
    public void testDoFormat() throws IOException {
        cssFormatter = new CssFormatter();
        String code = "div {color: red;}";
        LineEnding ending = LineEnding.NONE;
        String formattedCode = cssFormatter.doFormat(code, ending);
        assertEquals(code, formattedCode);
    }

}