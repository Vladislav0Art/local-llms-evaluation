package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitialized[]

Test {

    @Mock
    private ConfigurationSource cfg;

    @InjectMocks
    private CssFormatter formatter;

    @Test
    public void isInitialized[] Test() {
        when(cfg.isInitialized()).thenReturn(false);

        assertFalse(formatter.isInitialized());
    }

}