package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedIsInitializedNegativeTest {

    @Test
    public void isInitializedNegativeTest() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
    }

}