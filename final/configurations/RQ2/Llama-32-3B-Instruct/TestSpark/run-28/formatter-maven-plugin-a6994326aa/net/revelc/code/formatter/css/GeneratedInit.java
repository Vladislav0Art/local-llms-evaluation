package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInit {

    @Mock
    private ConfigurationSource cfg;

    public CssFormatter testConfigurationSource() {
        return new CssFormatter();
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void init() throws Exception {
        final Map<String, String> options = new HashMap<>();
        when(cfg.getOptions()).thenReturn(options);

        CssFormatter formatter = testConfigurationSource();

        formatter.init();
    }

}