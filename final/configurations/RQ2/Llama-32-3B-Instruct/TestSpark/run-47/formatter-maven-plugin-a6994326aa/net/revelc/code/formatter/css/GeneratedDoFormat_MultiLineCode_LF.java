package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.w3c.css.sac.InputSource;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedDoFormat_MultiLineCode_LF {

    @Test
    public void doFormat_MultiLineCode_LF() throws IOException {
        String code = ".class {\n  color: red;\n}\n";
        String expected = " .class {\n  color: red;\n} \n";
        String actual = new CssFormatter().doFormat(code, LineEnding.LF);
        assertEquals(expected, actual);
    }

}