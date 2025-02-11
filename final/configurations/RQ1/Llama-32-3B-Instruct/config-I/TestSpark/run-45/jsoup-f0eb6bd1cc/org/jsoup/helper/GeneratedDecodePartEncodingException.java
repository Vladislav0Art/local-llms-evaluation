package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedDecodePartEncodingException {

    @Test
    public void decodePartEncodingException() throws URISyntaxException, UnsupportedEncodingException {
        String encoded = "äbc";
        UrlBuilder.decodePart(encoded);
    }

}