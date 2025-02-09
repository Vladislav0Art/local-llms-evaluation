package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedAfterInitTest {

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(null, null);
        Assert.assertTrue(formatter.isInitialized());
    }

}