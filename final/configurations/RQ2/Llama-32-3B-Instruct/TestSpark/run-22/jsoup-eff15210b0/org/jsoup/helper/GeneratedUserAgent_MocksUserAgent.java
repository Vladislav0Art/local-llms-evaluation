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
public class GeneratedUserAgent_MocksUserAgent {

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
    public void userAgent_MocksUserAgent() {
        String userAgent = "Mozilla/5.0";
        HttpConnection.userAgent(userAgent);
        Mockito.verify(HttpConnection.userAgent, Mockito.any());
    }

}