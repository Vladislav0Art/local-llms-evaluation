package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_5 {

    @Test
    public void testDoFormat_5() {
        InputSource is = mock(InputSource.class);
        CSSOMParser parser = new CSSOMParser();
        CSSStyleSheetImpl styleSheet3 = new CSSStyleSheetImpl();
        when(parser.parse(is)).thenReturn(styleSheet3);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), ConfigurationSource.class);
        String code = formatter.doFormat(styleSheet3, LineEnding.ELF);
        verify(codeBuilder()).append(code());
    }

}