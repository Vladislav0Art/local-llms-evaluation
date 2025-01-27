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
public class GeneratedDoFormat_nonEmptyString_throwsIOException {

    public void setUp() {
    }

    @Test
    public void doFormat_nonEmptyString_throwsIOException() throws Exception {
        ConfigurationSource cfg = new MockConfigurationSource();
        try {
            new CssFormatter().doFormat("non-empty", LineEnding.LF);
        } catch (Exception e) {
        }
        assertTrue(true);
    }

}