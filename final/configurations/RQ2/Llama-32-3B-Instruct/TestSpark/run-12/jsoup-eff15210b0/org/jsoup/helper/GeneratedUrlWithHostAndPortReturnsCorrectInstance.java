package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedUrlWithHostAndPortReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void urlWithHostAndPortReturnsCorrectInstance() {
        String host = "localhost";
        int port = 8080;
        URL url = new URL(host + ":" + port);
        Connection connection = HttpConnection.url(url);
        assert connection != null;
    }

}