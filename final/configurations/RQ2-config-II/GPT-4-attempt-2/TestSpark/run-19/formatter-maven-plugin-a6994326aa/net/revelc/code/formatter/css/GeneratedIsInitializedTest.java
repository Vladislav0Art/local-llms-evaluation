package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.internal.util.reflection.Whitebox;

public class GeneratedIsInitializedTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void isInitializedTest() {
        Boolean isInitialized = formatter.isInitialized();
        assertNotNull(isInitialized);
    }

}