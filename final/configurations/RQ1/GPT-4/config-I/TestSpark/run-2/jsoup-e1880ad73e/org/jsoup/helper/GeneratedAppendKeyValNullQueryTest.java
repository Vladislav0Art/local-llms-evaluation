package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValNullQueryTest {

    @Test
    public void appendKeyValNullQueryTest() throws Exception {
        URL u = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(u);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key1");
        when(kv.value()).thenReturn("value1");
        builder.appendKeyVal(kv);
        assertEquals("key1=value1", builder.q.toString());
    }

}