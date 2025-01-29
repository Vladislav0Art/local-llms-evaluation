package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_4 {

    @Test
    public void testDoFormat_4() {
        InputSource is = mock(InputSource.class);
        SACParserCSS3 parser2 = new SACParserCSS3();
        CSSStyleSheetImpl styleSheet2 = new CSSStyleSheetImpl();
        when(parser2.parse(is)).thenReturn(styleSheet2);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), ConfigurationSource.class);
        String code = formatter.doFormat(styleSheet2, LineEnding.CR);
        verify(codeBuilder()).append(code());
    }

}