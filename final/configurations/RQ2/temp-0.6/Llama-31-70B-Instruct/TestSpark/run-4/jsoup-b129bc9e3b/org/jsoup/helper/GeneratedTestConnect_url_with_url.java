package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestConnect_url_with_url {

    @Test
    public void testConnect_url_with_url() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.connect(Mockito.any())).thenReturn(httpConnection);
        httpConnection.connect(Mockito.any());
    }

}