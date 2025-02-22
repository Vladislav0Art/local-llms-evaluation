package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedTestBuild {

    @Mock
    URL url;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBuild() {
        Mockito.when(url.getProtocol()).thenReturn("https");
        Mockito.when(url.getUserInfo()).thenReturn("userinfo");
        Mockito.when(url.getHost()).thenReturn("host");
        Mockito.when(url.getPort()).thenReturn(8080);
        Mockito.when(url.getPath()).thenReturn("/path");
        Mockito.when(url.getQuery()).thenReturn("query=value");
        Mockito.when(url.getRef()).thenReturn("fragment");

        UrlBuilder builder = new UrlBuilder(url);
        URL builtUrl = builder.build();

        assertEquals("https", builtUrl.getProtocol());
        assertEquals("userinfo", builtUrl.getUserInfo());
        assertEquals("host", builtUrl.getHost());
        assertEquals(8080, builtUrl.getPort());
        assertEquals("/path", builtUrl.getPath());
        assertEquals("query=value", builtUrl.getQuery());
        assertEquals("fragment", builtUrl.getRef());
    }

}