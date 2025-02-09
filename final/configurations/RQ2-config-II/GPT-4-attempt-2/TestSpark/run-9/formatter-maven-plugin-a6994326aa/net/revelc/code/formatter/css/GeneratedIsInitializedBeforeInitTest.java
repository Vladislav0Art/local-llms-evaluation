package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedBeforeInitTest {

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
    }

}