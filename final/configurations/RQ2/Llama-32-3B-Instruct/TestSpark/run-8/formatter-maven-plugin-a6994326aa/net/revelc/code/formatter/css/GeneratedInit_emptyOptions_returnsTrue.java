package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedInit_emptyOptions_returnsTrue {

    public void setUp() {
    }

    @Test
    public void init_emptyOptions_returnsTrue() throws Exception {
        ConfigurationSource cfg = new MockConfigurationSource();
        boolean result = new CssFormatter().init(new HashMap<>(), cfg);
        assertEquals(true, result);
    }

}