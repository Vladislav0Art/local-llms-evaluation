package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.Connection.Method.GET;
import static org.jsoup.Connection.Method.POST;
import static org.jsoup.Connection.Method.PATCH;
import static org.jsoup.Connection.Method.PUT;
import static org.jsoup.Connection.Method.DELETE;
import static org.jsoup.Connection.Method.TRACK;
import static org.jsoup.Connection.Method.OTHER;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestConnect_string {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieManager cookieManager;

    @Mock
    private Proxy proxy;

    public void setupMocks() {
        Mockito.when(sslSocketFactory.getSocketFactory()).thenReturn(Mockito.anySSLSocketFactory());
        Mockito.when(cookieManager.getCookieStore()).thenReturn(Mockito.any(CookieStore.class ()));
    }

    @Test
    public void testConnect_string() throws MalformedURLException, IOException {
        Connection connection = HttpConnection.connect("http://localhost:8080");
        Mockito.verify(sslSocketFactory).getSocketFactory();
    }

}