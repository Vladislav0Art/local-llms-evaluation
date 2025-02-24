package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildWithNullInputUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNull(urlBuilder.build());
    }

    @Test
    public void buildWithValidInputUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build());
    }

    @Test
    public void buildWithMalformedInputUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("malformed url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValWithNullKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(null);
        assertNull(urlBuilder.build());
    }

    @Test
    public void appendKeyValWithValidKeyValTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "val");
        urlBuilder.appendKeyVal(keyVal);
        assertNotNull(urlBuilder.build());
    }

}