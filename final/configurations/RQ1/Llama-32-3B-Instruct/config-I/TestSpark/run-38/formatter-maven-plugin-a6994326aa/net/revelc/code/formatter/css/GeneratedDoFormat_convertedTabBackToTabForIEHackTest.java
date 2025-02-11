package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.dom.CSSStyleSheetImpl;
import com.steadystate.css.parser.CSSOMParser;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedDoFormat_convertedTabBackToTabForIEHackTest {

    @Test
    public void doFormat_convertedTabBackToTabForIEHackTest() throws IOException {
        // Given:
        String code = "body { background-color: #fff; }";
        LineEnding ending = null;
        CssFormatter formatter = new CssFormatter();
        formatter.init(java.util.Map.of(), new ConfigurationSource());
        // When:
        String formattedCode = formatter.doFormat(code, ending);
        // Then:
        assertEquals(code.replace("\t;", "\\9;"), formattedCode);
    }

}