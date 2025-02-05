package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL u = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(u);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);

        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");

        builder.appendKeyVal(kv);
        assertEquals("http://example.com/?key=value", builder.build().toString());
    }

}