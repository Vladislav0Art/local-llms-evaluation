package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("https://www.example.com/"));
    }

    @Test
    public void buildUrl() throws URISyntaxException, UnsupportedEncodingException {
        URL url = urlBuilder.build();
        assertNotNull(url);
        assertEquals("https://www.example.com/", url.toString());
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");

        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void decodePart() throws UnsupportedEncodingException {
        String encoded = "key=value";
        assertEquals("key=value", UrlBuilder.decodePart(encoded));
    }

    @Test
    public void appendToAscii() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("key=value", false, sb);
        assertEquals("key%3Dvalue", sb.toString());
    }

}