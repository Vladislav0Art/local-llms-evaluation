package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestDoFormatCss {

    @Test
    public void testDoFormatCss() {
        final String cssCode = "body { background-color: #f2f2f2; }";
        Mockito.when(doesNotThrow(() -> new CssFormatter().doFormat(cssCode, LineEnding.CRLF))).thenReturn(cssCode);
        String result = doesTest(doesNotThrow(() -> new CssFormatter().doFormat(cssCode, LineEnding.CRLF)));
        assert not(result.isEmpty());
    }

}