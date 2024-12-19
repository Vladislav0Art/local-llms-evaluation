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

public class GeneratedBuildUrlFromInvalidUrl_ThrowsMalformedURLException {

    @Test
    public void buildUrlFromInvalidUrl_ThrowsMalformedURLException() {
        try {
            new UrlBuilder(new URL("https://example.com//"));
            assert false;
        } catch (MalformedURLException e) {
        }
    }

}