package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static final Logger logger = LoggerFactory.getLogger(CssFormatterTest.class);

    @Mock
    private net.revelc.code.formatter.ConfigurationSource cfg;

    @Mock
    private net.revelc.code.formatter.AbstractCacheableFormatter abstractCacheableFormatter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void init_NoOptions_Okay() {
        //given
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, cfg);
        when(cfg.getOptionValue(anyString())).thenReturn("value");

        //when and then
        when(abstractCacheableFormatter.doFormat(any(), any())).thenThrow(new RuntimeException());
        verify(cfg).getOptionValue();
    }

    @Test
    public void init_OptionsWithInvalidTypes_Fails() {
        //given
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, cfg);

        //when and then
        try {
            when(abstractCacheableFormatter.doFormat(any(), any())).thenThrow(new RuntimeException());
            fail("Expected exception not thrown");
        } catch (RuntimeException e) {
        }

        verify(cfg).getOptionValue();
    }

    @Test
    public void doFormat_EmptyString_Okay() throws IOException {
        //given
        String code = "";
        cssFormatter.doFormat(code, LineEnding.LF);
        when(abstractCacheableFormatter.init(any(), any())).thenReturn("");

        //when and then
        assertNotNull(cssFormatter.format(code, LineEnding.LF));
        verify(cfg).getOptionValue();
    }

    @Test
    public void doFormat_SimpleString_Okay() throws IOException {
        //given
        String code = "css";
        cssFormatter.doFormat(code, LineEnding.LF);
        when(abstractCacheableFormatter.init(any(), any())).thenReturn("css");

        //when and then
        assertNotNull(cssFormatter.format(code, LineEnding.LF));
        verify(cfg).getOptionValue();
    }

    @Test
    public void doFormat_ComplexString_Okay() throws IOException {
        //given
        String code = "body{width:100%}";
        cssFormatter.doFormat(code, LineEnding.LF);
        when(abstractCacheableFormatter.init(any(), any())).thenReturn("body{width:100%}");

        //when and then
        assertNotNull(cssFormatter.format(code, LineEnding.LF));
        verify(cfg).getOptionValue();
    }

    @Test
    public void doFormat_WithInvalidCode_Okay() throws IOException {
        //given
        String code = "css";
        cssFormatter.doFormat(code, LineEnding.LF);
        when(abstractCacheableFormatter.init(any(), any())).thenReturn("invalid");

        //when and then
        assertNotNull(cssFormatter.format(code, LineEnding.LF));
        verify(cfg).getOptionValue();
    }

    @Test
    public void isInitialized_Okay() {
        //given
        cssFormatter.init(new HashMap<>(), cfg);

        //when and then
        assertTrue(cssFormatter.isInitialized());
    }

}