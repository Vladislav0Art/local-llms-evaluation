package org.jsoup.helper;

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

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void newUrlBuilderWithInvalidUrl() throws MalformedURLException {
        try {
            new UrlBuilder(new URL(null));
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
        }

        try {
            new UrlBuilder(new URL(""));
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
        }
    }

}