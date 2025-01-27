package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection connection;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void ofNullUrlShouldThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void buildFromNullUrlShouldReturnNull() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNull(urlBuilder.build());
    }

    @Test
    public void buildWithProtocolAndDomain() {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.build());
        assertTrue(StringUtil.isSameURL(urlBuilder.build(), inputUrl));
    }

    @Test
    public void buildWithProtocolAndPort() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com:8080/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.build());
        assertTrue(StringUtil.isSameURL(urlBuilder.build(), inputUrl));
    }

    @Test
    public void buildWithProtocolAndPath() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.build());
        assertTrue(StringUtil.isSameURL(urlBuilder.build(), inputUrl));
    }

    @Test
    public void buildWithQueryAndFragment() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path?query#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.build());
        assertTrue(StringUtil.isSameURL(urlBuilder.build(), inputUrl));
    }

    @Test
    public void appendKeyValWithEmptyString() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        assertEquals("", urlBuilder.build().getQuery());
    }

    @Test
    public void appendKeyValWithNonEmptyString() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        assertEquals("value", urlBuilder.build().getQuery());
    }

    @Test
    public void appendKeyValWithQuery() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.build().getQuery());
    }

    @Test
    public void appendKeyValWithFragment() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value#fragment", urlBuilder.build().toString());
    }

    @Test
    public void appendQueryWithEmptyString() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendQuery("");
        assertEquals("", urlBuilder.build().getQuery());
    }

    @Test
    public void appendQueryWithNonEmptyString() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendQuery("value");
        assertEquals("value", urlBuilder.build().getQuery());
    }

    @Test
    public void appendFragment() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendFragment("#fragment");
        assertEquals("#fragment", urlBuilder.build().toString());
    }

}