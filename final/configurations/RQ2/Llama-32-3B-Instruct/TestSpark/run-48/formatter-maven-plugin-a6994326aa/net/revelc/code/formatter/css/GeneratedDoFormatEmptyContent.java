package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import net.revelc.code.formatter.CssFormatter;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.SACParserCSS3;

public class GeneratedDoFormatEmptyContent {

    private static final String DEFAULT_CONTENT = "body { background-color: #f2f2f2; }";

    @Test
    public void doFormatEmptyContent() {
        String expected = "";
        CssFormatter formatter = new CssFormatter();
        assertEquals(expected, formatter.doFormat(DEFAULT_CONTENT, LineEnding.LF));
    }

}