package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedInitInvalidIndentTest {

    @Test
    public void initInvalidIndentTest() {
        CssFormatter cssFormatter = new CssFormatter();
        ConfigurationSource cfg = new ConfigurationSource();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "invalid");
        cssFormatter.init(options, cfg);
    }

}