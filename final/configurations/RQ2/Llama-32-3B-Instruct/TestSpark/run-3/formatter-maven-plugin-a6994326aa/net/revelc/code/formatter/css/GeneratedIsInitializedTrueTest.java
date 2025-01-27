package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.io.IOException;

public class GeneratedIsInitializedTrueTest {

    public static CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void isInitializedTrueTest() {
        assertTrue(cssFormatter.isInitialized());
    }

}