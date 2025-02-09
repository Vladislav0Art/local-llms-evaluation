package net.revelc.code.formatter.css;

import java.io.IOException;
import java.util.*;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsInitializedBeforeInitTest {

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Assert.assertFalse(cssFormatter.isInitialized());
    }

}