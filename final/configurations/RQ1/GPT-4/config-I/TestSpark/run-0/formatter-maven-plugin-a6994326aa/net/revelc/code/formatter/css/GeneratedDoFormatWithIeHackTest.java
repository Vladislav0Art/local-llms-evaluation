package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDoFormatWithIeHackTest {

    @Test
    public void doFormatWithIeHackTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        try {
            String result = cssFormatter.doFormat(".myClass { color: #FFFFFF\\9; }", LineEnding.LF);
            assertEquals(".myClass {\n  color: #FFFFFF\\9;\n}\n", result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}