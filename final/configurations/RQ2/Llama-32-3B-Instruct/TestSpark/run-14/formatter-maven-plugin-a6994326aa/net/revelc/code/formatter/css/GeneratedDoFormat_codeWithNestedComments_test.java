package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Map;
import java.io.IOException;

import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;

public class GeneratedDoFormat_codeWithNestedComments_test {

    @Test
    public void doFormat_codeWithNestedComments_test() throws IOException {
        String code = "// comment\n/* nested comment */\nbody { color: red; }";
        LineEnding ending = LineEnding LF;
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat(code, ending);
        assertNotNull(result);
        assertTrue(result.contains("\n"));
    }

}