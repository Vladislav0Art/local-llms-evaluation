package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitialized[]

Test {

    @Mock
    private ConfigurationSource cfg;

    @Test
    public void isInitialized[] Test() {
        when(cfg.getOption(anyString())).thenReturn(Optional.ofNullable(null));
        CssFormatter formatter = new CssFormatter();
        boolean result = formatter.isInitialized();
        assertEquals(false, result);
    }

}