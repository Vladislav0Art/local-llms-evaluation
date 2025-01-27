package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.InputSource;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedInitDefaultOptionsTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initDefaultOptionsTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;
        formatter.init(options, cfg);
        assertNull(formatter.getOptions());
    }

}