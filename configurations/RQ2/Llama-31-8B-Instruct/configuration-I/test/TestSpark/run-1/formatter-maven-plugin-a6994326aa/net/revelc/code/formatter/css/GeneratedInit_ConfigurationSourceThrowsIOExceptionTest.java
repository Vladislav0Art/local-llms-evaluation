package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.revelc.code.formatter.css.ConfigurationSource;
import net.revelc.code.formatter.css.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit_ConfigurationSourceThrowsIOExceptionTest {

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void init_ConfigurationSourceThrowsIOExceptionTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        when(cfg.get(anyString())).thenThrow(new IOException());
        try {
            formatter.init(options, cfg);
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            // expected
        }
    }

}