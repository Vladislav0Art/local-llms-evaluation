package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import org.w3c.css.sac.InputSource;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDoFormatWithoutOptions {

    @Test
    public void testDoFormatWithoutOptions() {
        String code = "body { background-color: #fff; }";
        LineEnding ending = LineEnding.CRLF;
        assertTrue(CssFormatter.doFormat(code, ending));
    }

}