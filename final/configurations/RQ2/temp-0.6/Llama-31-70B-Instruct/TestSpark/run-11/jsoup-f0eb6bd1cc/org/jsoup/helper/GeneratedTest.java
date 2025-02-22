package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL url = new URL("http://www.example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com/test", builtUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://www.example.com/test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(new Connection.KeyVal("test", "value"));
        assertNotNull(urlBuilder.q);
        assertTrue(urlBuilder.q.toString().contains("test=value"));
    }

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("test value", true, sb);
        assertEquals("test+value", sb.toString());
    }

}