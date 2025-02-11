package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedDecodePart_DecodesASCIIStrings {

    @Test
    public void decodePart_DecodesASCIIStrings() throws UnsupportedEncodingException {
        String encoded = "Hello%2C+World";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("Hello, World", decoded);
    }

}