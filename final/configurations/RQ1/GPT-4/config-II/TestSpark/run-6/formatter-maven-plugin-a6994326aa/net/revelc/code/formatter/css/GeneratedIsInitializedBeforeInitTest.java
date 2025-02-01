package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedBeforeInitTest {

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}