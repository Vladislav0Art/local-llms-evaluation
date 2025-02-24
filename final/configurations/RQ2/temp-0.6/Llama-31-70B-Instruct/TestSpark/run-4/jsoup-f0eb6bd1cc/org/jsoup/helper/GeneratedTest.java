package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void buildTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com/"));
        URL url = urlBuilder.build();
        assertEquals("http://www.example.com/", url.toExternalForm());
    }

    @Test
    public void buildTest_invalidURL() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("invalid url"));
        URL url = urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com/"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL url = urlBuilder.build();
        assertEquals("http://www.example.com/?key=value", url.toExternalForm());
    }

    @Test
    public void appendKeyValTest_emptyKey() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com/"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("", "value"));
        URL url = urlBuilder.build();
        assertEquals("http://www.example.com/?=value", url.toExternalForm());
    }

    @Test
    public void appendKeyValTest_emptyValue() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com/"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", ""));
        URL url = urlBuilder.build();
        assertEquals("http://www.example.com/?key=", url.toExternalForm());
    }

}