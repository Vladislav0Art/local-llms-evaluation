package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendMultipleKeyVal_BuildsCorrectUrl {

    @Mock
    private URL inputUrl;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(inputUrl.toString()).thenReturn("http://test.com");
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

}