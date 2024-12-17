package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendKeyVal_SingleKeyVal_BuildsCorrectUrl {

    @Mock
    private URL inputUrl;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(inputUrl.toString()).thenReturn("http://test.com");
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

}