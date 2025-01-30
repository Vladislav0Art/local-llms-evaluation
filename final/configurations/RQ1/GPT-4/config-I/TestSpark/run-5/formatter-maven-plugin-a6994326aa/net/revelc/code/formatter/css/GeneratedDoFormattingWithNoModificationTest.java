package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormattingWithNoModificationTest {

    @Test
    public void doFormattingWithNoModificationTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        String code = "";
        String formattedCode = cssFormatter.doFormat(code, null);

        assertNull(formattedCode);
    }

}