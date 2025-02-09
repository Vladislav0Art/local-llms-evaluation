package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedFalseTest {

    @Test
    public void isInitializedFalseTest() {
        CssFormatter formatter = new CssFormatter();

        Assert.assertFalse(formatter.isInitialized());
    }

}