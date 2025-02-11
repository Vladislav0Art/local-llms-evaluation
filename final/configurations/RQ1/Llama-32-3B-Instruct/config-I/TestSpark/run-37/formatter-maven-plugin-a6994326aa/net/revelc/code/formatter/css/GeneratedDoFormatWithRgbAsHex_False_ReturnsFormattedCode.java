package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

public class GeneratedDoFormatWithRgbAsHex_False_ReturnsFormattedCode {

    @Test
    public void doFormatWithRgbAsHex_False_ReturnsFormattedCode() throws IOException {
        String code = "body { background-color: #fff; }";
        LineEnding ending = LineEnding.LINE endings;
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), null);
        boolean rgbAsHex = false;
        Formatter result = (Formatter) formatter.getFormatters().get(0).setPropertiesInSeparateLines(rgbAsHex);
        String formattedCode = (String) result.doFormat(code, ending);
        assertNotNull(formattedCode);
    }

}