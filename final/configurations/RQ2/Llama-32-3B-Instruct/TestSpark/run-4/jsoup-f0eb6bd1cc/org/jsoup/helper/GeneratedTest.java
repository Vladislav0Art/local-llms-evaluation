package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void constructorWithNullUrlThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void buildMethodReturnsOriginalUrlWhenNoQueryParams() throws URISyntaxException {
        URL originalUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(originalUrl);
        URL result = urlBuilder.build();
        assertEquals(originalUrl, result);
    }

    @Test
    public void buildMethodAppendsQueryParamsCorrectly() throws URISyntaxException {
        URL originalUrl = new URL("http://example.com");
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(originalUrl);
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        URL result = urlBuilder.build();
        URI uri = result.getURI();
        Map<String, String> queryParams = parseQueryParams(uri.getQuery());
        assertEquals(2, queryParams.size());
        assertTrue(queryParams.containsKey("key1"));
        assertTrue(queryParams.containsKey("key2"));
    }

    @Test
    public void buildMethodHandlesNullValueForQueryParam() throws URISyntaxException {
        URL originalUrl = new URL("http://example.com");
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", null);
        UrlBuilder urlBuilder = new UrlBuilder(originalUrl);
        urlBuilder.appendKeyVal(kv1);
        URL result = urlBuilder.build();
        URI uri = result.getURI();
        Map<String, String> queryParams = parseQueryParams(uri.getQuery());
        assertEquals(1, queryParams.size());
        assertTrue(queryParams.containsKey("key1"));
    }

    @Test
    public void buildMethodHandlesEmptyValueForQueryParam() throws URISyntaxException {
        URL originalUrl = new URL("http://example.com");
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "");
        UrlBuilder urlBuilder = new UrlBuilder(originalUrl);
        urlBuilder.appendKeyVal(kv1);
        URL result = urlBuilder.build();
        URI uri = result.getURI();
        Map<String, String> queryParams = parseQueryParams(uri.getQuery());
        assertEquals(1, queryParams.size());
        assertTrue(queryParams.containsKey("key1"));
    }

    private Map<String, String> parseQueryParams(String query) {
        HashMap<String, String> params = new HashMap<>();
        if (query != null && !query.isEmpty()) {
            Pattern pattern = Pattern.compile("([^=]+)=(.*)");
            Matcher matcher = pattern.matcher(query);
            while (matcher.find()) {
                params.put(matcher.group(1), matcher.group(2));
            }
        }
        return params;
    }

    @Test
    public void appendKeyValMethodHandlesNullKeyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValMethodHandlesEmptyKeyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
    }

}