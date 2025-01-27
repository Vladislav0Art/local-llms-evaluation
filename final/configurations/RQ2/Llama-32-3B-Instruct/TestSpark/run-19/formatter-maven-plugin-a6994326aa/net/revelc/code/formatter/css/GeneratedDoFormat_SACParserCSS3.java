package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedDoFormat_SACParserCSS3 {

    @Test
    public void doFormat_SACParserCSS3() throws IOException {
        InputSource input = new InputSource(new StringReader("body { color: red; }"));
        CSSStyleSheetImpl styleSheet = new CSSStyleSheetImpl();
        CssFormatter formatter = new CssFormatter();
        boolean initialized = false;
        formatter.init(null, null);
        actualInit = true;
        try {
            ((CssFormatter) formatter).doFormat(styleSheet.getRules().getRule(0), LineEnding.LF);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

}