package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithNoChangesTest {

    @Test
    public void doFormatWithNoChangesTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        try {
            String result = cssFormatter.doFormat(".myClass {\n  color: #FFFFFF;\n}\n", LineEnding.LF);
            assertNull(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}