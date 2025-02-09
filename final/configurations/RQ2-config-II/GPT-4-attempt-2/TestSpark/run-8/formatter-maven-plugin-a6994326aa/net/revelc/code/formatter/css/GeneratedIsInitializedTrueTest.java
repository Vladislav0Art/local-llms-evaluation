package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedTrueTest {

    @Test
    public void isInitializedTrueTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = mock(ConfigurationSource.class);
        CssFormatter formatter = new CssFormatter();

        formatter.init(options, cfg);

        Assert.assertTrue(formatter.isInitialized());
    }

}