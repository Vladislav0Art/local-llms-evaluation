package net.revelc.code.formatter.css;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import com.steadystate.css.dom.CSSStyleSheetImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private CssFormatter formatter;

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        options.put("rgbAsHex", Boolean.TRUE.toString());
        options.put("useSourceStringValues", Boolean.FALSE.toString());
        formatter = new CssFormatter();
        formatter.init(options, null);
        assertEquals(4, formatter.formatter.getIndent());
        assertEquals(Boolean.TRUE, formatter.formatter.isRgbAsHex());
        assertEquals(Boolean.FALSE, formatter.formatter.isUseSourceStringValues());
    }

    @Test
    public void doFormatTest() {
        try {
            formatter = new CssFormatter();
            formatter.init(new HashMap<>(), null);
            String code = "code to format";
            LineEnding lineEnding = LineEnding.UNIX;
            String formattedCode = formatter.doFormat(code, lineEnding);
            assertEquals(code, formattedCode);
        } catch (IOException e) {
            fail("doFormat() method throws exception");
        }
    }

    @Test
    public void isInitializedTest() {
        formatter = new CssFormatter();
        assertEquals(Boolean.FALSE, formatter.isInitialized());
        formatter.init(new HashMap<>(), null);
        assertEquals(Boolean.TRUE, formatter.isInitialized());
    }

}