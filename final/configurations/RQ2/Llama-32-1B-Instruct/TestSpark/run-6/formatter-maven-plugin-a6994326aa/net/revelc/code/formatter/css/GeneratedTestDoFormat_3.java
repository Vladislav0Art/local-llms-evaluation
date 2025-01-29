package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_3 {

    @Test
    public void testDoFormat_3() {
        InputSource is = mock(InputSource.class);
        CSSOMParser parser1 = new CSSOMParser();
        CSSStyleSheetImpl styleSheet1 = new CSSStyleSheetImpl();
        when(parser1.parse(is)).thenReturn(styleSheet1);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), ConfigurationSource.class);
        String code = formatter.doFormat(styleSheet1, LineEnding.ELF);
        verify(codeBuilder()).append(code());
    }

}