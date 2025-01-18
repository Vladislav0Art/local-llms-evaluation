package net.revelc.code.formatter.css;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        Map<String, String> options = new HashMap<>();
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(options, null);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

}