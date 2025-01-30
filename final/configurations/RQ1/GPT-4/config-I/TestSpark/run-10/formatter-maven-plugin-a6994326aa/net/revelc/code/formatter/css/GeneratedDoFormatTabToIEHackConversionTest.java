package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedDoFormatTabToIEHackConversionTest {

    @Test
    public void doFormatTabToIEHackConversionTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        String code = ".testClass {\n\tcolor: #ffffff;\n}";

        String formattedCodeExpected = ".testClass {\n    color: #ffffff\\9;\n}";

        assertEquals(formattedCodeExpected, cssFormatter.doFormat(code, LineEnding.CRLF));
    }

}