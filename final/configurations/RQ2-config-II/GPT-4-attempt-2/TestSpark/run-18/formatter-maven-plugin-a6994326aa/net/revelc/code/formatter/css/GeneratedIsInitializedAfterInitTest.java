package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedAfterInitTest {

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource source = Mockito.mock(ConfigurationSource.class);
        Map<String, String> options = new HashMap<>();
        formatter.init(options, source);
        Assert.assertTrue(formatter.isInitialized());
    }

}