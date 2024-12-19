package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.net.URL;
import java.util.Map;

public class GeneratedTest {

    @Mock
    private URL inputUrl;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(inputUrl.toString()).thenReturn("http://test.com");
    }

    @Test
    public void build_EmptyUrl_ReturnsNull() {
        org.jsoup.helper.UrlBuilder builder = new org.jsoup.helper.UrlBuilder((URL) null);
        assertEquals(null, builder.build());
    }

    @Test
    public void appendKeyVal_NoKeys_ThrowsUnsupportedEncodingException() throws UnsupportedEncodingException {
        org.jsoup.helper.UrlBuilder builder = new org.jsoup.helper.UrlBuilder(inputUrl);
        when(builder.appendKeyVal(Mockito.any(org.jsoup.helper.Connection.KeyVal.class))).thenThrow(UnsupportedEncodingException.class);
        try {
            builder.appendKeyVal(null);
        } catch (UnsupportedEncodingException e) {
            assertEquals("Unsupported encoding", e.getMessage());
        }
    }

    @Test
    public void appendKeyVal_SingleKeyVal_BuildsCorrectUrl() {
        org.jsoup.helper.UrlBuilder builder = new org.jsoup.helper.UrlBuilder(inputUrl);
        org.jsoup.helper.Connection.KeyVal kv = org.jsoup.helper.Connection.KeyVal.of("a", "b");
        when(builder.appendKeyVal(Mockito.any(org.jsoup.helper.Connection.KeyVal.class))).thenReturn(kv);
        Map<String, String> params = ((org.jsoup.helper.UrlBuilder) builder).build().getParams();
        assertEquals(1, params.size());
        assertEquals("b", params.get("a"));
    }

    @Test
    public void appendMultipleKeyVal_BuildsCorrectUrl() {
        org.jsoup.helper.UrlBuilder builder = new org.jsoup.helper.UrlBuilder(inputUrl);
        org.jsoup.helper.Connection.KeyVal kv1 = org.jsoup.helper.Connection.KeyVal.of("c", "d");
        org.jsoup.helper.Connection.KeyVal kv2 = org.jsoup.helper.Connection.KeyVal.of("e", "f");
        when(builder.appendKeyVal(Mockito.any(org.jsoup.helper.Connection.KeyVal.class))).thenReturn(kv1).thenReturn(kv2);
        Map<String, String> params = ((org.jsoup.helper.UrlBuilder) builder).build().getParams();
        assertEquals(2, params.size());
        assertEquals("d", params.get("c"));
        assertEquals("f", params.get("e"));
    }

    @Test
    public void appendKeyVal_DuplicateKeys_ThrowsUnsupportedEncodingException() throws UnsupportedEncodingException {
        org.jsoup.helper.UrlBuilder builder = new org.jsoup.helper.UrlBuilder(inputUrl);
        org.jsoup.helper.Connection.KeyVal kv1 = org.jsoup.helper.Connection.KeyVal.of("a", "b");
        org.jsoup.helper.Connection.KeyVal kv2 = org.jsoup.helper.Connection.KeyVal.of("a", "c");
        when(builder.appendKeyVal(Mockito.any(org.jsoup.helper.Connection.KeyVal.class))).thenReturn(kv1).thenThrow(UnsupportedEncodingException.class);
        try {
            ((org.jsoup.helper.UrlBuilder) builder).appendKeyVal(kv2);
        } catch (UnsupportedEncodingException e) {
            assertEquals("Duplicate key value", e.getMessage());
        }
    }

}