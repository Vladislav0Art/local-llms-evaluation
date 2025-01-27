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
public class GeneratedIsInitialized {

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
    public void isInitialized() {
        CssFormatter formatter = testConfigurationSource();

        assertTrue(formatter.isInitialized());
    }

}