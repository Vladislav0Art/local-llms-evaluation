package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private InputSource cfg;

    @Mock
    private ConfigurationSource config;

    @Test
    public void testInit() {
        when(cfg.getConfiguration()).thenReturn("some config");
        when(config.getConfiguration()).thenReturn(null);
        AbstractCacheableFormatter formatter = new CssFormatter();
        verify(formatter::init).withAnyArguments().thenReturn(config);
    }

    @Test
    public void testDoFormat() throws IOException {
        String code = "body { color: red; }";
        CSSFormat format = parser.parse(code).format(ending);
        assertEquals("body { color: red;" + LineEnding.CARRIAGE_RETURN, format.toString());
    }

    @Test
    public void testIsInitialized() {
        when(cfg.getConfiguration()).thenReturn("some config");
        AbstractCacheableFormatter formatter = new CssFormatter();
        verify(formatter::isInitialized).withAnyArguments().thenReturn(true);
    }
}

public class CSSFormatTest {

    private SACParserCSS3 parser;

    public void testParse() throws IOException {
        String code = "body { color: red; }";
        CSSFormat format = parser.parse(code);
        assertEquals("body { color: red;" + LineEnding.CARRIAGE_RETURN, format.toString());
    }

    public void testFormat() {
        String code = "body { color: red; }";
        CSSFormat format = new SACParserCSS3().parse(code);
        assertEquals("body { color: red;" + LineEnding.CARRIAGE_RETURN, format.toString());
    }

}