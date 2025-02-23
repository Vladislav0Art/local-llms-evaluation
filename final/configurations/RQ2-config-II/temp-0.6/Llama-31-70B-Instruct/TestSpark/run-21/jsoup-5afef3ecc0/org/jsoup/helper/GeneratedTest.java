package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private static final String URL_STRING = "http://example.com/";

    @Test
    public void buildWithoutQuery() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL(URL_STRING);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL builtUrl = urlBuilder.build();

        assertEquals(URL_STRING, builtUrl.toString());
        assertEquals(inputUrl.getProtocol(), builtUrl.getProtocol());
        assertEquals(inputUrl.getUserInfo(), builtUrl.getUserInfo());
        assertEquals(inputUrl.getHost(), builtUrl.getHost());
        assertEquals(inputUrl.getPort(), builtUrl.getPort());
        assertEquals(inputUrl.getPath(), builtUrl.getPath());
        assertEquals(inputUrl.getRef(), builtUrl.getRef());
        assertNull(builtUrl.getQuery());
    }

    @Test
    public void appendKeyValWithException() throws UnsupportedEncodingException {
        URL inputUrl = mock(URL.class);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");

        urlBuilder.appendKeyVal(kv);
    }

}