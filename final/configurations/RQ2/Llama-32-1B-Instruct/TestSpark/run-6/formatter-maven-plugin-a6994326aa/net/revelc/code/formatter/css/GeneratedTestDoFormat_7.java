package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_7 {

    @Test
    public void testDoFormat_7() {
        InputSource is = mock(InputSource.class);
        CSSOMParser parser = new CSSOMParser();
        CSSStyleSheetImpl styleSheet5 = new CSSStyleSheetImpl();
        when(parser.parse(is)).thenReturn(styleSheet5);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), ConfigurationSource.class);
        String code = formatter.doFormat(styleSheet5, LineEnding.ELF);
        verify(codeBuilder()).append(code());
    }

}