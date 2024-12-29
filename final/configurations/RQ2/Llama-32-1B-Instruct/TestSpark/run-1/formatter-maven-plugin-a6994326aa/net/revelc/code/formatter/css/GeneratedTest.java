package net.revelc.code.formatter.css;

import net.revelc.common.model.InputSource;
import net.revelc.common.util.LineEnding;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AbstractCacheableFormatter formatter;

    @InjectMocks
    private CssFormatter cssFormatter;

    private InputSource inputSource = new StringReader("/* This is a CSS code */");

    @Before
    public void setup() {
        when(formatter.getImplementation()).thenReturn(cssFormatImpl);
    }

    public void testCssFormatterInitialization() {
        when(cssFormatImpl.getOptions()).thenReturn(Map.of("format", "css"));

        String result = cssFormatter.init(inputSource, null);
        assertEquals("linear-gradient(90deg, linear-gradient(to right, red, blue), red)", result);
    }

}