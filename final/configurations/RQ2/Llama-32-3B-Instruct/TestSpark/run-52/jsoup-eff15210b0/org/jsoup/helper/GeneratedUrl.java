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
public class GeneratedUrl {

    @Mock
    private Connection connection;

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    @Test
    public void url() {
        // given
        URL url = new URL("https://example.com");

        // when
        Connection expected = HttpConnection.connect(url);

        // then
        assertSame(expected, connection.url(url));
    }

}