package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedIsInitialized_NotInitialized_ReturnsFalse {

    @Test
    public void isInitialized_NotInitialized_ReturnsFalse() {
        CssFormatter cssFormatter = new CssFormatter();
        assertEquals(false, cssFormatter.isInitialized());
    }

}