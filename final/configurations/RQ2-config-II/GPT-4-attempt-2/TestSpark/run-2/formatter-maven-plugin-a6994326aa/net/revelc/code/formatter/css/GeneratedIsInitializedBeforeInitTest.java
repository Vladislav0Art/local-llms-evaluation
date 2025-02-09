package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedIsInitializedBeforeInitTest {

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}