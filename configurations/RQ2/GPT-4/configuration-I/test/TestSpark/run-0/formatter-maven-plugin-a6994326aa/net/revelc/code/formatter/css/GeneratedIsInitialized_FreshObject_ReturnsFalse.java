package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedIsInitialized_FreshObject_ReturnsFalse {

    @Test
    public void isInitialized_FreshObject_ReturnsFalse() {
        CssFormatter cssFormatter = new CssFormatter();

        assertEquals(false, cssFormatter.isInitialized());
    }

}