package net.revelc.code.formatter.css;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedIsInitialized_NotInited_ReturnFalse {

    private CssFormatter formatter = new CssFormatter();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isInitialized_NotInited_ReturnFalse() {
    }

    private Map<String, String> options() {
        return new HashMap<>();
    }

    private ConfigurationSource cfg() {
        return Mockito.mock(ConfigurationSource.class);
    }

    private String configuration() {
        return "";
    }

}