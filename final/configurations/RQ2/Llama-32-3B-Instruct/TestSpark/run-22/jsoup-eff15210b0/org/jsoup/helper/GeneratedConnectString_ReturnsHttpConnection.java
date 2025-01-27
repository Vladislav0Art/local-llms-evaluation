package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnectString_ReturnsHttpConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieStore cookieStore;

    @Mock
    private Proxy proxy;

    @Before
    public void setup() {
        HttpConnection.connect = Mockito.mock(HttpConnection.connect);
        HttpConnection.connect = Mockito.when(HttpConnection.connect(Mockito.any(URL.class))).thenReturn(Mockito.any(Connection.class));
    }

    @Test
    public void connectString_ReturnsHttpConnection() throws MalformedURLException {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        Mockito.verify(connection, Mockito.times(1)).url(url);
    }

}