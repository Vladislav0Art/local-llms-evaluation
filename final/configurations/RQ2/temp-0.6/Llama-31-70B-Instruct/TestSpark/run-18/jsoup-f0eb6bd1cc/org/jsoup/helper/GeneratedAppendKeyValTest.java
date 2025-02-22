package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyValTest {

    // Test for build() method

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
        assertEquals("key1=value1&key2=value2", urlBuilder.q.toString());
    }

}