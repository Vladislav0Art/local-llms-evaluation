package net.revelc.code.formatter.css;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedIsInitialized_ReturnsTrue {

    @BeforeClass
    public static void setup() {
        // Initialize the formatter with a mock configuration source
        Mockito.when(CssFormatter.getInstance().getConfigurationSource()).thenReturn(new ConfigurationSource());
    }

    @Test
    public void isInitialized_ReturnsTrue() {
        assertTrue(CssFormatter.getInstance().isInitialized());
    }

}