package org.jsoup.helper;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;

public class GeneratedAppendKeyVal_AddsKeyAndValueToUrl {

    @Test
    public void appendKeyVal_AddsKeyAndValueToUrl() throws IOException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String expectedUrl = "http://example.com?key=value";
        when(urlBuilder.inputUrl()).thenReturn(new URL("http://example.com"));
        String actualUrl = urlBuilder.appendKeyVal(kv).toString();
        assertEquals(expectedUrl, actualUrl);
    }

}