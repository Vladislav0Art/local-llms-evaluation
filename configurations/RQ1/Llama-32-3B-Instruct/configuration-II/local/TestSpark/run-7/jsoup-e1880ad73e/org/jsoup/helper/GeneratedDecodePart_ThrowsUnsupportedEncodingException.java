package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedDecodePart_ThrowsUnsupportedEncodingException {

    @Test
    public void decodePart_ThrowsUnsupportedEncodingException() {
        try {
            decodePart("test");
            assert false;
        } catch (UnsupportedEncodingException e) {
        }
    }

    private static String decodePart(String encoded) {
        return URLDecoder.decode(encoded, "UTF-8");
    }

}