package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws UnsupportedEncodingException {
        String result = UrlBuilder.decodePart("%GG");

        assertEquals("", result);
    }

}