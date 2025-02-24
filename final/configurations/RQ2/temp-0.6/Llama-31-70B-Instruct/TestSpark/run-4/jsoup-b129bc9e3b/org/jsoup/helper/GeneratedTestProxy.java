package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestProxy {

    @Test
    public void testProxy() {
        HttpConnection httpConnection = Mockito.mock(HttpConnection.class);
        Mockito.when(httpConnection.proxy(Mockito.any())).thenReturn(httpConnection);
        httpConnection.proxy(Mockito.any());
    }

}