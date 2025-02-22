package org.jsoup.helper;

import static org.jsoup.helper.UrlBuilder.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildURLWithoutQuery() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL normalizedUrl = builder.build();
        assertEquals("http://example.com/", normalizedUrl.toExternalForm());
    }

    @Test
    public void buildURLWithQuery() throws Exception {
        URL inputUrl = new URL("http://example.com?foo=bar");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL normalizedUrl = builder.build();
        assertEquals("http://example.com/?foo=bar", normalizedUrl.toExternalForm());
    }

    @Test
    public void appendKeyVal() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("foo");
        when(kv.value()).thenReturn("bar");
        builder.appendKeyVal(kv);
        URL normalizedUrl = builder.build();
        assertEquals("http://example.com/?foo=bar", normalizedUrl.toExternalForm());
    }

}