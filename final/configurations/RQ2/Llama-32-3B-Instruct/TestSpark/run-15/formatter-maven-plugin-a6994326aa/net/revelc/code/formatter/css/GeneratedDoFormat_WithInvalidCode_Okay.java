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
public class GeneratedDoFormat_WithInvalidCode_Okay {

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
    public void doFormat_WithInvalidCode_Okay() throws IOException {
        //given
        String code = "css";
        cssFormatter.doFormat(code, LineEnding.LF);
        when(abstractCacheableFormatter.init(any(), any())).thenReturn("invalid");

        //when and then
        assertNotNull(cssFormatter.format(code, LineEnding.LF));
        verify(cfg).getOptionValue();
    }

}