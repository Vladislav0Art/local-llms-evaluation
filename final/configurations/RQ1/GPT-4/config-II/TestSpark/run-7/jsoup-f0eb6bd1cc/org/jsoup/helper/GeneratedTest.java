package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
    }

    @Test
    public void urlBuilderWithoutQueryTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals("https://www.example.com", resultUrl.toString());
    }

    @Test
    public void urlBuilderWithQueryTest() throws Exception {
        URL url = new URL("https://www.example.com?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals("https://www.example.com?key=value", resultUrl.toString());
    }

    @Test
    public void urlBuilderWithNonAsciiTest() throws Exception {
        URL url = new URL("https://www.example.com/é");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals("https://www.example.com/%C3%A9", resultUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");
        urlBuilder.appendKeyVal(kv);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals("https://www.example.com?key=value", resultUrl.toString());
    }

}