package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTestDoFormat {

    // Testing the init method

    @Test
    public void testDoFormat() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "test code";
        LineEnding ending = LineEnding.UNIX;
        String result = cssFormatter.doFormat(code, ending);
        assertNotNull(result);
    }

}