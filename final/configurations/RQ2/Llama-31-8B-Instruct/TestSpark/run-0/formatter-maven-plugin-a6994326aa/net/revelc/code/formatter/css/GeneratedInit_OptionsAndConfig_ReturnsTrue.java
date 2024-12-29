package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedInit_OptionsAndConfig_ReturnsTrue {

    @Test
    public void init_OptionsAndConfig_ReturnsTrue() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = Collections.singletonMap("option", "value");
        ConfigurationSource config = mock(ConfigurationSource.class);
        when(config.getOptions()).thenReturn(options);
        assertTrue(formatter.init(options, config));
    }
}

}