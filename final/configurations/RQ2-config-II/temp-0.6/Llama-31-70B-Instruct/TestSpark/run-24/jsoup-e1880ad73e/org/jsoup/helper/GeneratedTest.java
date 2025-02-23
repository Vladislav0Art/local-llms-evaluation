package org.jsoup.helper;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(mock(URL.class));
    }

    @After
    public void tearDown() {
        urlBuilder = null;
    }

    @Test
    public void buildTest() {
        URL expectedUrl = mock(URL.class);
        when(expectedUrl.getProtocol()).thenReturn("https");
        when(expectedUrl.getUserInfo()).thenReturn("userInfo");
        when(expectedUrl.getHost()).thenReturn("example.com");
        when(expectedUrl.getPort()).thenReturn(80);
        when(expectedUrl.getPath()).thenReturn("/path");
        when(expectedUrl.getQuery()).thenReturn("query");
        when(expectedUrl.getRef()).thenReturn("ref");

        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl.getProtocol(), actualUrl.getProtocol());
        assertEquals(expectedUrl.getUserInfo(), actualUrl.getUserInfo());
        assertEquals(expectedUrl.getHost(), actualUrl.getHost());
        assertEquals(expectedUrl.getPort(), actualUrl.getPort());
        assertEquals(expectedUrl.getPath(), actualUrl.getPath());
        assertEquals(expectedUrl.getQuery(), actualUrl.getQuery());
        assertEquals(expectedUrl.getRef(), actualUrl.getRef());
    }

}