package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormatTest {

    private CssFormatter formatter;

    @Test
    public void doFormatTest() throws IOException {
        String code = "body { margin: 0; }";
        LineEnding ending = LineEnding.LF;
        formatter = new CssFormatter();
        String formattedCode = formatter.doFormat(code, ending);
        assertNotNull(formattedCode);
    }

}