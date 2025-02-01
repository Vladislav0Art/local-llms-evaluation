package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedDoFormatNullReturnTest {

    @Test
    public void doFormatNullReturnTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = new ConfigurationSource();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "4");
        cssFormatter.init(options, cfg);
        String code = "// This is a comment";
        assertNull(cssFormatter.doFormat(code, LineEnding.UNIX));
    }

}