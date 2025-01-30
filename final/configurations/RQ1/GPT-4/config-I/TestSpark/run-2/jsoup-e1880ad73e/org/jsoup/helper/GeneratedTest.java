package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL u = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("value", builder.u.getQuery());
    }

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

    @Test
    public void appendKeyValNonNullQueryTest() throws Exception {
        URL u = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(u);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key1");
        when(kv.value()).thenReturn("value1");
        builder.appendKeyVal(kv);
        assertEquals("query=value&key1=value1", builder.q.toString());
    }

    @Test
    public void buildWithoutQueryOrRefTest() throws Exception {
        URL u = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com", builder.build().toString());
    }

    @Test
    public void buildWithQueryAndWithoutRefTest() throws Exception {
        URL u = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com?query=value", builder.build().toString());
    }

    @Test
    public void buildWithQueryAndRefTest() throws Exception {
        URL u = new URL("http://example.com?query=value#ref");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com?query=value#ref", builder.build().toString());
    }

}