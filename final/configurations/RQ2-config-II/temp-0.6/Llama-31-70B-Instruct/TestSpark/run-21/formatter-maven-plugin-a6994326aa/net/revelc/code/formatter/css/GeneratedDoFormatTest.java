package net.revelc.code.formatter.css;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import com.steadystate.css.dom.CSSStyleSheetImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import org.junit.jupiter.api.Test;

public class GeneratedDoFormatTest {

    private CssFormatter formatter;

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

}