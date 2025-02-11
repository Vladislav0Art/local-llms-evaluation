package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedDoFormat_ValidCss_IeHack_ReturnsFormattedCode {

    @Test
    public void doFormat_ValidCss_IeHack_ReturnsFormattedCode() throws IOException {
        var formatter = new CssFormatter();
        formatter.init(Map.of("indent", "4"), null);
        var source = new InputSource(new StringReader("{ font-size: 16px; }"));
        var parser = new CSSOMParser(new SACParserCSS3());
        var sheet = (CSSStyleSheetImpl) parser.parseStyleSheet(source, null, null);
        var formattedCode = formatter.doFormat(sheet.getCssText(formatter.formatter), LineEnding.LF);
        assertTrue(formattedCode.contains("\\9;"));
    }

}