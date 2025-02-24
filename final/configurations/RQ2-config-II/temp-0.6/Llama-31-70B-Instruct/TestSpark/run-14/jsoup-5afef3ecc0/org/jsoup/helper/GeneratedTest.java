package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildTest_NullUrl_ThrowsException() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        try {
            urlBuilder.build();
            fail();
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("URL must not be null"));
        }
    }

    @Test
    public void buildTest_ValidUrl_ReturnsUrl() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals(url, result);
    }

    @Test
    public void appendKeyValTest_NullKeyVal_ThrowsException() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        try {
            urlBuilder.appendKeyVal(null);
            fail();
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("Key value must not be null"));
        }
    }

    @Test
    public void appendKeyValTest_ValidKeyVal_AppendsQueryString() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("foo", "bar");
        urlBuilder.appendKeyVal(kv);
        URL result = urlBuilder.build();
        assertEquals("https://www.example.com/?foo=bar", result.toString());
    }

}