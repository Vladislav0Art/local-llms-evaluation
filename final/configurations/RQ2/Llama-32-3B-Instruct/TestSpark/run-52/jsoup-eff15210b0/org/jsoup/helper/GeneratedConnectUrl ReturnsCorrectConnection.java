package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnectUrl ReturnsCorrectConnection {

    @Mock
    private Connection connection;

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    @Test
    public void connectUrl

    ReturnsCorrectConnection() throws IOException {
        // given
        Connection expected = new Connection(new URL("https://example.com"));
        Mockito.when(connection.newRequest()).thenReturn(expected);

        // when
        Connection actual = HttpConnection.connect(null);

        // then
        Mockito.verify(connection).newRequest();
        assertSame(expected, actual);
    }

}