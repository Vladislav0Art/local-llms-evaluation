package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestConnect_url {

    @Test
    public void testConnect_url() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.connect("https://www.example.com")).thenReturn(httpConnection);
        httpConnection.connect("https://www.example.com");
    }

}