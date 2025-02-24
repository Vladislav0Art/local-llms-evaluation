package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestNewRequest {

    @Test
    public void testNewRequest() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.newRequest()).thenReturn(httpConnection);
        httpConnection.newRequest();
    }

}