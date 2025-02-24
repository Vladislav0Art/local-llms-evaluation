package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestUrl {

    @Test
    public void testUrl() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.url("https://www.example.com")).thenReturn(httpConnection);
        httpConnection.url("https://www.example.com");
    }

}