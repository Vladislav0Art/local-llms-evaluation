package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestInit {

    @Mock
    private InputSource cfg;

    @Mock
    private ConfigurationSource config;

    @Test
    public void testInit() {
        when(cfg.getConfiguration()).thenReturn("some config");
        when(config.getConfiguration()).thenReturn(null);
        AbstractCacheableFormatter formatter = new CssFormatter();
        verify(formatter::init).withAnyArguments().thenReturn(config);
    }

}