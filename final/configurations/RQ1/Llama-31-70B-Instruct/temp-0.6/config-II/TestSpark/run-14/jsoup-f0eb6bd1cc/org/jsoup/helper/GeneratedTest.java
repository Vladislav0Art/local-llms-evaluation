package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = Mockito.mock(UrlBuilder.class);
    }

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com/");
        when(urlBuilder.build()).thenReturn(inputUrl);

        URL expectedUrl = new URL("https://www.google.net/");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        when(urlBuilder.appendKeyVal(kv)).thenReturn(kv.value());

        String expectedValue = URLEncoder.encode(kv.value(), StandardCharsets.UTF_8.name());
        assertEquals(expectedValue, urlBuilder.appendKeyVal(kv));
    }

}