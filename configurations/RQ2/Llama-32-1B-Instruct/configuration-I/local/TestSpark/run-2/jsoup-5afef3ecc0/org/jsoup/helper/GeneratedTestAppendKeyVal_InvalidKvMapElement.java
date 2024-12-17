package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_InvalidKvMapElement {

    private static final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAppendKeyVal_InvalidKvMapElement() {
        urlBuilder.appendKeyVal(null);
        assertFalse(outputStream.toString().contains("https://example.com"));
    }

}