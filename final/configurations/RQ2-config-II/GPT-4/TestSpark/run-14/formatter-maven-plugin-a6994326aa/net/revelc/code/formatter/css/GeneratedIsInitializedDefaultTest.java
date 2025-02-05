package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedDefaultTest {

    @Test
    public void isInitializedDefaultTest() {
        CssFormatter formatter = new CssFormatter();

        assertFalse("CssFormatter should not be initialized by default", formatter.isInitialized());
    }

}