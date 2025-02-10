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

public class GeneratedDoFormatCodeBlockTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormatCodeBlockTest() throws IOException {
        String code = "/*\n" +
                "   body {\n" +
                "     background-color: blue;\n" +
                "   }\n" +
                "*/";
        assertEquals(code, formatter.doFormat(code, LineEnding.LF));
    }

}