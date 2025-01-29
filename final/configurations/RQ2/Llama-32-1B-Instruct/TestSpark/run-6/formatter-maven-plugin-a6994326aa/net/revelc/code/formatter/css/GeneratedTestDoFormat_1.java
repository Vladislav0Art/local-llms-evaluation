package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_1 {

    @Test
    public void testDoFormat_1() {
        InputSource is = mock(InputSource.class);
        CSSOMParser parser = mock(CSSOMParser.class);
        CSSStyleSheetImpl styleSheet = mock(CSSStyleSheetImpl.class);
        when(parser.parse(is)).thenReturn(styleSheet);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), ConfigurationSource.class);
        String code = formatter.doFormat(styleSheet, LineEnding.ELF);
        verify(codeBuilder()).append(code());
    }

}