package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import net.revelc.code.formatter.ConfigurationSource;

public class GeneratedInit_WhenValidOptionsAndConfiguration_ShouldDoNothing {

    private CssFormatter cssFormatter;

    @Mock
    private Map<String, String> options;

    @Mock
    private ConfigurationSource cfg;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        cssFormatter = new CssFormatter();
    }

    @Test
    public void init_WhenValidOptionsAndConfiguration_ShouldDoNothing() throws Exception {
        doNothing().when(cssFormatter).init(options, cfg);

        cssFormatter.init(options, cfg);

        assertTrue(true);
    }

}