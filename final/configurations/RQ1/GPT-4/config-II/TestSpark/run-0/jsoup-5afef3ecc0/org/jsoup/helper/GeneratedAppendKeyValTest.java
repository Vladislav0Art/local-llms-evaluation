package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("key");
        Mockito.when(kv.value()).thenReturn("value");
        urlBuilder.appendKeyVal(kv);
        URL expectedUrl = new URL("http://example.com?key=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}