package net.revelc.code.formatter.css;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedIsInitializedFalseTest {

    @Test
    public void isInitializedFalseTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
    }

}