package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com/file.html?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://www.example.com/file.html?key=value", outputUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com/file.html?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        URL outputUrl = urlBuilder.build();
        assertEquals("http://www.example.com/file.html?key=value&key1=value1", outputUrl.toString());
    }

}