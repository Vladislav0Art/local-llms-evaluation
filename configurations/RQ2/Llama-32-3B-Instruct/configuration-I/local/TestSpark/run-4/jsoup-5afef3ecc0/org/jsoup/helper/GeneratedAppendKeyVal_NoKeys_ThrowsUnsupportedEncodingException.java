package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendKeyVal_NoKeys_ThrowsUnsupportedEncodingException {

    @Mock
    private URL inputUrl;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(inputUrl.toString()).thenReturn("http://test.com");
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

}