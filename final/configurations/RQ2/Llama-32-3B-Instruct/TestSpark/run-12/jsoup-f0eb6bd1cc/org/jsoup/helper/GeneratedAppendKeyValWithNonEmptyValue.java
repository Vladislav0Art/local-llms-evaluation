package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.jsoup.util.DataUtil;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedAppendKeyValWithNonEmptyValue {

    @Test
    public void appendKeyValWithNonEmptyValue() throws UnsupportedEncodingException {
        // Given
        Connection.KeyVal kv = new KeyVal("key", "value");

        // When
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);

        // Then
        assertEquals("key=value", StringUtil.encode(builder.build().toString()));
    }

}