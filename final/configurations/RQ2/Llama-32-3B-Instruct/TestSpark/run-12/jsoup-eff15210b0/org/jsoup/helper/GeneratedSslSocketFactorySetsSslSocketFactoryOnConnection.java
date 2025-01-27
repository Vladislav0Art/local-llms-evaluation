package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSslSocketFactorySetsSslSocketFactoryOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void sslSocketFactorySetsSslSocketFactoryOnConnection() {
        SSLSocketFactory sslSocketFactory = Mockito.mock(SSLSocketFactory.class);
        Connection connection = HttpConnection.sslSocketFactory(sslSocketFactory);
        assert connection.getSslSocketFactory() == sslSocketFactory;
    }

}