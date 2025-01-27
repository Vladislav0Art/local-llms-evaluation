package org.jsoup.helper;

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
import java.util.Map;

import org.jsoup.Connection.KeyVal;

public class GeneratedTest {

    @Test
    public void newUrlBuilderIsConstructedWithNull() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNull(urlBuilder.inputUrl());
    }

    @Test
    public void buildUrl() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL expectedUrl = new URL(inputUrl.getProtocol(), inputUrl.getHost(), 80, inputUrl.getPath(), null);
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void appendKeyValWithNullValue() {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder urlBuilder = new UrlBuilder(null);

        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void appendKeyValWithEmptyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(null);

        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void appendKeyValWithNonEmptyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(null);

        try {
            urlBuilder.appendKeyVal(kv);
            assert true : false;
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void appendQueryParams() throws UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        try {
            urlBuilder.appendKeyVal(kv);
            assertEquals(new URI(inputUrl.getScheme(), inputUrl.getHost(), 80, inputUrl.getPath() + "?" + kv.getKey() + "=" + URLEncoder.encode(kv.getValue(), DataUtil.UTF_8), null).toURL(), urlBuilder.build());
            fail("Expected URIException");
        } catch (URISyntaxException e) {
        }
    }

    @Test
    public void appendQueryParamsWithEmptyValue() throws UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        try {
            urlBuilder.appendKeyVal(kv);
            assertEquals(new URI(inputUrl.getScheme(), inputUrl.getHost(), 80, inputUrl.getPath() + "?key=" + URLEncoder.encode("", DataUtil.UTF_8), null).toURL(), urlBuilder.build());
            fail("Expected URIException");
        } catch (URISyntaxException e) {
        }
    }

    @Test
    public void appendQueryParamsWithNonEmptyValue() throws UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        try {
            urlBuilder.appendKeyVal(kv);
            assertEquals(new URI(inputUrl.getScheme(), inputUrl.getHost(), 80, inputUrl.getPath() + "?key=value", null).toURL(), urlBuilder.build());
            assert true : false;
        } catch (URISyntaxException e) {
        }
    }

}