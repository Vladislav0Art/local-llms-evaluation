package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedFormatWithIndent4RgbAsHexTrueUseSourceStringValuesFalseTest {

    @Test
    public void formatWithIndent4RgbAsHexTrueUseSourceStringValuesFalseTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");
        formatter.init(options, null);
        String code = "p { color: red; }";
        String formattedCode = formatter.doFormat(code, LineEnding.LF);
        assertNotEquals(code, formattedCode);
    }

}