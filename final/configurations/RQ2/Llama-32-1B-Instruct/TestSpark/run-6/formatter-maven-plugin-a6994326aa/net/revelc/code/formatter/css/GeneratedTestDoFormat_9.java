package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat_9 {

    @Test
    public void testDoFormat_9() {
        InputSource is = mock(InputSource.class);
        CSSOMParser parser = new CSSOMParser();
        CSSStyleSheetImpl styleSheet7 = new CSSStyleSheetImpl();
        when(parser.parse(is)).thenReturn(styleSheet7);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), ConfigurationSource.class);
        String code = formatter.doFormat(styleSheet7, LineEnding.ELF);
        verify(codeBuilder()).append(code());
    }

    private CodeBuilder createCodeBuilder() {
        return new CodeBuilder();
    }

}