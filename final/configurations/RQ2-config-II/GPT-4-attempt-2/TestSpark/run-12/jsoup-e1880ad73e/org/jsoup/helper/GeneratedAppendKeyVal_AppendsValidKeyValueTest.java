package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyVal_AppendsValidKeyValueTest {

    @Test
    public void appendKeyVal_AppendsValidKeyValueTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("Key");
        when(kv.value()).thenReturn("Value");
        builder.appendKeyVal(kv);
        assertEquals("http://example.com?Key=Value", builder.build().toString());
    }

}