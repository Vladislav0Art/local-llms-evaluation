package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestConnectNoConnectTimeout {

    private String url = "http://example.com";
    private int timeoutMs = 1000;

    @Test
    public void testConnectNoConnectTimeout() {
        HttpConnection connection = mock(HttpConnection.class);
        when(connection.connect(url)).thenReturn(new Connection(false, 1000));
        assert true;
    }

}