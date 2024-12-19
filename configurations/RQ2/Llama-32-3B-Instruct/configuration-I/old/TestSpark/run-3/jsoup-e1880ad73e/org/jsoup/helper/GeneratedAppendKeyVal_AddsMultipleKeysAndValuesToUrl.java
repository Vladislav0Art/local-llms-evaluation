package org.jsoup.helper;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;

public class GeneratedAppendKeyVal_AddsMultipleKeysAndValuesToUrl {

    @Test
    public void appendKeyVal_AddsMultipleKeysAndValuesToUrl() throws IOException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        String expectedUrl = "http://example.com?key1=value1&key2=value2";
        when(urlBuilder.inputUrl()).thenReturn(new URL("http://example.com"));
        String actualUrl = urlBuilder.appendKeyVal(kv1).appendKeyVal(kv2).toString();
        assertEquals(expectedUrl, actualUrl);
    }

}