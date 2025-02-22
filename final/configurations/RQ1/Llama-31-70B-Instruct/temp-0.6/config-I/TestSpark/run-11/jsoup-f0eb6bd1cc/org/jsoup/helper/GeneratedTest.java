package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;

import java.net.URL;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://www.example.com/test", outputUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        URL outputUrl = urlBuilder.build();
        assertEquals("https://www.example.com?key1=value1&key2=value2", outputUrl.toString());
    }

}