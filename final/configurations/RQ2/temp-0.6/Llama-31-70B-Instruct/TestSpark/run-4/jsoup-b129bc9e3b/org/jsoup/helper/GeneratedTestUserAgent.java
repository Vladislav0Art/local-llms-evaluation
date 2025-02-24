package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestUserAgent {

    @Test
    public void testUserAgent() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.userAgent("User-Agent")).thenReturn(httpConnection);
        httpConnection.userAgent("User-Agent");
    }

}