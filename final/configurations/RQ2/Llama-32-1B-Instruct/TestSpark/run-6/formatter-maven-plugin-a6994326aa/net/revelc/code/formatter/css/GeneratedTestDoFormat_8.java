package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_8 {

    @Test
    public void testDoFormat_8() {
        InputSource is = mock(InputSource.class);
        SACParserCSS3 parser = new SACParserCSS3();
        CSSStyleSheetImpl styleSheet6 = new CSSStyleSheetImpl();
        when(parser.parse(is)).thenReturn(styleSheet6);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), ConfigurationSource.class);
        String code = formatter.doFormat(styleSheet6, LineEnding.CR);
        verify(codeBuilder()).append(code());
    }

}