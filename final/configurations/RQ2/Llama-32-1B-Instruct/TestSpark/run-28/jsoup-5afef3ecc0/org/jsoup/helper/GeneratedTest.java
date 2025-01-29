package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void testBuildUrl() {
        String input = "https://example.com/path?param1=value1&param2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        URL result = urlBuilder.build();
        assertEquals("https://example.com/path", result.getProtocol());
        assertEquals("path", result.getPath());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String input = "key1=value1&key2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key3", "value3"));
    }

    @Test
    public void testAppendKeyVal_InvalidInput() {
        try {
            String input = "invalid_input";
            URLBuilder urlBuilder = new UrlBuilder(new URI(input));
            assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(null));
        } catch (Exception e) {
            // Expected exception
        }
    }

    @Test
    public void testAppendKeyVal_InvalidKey() throws UnsupportedEncodingException {
        String input = "key1=value1&invalid_key=invalid_value";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        urlBuilder.appendKeyVal(new Connection.KeyVal("valid_key", "value"));
    }

    @Test
    public void testAppendKeyVal_InvalidValue() throws UnsupportedEncodingException {
        String input = "key1=value1&param2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "invalid_value"));
    }

    @Test
    public void testAppendKeyVal_InvalidProtocol() throws UnsupportedEncodingException {
        String input = "https://example.com/path?param1=value1&param2=value2";
        assertThrows(URISyntaxException.class, () -> new UrlBuilder(new URI(input).getScheme()).appendKeyVal(new Connection.KeyVal("key1", "value1")));
    }

    @Test
    public void testAppendKeyVal_InvalidKeyVal() throws UnsupportedEncodingException {
        String input = "key1=value1&key3=value3";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void testAppendKeyVal_InvalidKeyValue() throws UnsupportedEncodingException {
        String input = "key1=value1&param2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(0L, null));
    }

    @Test
    public void testAppendKeyVal_InvalidParameter() throws UnsupportedEncodingException {
        String input = "key1=value1&param2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null, "value"));
    }

    @Test
    public void testAppendKeyVal_DuplicateKeys() throws UnsupportedEncodingException {
        String input = "key1=value1&key2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
    }

}