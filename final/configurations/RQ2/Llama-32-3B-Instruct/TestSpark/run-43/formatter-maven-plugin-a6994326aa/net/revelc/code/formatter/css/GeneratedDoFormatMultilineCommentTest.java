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

public class GeneratedDoFormatMultilineCommentTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void doFormatMultilineCommentTest() throws IOException {
        String code = "/* comment */";
        assertEquals(code, formatter.doFormat(code, LineEnding.LF));
    }

}