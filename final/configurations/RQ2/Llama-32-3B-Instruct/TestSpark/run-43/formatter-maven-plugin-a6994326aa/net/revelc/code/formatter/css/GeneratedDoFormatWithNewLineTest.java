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

public class GeneratedDoFormatWithNewLineTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormatWithNewLineTest() throws IOException {
        String code = "body {\n" +
                "  background-color: blue;\n" +
                "}";
        assertEquals(code.replace("\n", "\n" + LineEnding.LF), formatter.doFormat(code, LineEnding.LF));
    }

}