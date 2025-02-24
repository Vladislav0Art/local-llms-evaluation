package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void buildTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "val", false);
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValNullTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValIllegalStateTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "val", true);
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValEncodingTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "val", false);
        urlBuilder.appendKeyVal(kv);
    }

}