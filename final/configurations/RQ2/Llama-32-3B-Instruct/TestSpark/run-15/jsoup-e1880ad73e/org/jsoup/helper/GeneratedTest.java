package org.jsoup.helper;

import org.jsoup.Connection;
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
    public void newUrlBuilder_fromEmptyString() {
        assertTrue(UrlBuilder.fromEmptyString(null).isPresent());
        assertFalse(UrlBuilder.fromEmptyString("").isPresent());
    }

    @Test
    public void fromEmptyString_returnsEmptyUrl() {
        assertNotNull(UrlBuilder.fromEmptyString(null).get());
        assertEquals("", UrlBuilder.fromEmptyString(null).get());
    }

    @Test
    public void newUrlBuilder_fromInvalidUrl_throwsMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> UrlBuilder.fromInvalidUrl(" invalid://"));
    }

    @Test
    public void fromInvalidUrl_returnsPresent_whenProvidedCorrectly() {
        assertNotNull(UrlBuilder.fromInvalidUrl("https://example.com").get());
        assertEquals("https://example.com", UrlBuilder.fromInvalidUrl("https://example.com").get());
    }

    @Test
    public void newUrlBuilder_fromValidUrl() {
        assertDoesNotThrow(() -> UrlBuilder.fromValidUrl(new URL("https://example.com")).isPresent());
        assertNotNull(UrlBuilder.fromValidUrl(new URL("https://example.com")).get());
        assertEquals("https://example.com", UrlBuilder.fromValidUrl(new URL("https://example.com")).get());
    }

    @Test
    public void appendKeyVal_appendsKeyValue() {
        String original = "path/to/resource";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv));
        assertEquals(original + "?key=value", builder.appendKeyVal(kv).get());
    }

    @Test
    public void appendKeyVal_doesNotAppendEmptyKeyValues() {
        String original = "path/to/resource";
        Connection.KeyVal kv1 = new Connection.KeyVal("", "");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv1));
        assertEquals(original, builder.appendKeyVal(kv1).get());
    }

    @Test
    public void appendKeyVal_appendsMultipleKeyValuePairs() {
        String original = "path/to/resource";
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv1));
        assertNotNull(builder.appendKeyVal(kv2));
        assertEquals(original + "?key1=value1&key2=value2", builder.appendKeyVal(kv1).appendKeyVal(kv2).get());
    }

    @Test
    public void appendKeyVal_appendsEncodedKeyValuePairs() {
        String original = "path/to/resource";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv));
        assertEquals(original + "?key=" + URLEncoder.encode("value", DataUtil.UTF_8), builder.appendKeyVal(kv).get());
    }

    @Test
    public void build_buildsUrlWithoutQuery() {
        String original = "https://example.com";
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.build());
        assertEquals(original, builder.build());
    }

    @Test
    public void appendKeyVal_thenBuild_doesNotAppendQuery() {
        String original = "https://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv).build());
        assertEquals(original, builder.appendKeyVal(kv).build());
    }

}