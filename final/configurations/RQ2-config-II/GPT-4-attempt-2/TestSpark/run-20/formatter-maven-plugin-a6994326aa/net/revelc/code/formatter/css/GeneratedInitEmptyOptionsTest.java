package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import net.revelc.code.formatter.LineEnding;

public class GeneratedInitEmptyOptionsTest {

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(Collections.emptyMap(), Mockito.mock(ConfigurationSource.class));

        Assert.assertTrue(formatter.isInitialized());
    }

}