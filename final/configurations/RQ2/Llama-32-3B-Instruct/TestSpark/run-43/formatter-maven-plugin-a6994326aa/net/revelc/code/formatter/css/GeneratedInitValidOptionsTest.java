package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;

public class GeneratedInitValidOptionsTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initValidOptionsTest() {
        Map<String, String> options = Collections.singletonMap("cssVersion", "3");
        ConfigurationSource cfg = null;
        try {
            formatter.init(options, cfg);
        } catch (Exception e) {
        }
        assertNotNull(formatter);
    }

}