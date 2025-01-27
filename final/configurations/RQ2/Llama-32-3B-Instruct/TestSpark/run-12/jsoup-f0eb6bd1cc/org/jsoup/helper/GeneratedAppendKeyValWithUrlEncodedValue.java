package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.jsoup.util.DataUtil;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedAppendKeyValWithUrlEncodedValue {

    @Test
    public void appendKeyValWithUrlEncodedValue() throws UnsupportedEncodingException {
        // Given
        Connection.KeyVal kv = new KeyVal("key", "http://example.com");

        // When
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);

        // Then
        assertEquals("key=http%3A%2F%2Fexample.com", StringUtil.encode(builder.build().toString()));
    }

}