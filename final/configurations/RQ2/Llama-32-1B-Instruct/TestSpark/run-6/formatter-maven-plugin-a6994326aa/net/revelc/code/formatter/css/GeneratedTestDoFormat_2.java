package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_2 {

    @Test
    public void testDoFormat_2() {
        InputSource is = mock(InputSource.class);
        SACParserCSS3 parser = mock(SACParserCSS3.class);
        CSSStyleSheetImpl styleSheet = new CSSStyleSheetImpl();
        when(parser.parse(is)).thenReturn(styleSheet);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), ConfigurationSource.class);
        String code = formatter.doFormat(styleSheet, LineEnding.CR);
        verify(codeBuilder()).append(code());
    }

}