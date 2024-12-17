package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_UnsupportedEncodingException {

    private static final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Test
    public void testAppendKeyVal_UnsupportedEncodingException() throws UnsupportedEncodingException {
        urlBuilder.appendKeyVal(new org.jsoup.helper.KeyValueMap());
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

}