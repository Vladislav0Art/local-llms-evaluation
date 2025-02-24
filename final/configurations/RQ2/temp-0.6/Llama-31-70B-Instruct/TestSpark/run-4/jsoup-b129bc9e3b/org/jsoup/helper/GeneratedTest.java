package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testConnect_url() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.connect("https://www.example.com")).thenReturn(httpConnection);
        httpConnection.connect("https://www.example.com");
    }

    @Test
    public void testConnect_url_with_url() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.connect(Mockito.any())).thenReturn(httpConnection);
        httpConnection.connect(Mockito.any());
    }

    @Test
    public void testNewRequest() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.newRequest()).thenReturn(httpConnection);
        httpConnection.newRequest();
    }

    @Test
    public void testUrl() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.url("https://www.example.com")).thenReturn(httpConnection);
        httpConnection.url("https://www.example.com");
    }

    @Test
    public void testProxy() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.proxy(Mockito.any())).thenReturn(httpConnection);
        httpConnection.proxy(Mockito.any());
    }

    @Test
    public void testUserAgent() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.userAgent("User-Agent")).thenReturn(httpConnection);
        httpConnection.userAgent("User-Agent");
    }

}