package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection.KeyVal;

public class GeneratedBuild Test {

    @Test
    public void build

    Test() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String url = builder.build().toString();
        assertEquals("http://example.com", url);
    }

}