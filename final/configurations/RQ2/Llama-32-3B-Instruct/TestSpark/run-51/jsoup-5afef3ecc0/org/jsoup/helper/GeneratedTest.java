package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTest {

    @Mock
    private URL url;

    @Test
    public void buildMethod_ReturnsCorrectUrl() {
        when(url.toString()).thenReturn("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://example.com", result.toString());
    }

    @Test
    public void appendKeyVal_MethodAppendsKeyValCorrectly() {
        when(url.toURI()).thenReturn(new URI("http://example.com"));
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(Connection.KeyVal.valueOf("key", "value"));
            assertFalse(true); // Should throw exception
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void appendKeyVal_MethodAppendsKeyValWithUrl() {
        when(url.toURI()).thenReturn(new URI("http://example.com/path"));
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(Connection.KeyVal.valueOf("key", "value"));
            assertFalse(true); // Should throw exception
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void appendKeyVal_MethodAppendsKeyValue() {
        when(url.toURI()).thenReturn(new URI("http://example.com"));
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(Connection.KeyVal.valueOf("key", "value"));
            assertEquals("key=value", URLDecoder.decode(url.build().toString(), UTF_8));
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void appendKeyVal_MethodAppendsKeyValueWithUrl() {
        when(url.toURI()).thenReturn(new URI("http://example.com/path"));
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(Connection.KeyVal.valueOf("key", "value"));
            assertEquals("key=value", URLDecoder.decode(url.build().toString(), UTF_8));
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void appendKeyValue

    MethodAppendsKeyValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertEquals("key=value", URLDecoder.decode(urlBuilder.appendKeyVal(Connection.KeyVal.valueOf("key", "value")).toString(), UTF_8));
    }

}