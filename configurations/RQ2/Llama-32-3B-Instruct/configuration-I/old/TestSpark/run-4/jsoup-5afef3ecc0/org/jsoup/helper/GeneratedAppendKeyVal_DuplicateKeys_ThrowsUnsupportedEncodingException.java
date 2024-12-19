package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendKeyVal_DuplicateKeys_ThrowsUnsupportedEncodingException {

    @Mock
    private URL inputUrl;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(inputUrl.toString()).thenReturn("http://test.com");
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