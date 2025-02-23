package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedDoFormatTest {

    @Test
    public void doFormatTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = mock(Map.class);
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        cssFormatter.init(options, cfg);
        String code = "test code";
        LineEnding ending = mock(LineEnding.class);
        String formattedCode = cssFormatter.doFormat(code, ending);
        assertNotNull(formattedCode);
    }

}