package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedUrlReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void urlReturnsCorrectInstance() {
        URL url = new URL("https://example.com");
        Connection connection = HttpConnection.url(url);
        assert connection != null;
    }

}