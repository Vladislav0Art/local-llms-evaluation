package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals(inputUrl, result);
    }

    @Test
    public void buildUrlNullInputTest() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(kv);
        String expected = "https://example.com?key=value";
        assertEquals(expected, urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValNullKeyTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, "value");
        urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(kv));
    }

    @Test
    public void appendKeyValNullValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}