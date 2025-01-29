package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.URLDecoder;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    public UrlBuilder newUrlBuilder() {
        return new UrlBuilder(null);
    }

    @Test
    public void testBuildUrl() {
        String inputUrl = "https://example.com/path?query=param";
        UrlBuilder urlBuilder = newUrlBuilder();
        URL url = urlBuilder.build();

        // Use assertNotEquals for different results
        assertNotNull(url, "Invalid build method");
        assertTrue(new URI(url.toString()).getScheme().equals("https"), "Incorrect scheme");
        assertEquals("/path", new URI(url.toString()).getPath(), "Incorrect path");

        String[] parts = url.toString().split("/");
        assertEquals(4, parts.length);
    }

    @Test
    public void testAppendKeyVal() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path?query=param";
        when(inputUrl.getKey()).thenReturn("key");
        when(inputUrl.getValue()).thenReturn("value");

        String key = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key"));
        assertEquals("key", key, "Incorrect value");

        assertNotEquals("", (String) urlBuilder.appendKeyVal(null));
    }

    @Test
    public void testAppendKeyValWithoutQuery() {
        UrlBuilder urlBuilder = newUrlBuilder();
        when(inputUrl.getKey()).thenReturn("key");
        URL inputUrl = "https://example.com/path";
        when(inputUrl.getValue()).thenReturn("value");

        String key = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key"));
        assertEquals("key", key, "Incorrect value");

        assertNotEquals("", (String) urlBuilder.appendKeyVal(null));
    }

    @Test
    public void testAppendKeyValWithNoKey() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path?query=param";

        String key1 = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key1"));
        assertEquals("key1", key1, "Incorrect value");
    }

    @Test
    public void testAppendKeyValWithNoValue() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path?query=param";

        String key = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key"));
        assertEquals("key", key, "Incorrect value");
    }

    @Test
    public void testAppendKeyValWithoutKeyOrValue() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path";

        assertNotEquals("", (String) urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key")));
    }

    @Test
    public void testAppendKeyValWithMissingKeyOrValue() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path?query=param";

        assertNotEquals("", (String) urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key")));
        assertNotEquals("", (String) urlBuilder.appendKeyVal(null));
    }

    @Test
    public void testAppendKeyValWithEmptyKeyValue() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path?query=param";

        String key = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue(""));
        assertEquals("", key, "Invalid value");

        assertNotEquals("", (String) urlBuilder.appendKeyVal(null));
    }

    @Test
    public void testAppendKeyValWithEmptyKeyValueAndEmptyValue() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path?query=param";

        String key1 = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key"));
        assertEquals("key", key1, "Invalid value");
    }

    @Test
    public void testAppendKeyValWithEmptyKeyValueAndNonEmptyValue() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path?query=param";

        String key = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key"));
        assertEquals("key", key, "Invalid value");
    }

}