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
public class GeneratedInit_OptionsWithInvalidTypes_Fails {

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

}