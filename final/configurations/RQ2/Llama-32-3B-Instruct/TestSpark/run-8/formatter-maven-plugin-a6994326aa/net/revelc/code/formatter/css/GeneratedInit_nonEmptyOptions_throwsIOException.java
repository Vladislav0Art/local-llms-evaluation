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
public class GeneratedInit_nonEmptyOptions_throwsIOException {

    public void setUp() {
    }

    @Test
    public void init_nonEmptyOptions_throwsIOException() throws Exception {
        ConfigurationSource cfg = new MockConfigurationSource();
        try {
            new CssFormatter().init(new HashMap<>(), cfg);
        } catch (Exception e) {
        }
        assertTrue(true);
    }

}