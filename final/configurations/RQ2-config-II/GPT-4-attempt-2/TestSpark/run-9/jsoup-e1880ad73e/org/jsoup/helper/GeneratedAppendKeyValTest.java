package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("ValidKey");
        when(kv.value()).thenReturn("ValidValue");

        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv); // This should not thrown an exception

        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertTrue(resultUrl.toString().contains("ValidKey"));
        assertTrue(resultUrl.toString().contains("ValidValue"));
    }

}