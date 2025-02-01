package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValEmptyQueryTest {

    @Test
    public void appendKeyValEmptyQueryTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("abc");
        when(kv.value()).thenReturn("def");
        urlBuilder.appendKeyVal(kv);
        assertEquals(urlBuilder.q.toString(), "abc=def");
    }

}