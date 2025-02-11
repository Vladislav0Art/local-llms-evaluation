package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitialized_methodShouldReturnTrueWhenFormatterIsInitialized {

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private Map<String, String> options;

    private CssFormatter formatter;

    @Before
    public void setup() {
        when(cfg.getOptions()).thenReturn(options);
        formatter = new CssFormatter();
    }

    @After
    public void tearDown() {
        Mockito.reset(cfg, options);
    }

    @Test
    public void isInitialized_methodShouldReturnTrueWhenFormatterIsInitialized() {
        // Arrange
        when(cfg.getOptions()).thenReturn(options);

        // Act and Assert
        boolean result = formatter.isInitialized();
        assertTrue(result);
    }

}