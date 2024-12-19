package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestIsInitialized {

    public String css_formatter_test() {
        return "[CssFormatter]testInit";
    }

    @Test
    public void testIsInitialized() {
        boolean actual = false;
        when(ConfigurationSource.class.getConstructor(int.class)).thenReturn((ConfigurationSource) mock(ConfigurationSource.class));
        when(ConfigurationSource.class.getConstructor(String.class, int.class)).thenReturn((ConfigurationSource) mock(ConfigurationSource.class));
        when(ConfigurationSource.class.newInstance()).thenReturn(mock(ConfigurationSource.class));
        CssFormatter formatter = new CssFormatter();
        assertTrue(formatter.isInitialized(), "expected isInitialized method not called");
    }

}