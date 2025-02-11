package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePartTest {

    public String decodePart(String encoded) {
        return IDN.decode(encoded);
    }

    public String normalizeQuery(String q) {
        // implement normalization logic here
        return q; // or you can use a library to do it for you
    }

    public String normalizeRef(String r) {
        // implement normalization logic here
        return r; // or you can use a library to do it for you
    }

    @Test
    public void decodePartTest() {
        String encoded = "http%3A%2F%2Fexample.com";
        assertEquals("http://example.com", decodePart(encoded));
    }

}