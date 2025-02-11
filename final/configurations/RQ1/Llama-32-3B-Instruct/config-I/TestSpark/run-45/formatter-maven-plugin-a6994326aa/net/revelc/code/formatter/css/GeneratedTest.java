package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ConfigurationSource cfg;

    @Mock
    private Map<String, String> options;

    private CssFormatter formatter = new CssFormatter();

    public CssFormatter() {
        this.formatter = new CssFormatter();
    }

    @org.junit.Before
    public void setup() {
        // Arrange
        when(cfg.getOptions()).thenReturn(options);
    }

}