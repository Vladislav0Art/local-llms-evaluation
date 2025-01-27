package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedConnectDirectlyToUrl ReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void connectDirectlyToUrl

    ReturnsCorrectInstance() {
        Connection connection = HttpConnection.connect("https://example.com");
        assert connection != null;
    }

}