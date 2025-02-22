package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = Mockito.mock(UrlBuilder.class);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        when(urlBuilder.appendKeyVal(kv)).thenReturn(kv.value());

        String expectedValue = URLEncoder.encode(kv.value(), StandardCharsets.UTF_8.name());
        assertEquals(expectedValue, urlBuilder.appendKeyVal(kv));
    }

}