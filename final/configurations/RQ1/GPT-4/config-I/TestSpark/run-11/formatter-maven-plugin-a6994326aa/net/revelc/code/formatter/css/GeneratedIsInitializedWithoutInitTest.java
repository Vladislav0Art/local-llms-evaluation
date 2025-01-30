package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedIsInitializedWithoutInitTest {

    @Test
    public void isInitializedWithoutInitTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}