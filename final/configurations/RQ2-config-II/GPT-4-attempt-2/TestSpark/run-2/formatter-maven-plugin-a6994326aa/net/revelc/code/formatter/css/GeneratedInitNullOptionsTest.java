package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedInitNullOptionsTest {

    @Test
    public void initNullOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);

        formatter.init(null, cfg);
        assertTrue(formatter.isInitialized());
    }

}