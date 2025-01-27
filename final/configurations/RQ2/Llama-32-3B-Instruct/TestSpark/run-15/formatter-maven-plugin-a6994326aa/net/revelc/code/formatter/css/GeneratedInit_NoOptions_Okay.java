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
public class GeneratedInit_NoOptions_Okay {

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

}