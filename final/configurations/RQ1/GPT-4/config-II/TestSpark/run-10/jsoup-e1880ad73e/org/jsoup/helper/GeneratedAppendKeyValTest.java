package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("k1");
        when(kv.value()).thenReturn("v1");

        urlBuilder.appendKeyVal(kv);

        URL actual = urlBuilder.build();
        URL expected = new URL("http://www.google.com?k1=v1");
        assertEquals(expected, actual);
    }

}