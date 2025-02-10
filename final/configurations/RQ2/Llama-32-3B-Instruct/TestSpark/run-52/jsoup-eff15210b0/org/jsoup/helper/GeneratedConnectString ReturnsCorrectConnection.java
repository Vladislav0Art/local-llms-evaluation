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
public class GeneratedConnectString ReturnsCorrectConnection {

    @Mock
    private Connection connection;

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    @Test
    public void connectString

    ReturnsCorrectConnection() throws IOException {
        // given
        String url = "https://example.com";
        Connection expected = new Connection(new URL(url));
        Mockito.when(connection.newRequest()).thenReturn(expected);

        // when
        Connection actual = HttpConnection.connect(url);

        // then
        Mockito.verify(connection).newRequest();
        assertSame(expected, actual);
    }

}