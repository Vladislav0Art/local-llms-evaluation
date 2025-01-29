package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import org.w3c.css.sac.InputSource;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDoFormatWithEmptyOptions {

    @Test
    public void testDoFormatWithEmptyOptions() {
        String code = "body { background-color: #fff; }";
        assertTrue(CssFormatter.doFormat(code, LineEnding.CRLF));
    }

}