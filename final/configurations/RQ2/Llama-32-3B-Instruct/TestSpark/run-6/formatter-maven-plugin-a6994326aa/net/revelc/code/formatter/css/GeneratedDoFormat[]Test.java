package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDoFormat[]

Test {

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private CSSFormat format;

    @Test
    public void doFormat[] Test() throws IOException {
        String code = "/* test */";
        net.revelc.code.formatter.CssFormatter formatter = new net.revelc.code.formatter.CssFormatter(cfg);
        String result = formatter.doFormat(code, LineEnding.CRLF);
        assertNotNull(result);
        assertTrue(result.contains("/*"));
    }

}