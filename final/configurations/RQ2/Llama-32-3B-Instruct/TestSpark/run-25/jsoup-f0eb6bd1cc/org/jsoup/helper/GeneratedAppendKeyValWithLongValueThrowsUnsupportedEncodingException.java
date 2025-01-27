package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValWithLongValueThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyValWithLongValueThrowsUnsupportedEncodingException() {
        String key = "test";
        Long value = 123L;
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(new URL("http://example.com")).appendKeyVal(Connection.KeyVal.of(key, value)));
    }

}