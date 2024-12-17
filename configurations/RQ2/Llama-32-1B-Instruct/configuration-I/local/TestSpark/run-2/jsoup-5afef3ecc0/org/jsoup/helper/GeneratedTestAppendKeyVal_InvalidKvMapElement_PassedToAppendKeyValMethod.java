package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_InvalidKvMapElement_PassedToAppendKeyValMethod {

    private final String inputUrl = "https://example.com";
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAppendKeyVal_InvalidKvMapElement_PassedToAppendKeyValMethod() {
        String[] kv = new String[]{null};
        assertFalse(urlBuilder.appendKeyVal(kv));
    }

}