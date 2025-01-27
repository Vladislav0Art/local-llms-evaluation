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
public class GeneratedNewRequest_ReturnsNewInstance {

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
    public void newRequest_ReturnsNewInstance() {
        Connection request1 = HttpConnection.newRequest();
        Connection request2 = HttpConnection.newRequest();
        Mockito.verify(request1, Mockito.times(1)).method(Mockito.any(Method.class));
        Mockito.verify(request2, Mockito.times(0)).method(Mockito.any(Method.class));
    }

}