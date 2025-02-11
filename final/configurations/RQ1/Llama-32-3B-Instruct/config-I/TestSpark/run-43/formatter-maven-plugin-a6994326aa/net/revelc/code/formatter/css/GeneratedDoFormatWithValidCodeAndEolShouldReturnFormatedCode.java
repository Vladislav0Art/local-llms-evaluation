package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormatWithValidCodeAndEolShouldReturnFormatedCode {

    @Mock
    private CSSFormat formatter;

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private Map<String, String> options;

    @Before
    public void setUp() {
        options.put("indent", "4");
        options.put("rgbAsHex", Boolean.TRUE.toString());
        options.put("useSourceStringValues", Boolean.FALSE.toString());

        when(cfg.getOptions()).thenReturn(options);
    }

    @Test
    public void doFormatWithValidCodeAndEolShouldReturnFormatedCode() throws IOException {
        final var code = "/* test */\n\tbody {\n\t  background-color: #fff;\n}\t";
        final var ending = LineEnding.EOL;

        when(formatter.getCssText(any(CSSStyleSheetImpl.class))).thenReturn(code);

        final var result = new CssFormatter().doFormat(code, ending);
        assertEquals(code, result);
    }

}