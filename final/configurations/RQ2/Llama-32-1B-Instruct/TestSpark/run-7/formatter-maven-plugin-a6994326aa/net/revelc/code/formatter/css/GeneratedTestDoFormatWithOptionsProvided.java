package net.revelc.code.formatter.css;

import com.steadystate.css.dom.CSSStyleSheetImpl;
import org.w3c.css.sac.InputSource;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDoFormatWithOptionsProvided {

    @Test
    public void testDoFormatWithOptionsProvided() throws IOException {
        InputSource source = new InputSource(new StringReader("body { background-color: #fff; }"));
        CSSOMParser parser = new SACParserCSS3(source);
        CSSStyleSheetImpl stylesheet = parser.parse();
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.doFormat(stylesheet, LineEnding.CRLF));
    }

}