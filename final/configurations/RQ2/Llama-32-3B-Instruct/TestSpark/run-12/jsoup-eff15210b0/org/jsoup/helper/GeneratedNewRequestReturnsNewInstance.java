package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedNewRequestReturnsNewInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void newRequestReturnsNewInstance() {
        Request request = new Request();
        Connection response = HttpConnection.newRequest().request(request);
        assert response != null;
    }

}