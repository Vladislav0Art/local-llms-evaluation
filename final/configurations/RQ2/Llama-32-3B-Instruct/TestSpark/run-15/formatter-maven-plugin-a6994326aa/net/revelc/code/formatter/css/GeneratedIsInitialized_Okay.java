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
public class GeneratedIsInitialized_Okay {

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
    public void isInitialized_Okay() {
        //given
        cssFormatter.init(new HashMap<>(), cfg);

        //when and then
        assertTrue(cssFormatter.isInitialized());
    }

}