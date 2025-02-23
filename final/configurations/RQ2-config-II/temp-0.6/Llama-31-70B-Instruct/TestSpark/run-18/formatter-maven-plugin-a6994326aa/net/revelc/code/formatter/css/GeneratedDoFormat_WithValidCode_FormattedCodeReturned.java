package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedDoFormat_WithValidCode_FormattedCodeReturned {

    @Test
    public void doFormat_WithValidCode_FormattedCodeReturned() throws IOException {
        String code = "body { color: red; }";
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), null);

        String formattedCode = formatter.doFormat(code, null);

        assertEquals("body {\n    color: red;\n}\n", formattedCode);
    }

}