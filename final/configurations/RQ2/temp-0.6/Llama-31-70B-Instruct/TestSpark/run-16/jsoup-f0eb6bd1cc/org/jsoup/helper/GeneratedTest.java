package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildURlWithNullInputUrl() {
        try {
            new UrlBuilder(null);
            Assert.fail("Should throw exception on null input url");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void buildURlWithUrlWithoutQuery() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com", builtUrl.toString());
    }

    @Test
    public void buildURlWithUrlWithQuery() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com?a=b&c=d");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal("e", "f");
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com?a=b&c=d&e=f", builtUrl.toString());
    }

}