package net.revelc.code.formatter.css;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import com.steadystate.css.dom.CSSStyleSheetImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import org.junit.jupiter.api.Test;

public class GeneratedInitTest {

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

}