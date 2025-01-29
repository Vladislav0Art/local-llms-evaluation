package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testBuild_WithValidUrl() {
        String inputUrl = "https://www.example.com";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://www.example.com", result.toUriString());
    }

    @Test
    public void testBuild_WithEmptyInputUrl() {
        String inputUrl = "";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNull(result);
    }

    @Test
    public void testAppendKeyVal_WithValidKeyValue() {
        String key = "name";
        String value = "John Doe";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenReturn(value);
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_WithInvalidKeyValue() {
        String key = "name";
        String value = "";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException());
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_WithEmptyKeyValue() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_WithNoKey() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_WithNoValue() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException());
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_EmptyKeyValue() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException("UTF-8"));
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_NoValue() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException("UTF-8"));
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_SingleQuotes() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException("UTF-8"));
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_SingleQuotesWithEscapes() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException("UTF-8"));
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_WithNonUtf8Value() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException("ISO-8859-1"));
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_NoEscapes() {
        String key = "name";
        when(keyVal.getKey()).thenReturn(key);
        when(value.getValue()).thenThrow(new UnsupportedEncodingException("ISO-8859-1"));
        UrlBuilder urlBuilder = new UrlBuilder(null); // mock URL input
        urlBuilder.appendKeyVal(mock(Connection.KeyVal.class));
        assertNull(urlBuilder.build());
    }

}