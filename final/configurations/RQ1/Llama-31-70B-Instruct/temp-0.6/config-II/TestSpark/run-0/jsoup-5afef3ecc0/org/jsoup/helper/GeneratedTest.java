package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void buildUrlWithNullQuery() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals("https://www.example.com", builtUrl.toString());
    }

    @Test
    public void buildUrlWithQuery() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com?q=jsoup");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals("https://www.example.com?q=jsoup&key=value", builtUrl.toString());
    }

    @Test
    public void buildUrlWithRef() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals("https://www.example.com?key=value#ref", builtUrl.toString());
    }

}