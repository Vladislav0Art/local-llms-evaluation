package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void UrlBuilderConstructionTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL newUrl = urlBuilder.build();
        assertEquals(url, newUrl);
    }

    @Test
    public void UrlBuilderConstructionWithNullTest() throws Exception {
        new UrlBuilder(null);
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("test");
        when(kv.value()).thenReturn("value");

        urlBuilder.appendKeyVal(kv);
        URL newUrl = urlBuilder.build();

        assertEquals("http://example.com?test=value", newUrl.toString());
    }

    @Test
    public void appendKeyValWithUnsupportedEncodingExceptionTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("тест");
        when(kv.value()).thenReturn("значение");

        urlBuilder.appendKeyVal(kv);
    }

}