package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");

        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);

        URL result = urlBuilder.build();
        assertEquals("http://google.com?key=value", result.toString());
    }

}