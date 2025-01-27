package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void newUrlBuilderTest() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNotNull(builder.build());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, URISyntaxException {
        String baseUrl = "http://example.com/base";
        UrlBuilder builder = new UrlBuilder(new URI(baseUrl));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String expectedUrl = baseUrl + "?" + StringUtil.toString(kv);
        String actualUrl = (String) builder.appendKeyValue(kv).build();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValWithNumberTest() throws UnsupportedEncodingException, URISyntaxException {
        String baseUrl = "http://example.com/base";
        UrlBuilder builder = new UrlBuilder(new URI(baseUrl));
        Connection.KeyVal kv = new Connection.KeyVal("key", 123L);
        String expectedUrl = baseUrl + "?" + StringUtil.toString(kv);
        String actualUrl = (String) builder.appendKeyValue(kv).build();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValWithSpaceTest() throws UnsupportedEncodingException, URISyntaxException {
        String baseUrl = "http://example.com/base";
        UrlBuilder builder = new UrlBuilder(new URI(baseUrl));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value with space");
        String expectedUrl = baseUrl + "?" + StringUtil.toString(kv);
        String actualUrl = (String) builder.appendKeyValue(kv).build();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValueWithQuery() throws UnsupportedEncodingException, URISyntaxException {
        String baseUrl = "http://example.com/base";
        UrlBuilder builder = new UrlBuilder(new URI(baseUrl));
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        String expectedUrl = baseUrl + "?" + StringUtil.toString(kv1) + "&" + StringUtil.toString(kv2);
        String actualUrl = (String) builder.appendKeyValue(kv1).appendKeyValue(kv2).build();
        assertEquals(expectedUrl, actualUrl);
    }

}

class UrlBuilder {

    public URL build() {
        return null;
    }

    public UrlBuilder appendKeyValue(Connection.KeyVal kv) {
        // Implementation to handle key-value pair
        return this;
    }

}