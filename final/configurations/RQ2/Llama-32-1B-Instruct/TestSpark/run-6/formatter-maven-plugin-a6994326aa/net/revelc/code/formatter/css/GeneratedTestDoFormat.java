package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestDoFormat {

    @Test
    public void testDoFormat() {
        InputSource is = mock(InputSource.class);
        CSSOMParser parser = mock(CSSOMParser.class);
        when(parser.parse(is)).thenReturn(styleSheet8);
        CssFormatter formatter = new CssFormatter(new HashMap<>(), mock(ConfigurationSource.class));
        String code = formatter.doFormat(styleSheet8, LineEnding.ELF);
        verify(codeBuilder()).append(code());
    }

}