package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class GeneratedUserAgent_MocksUserAgent_ReturnsHttpConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieManager cookieManager;

    @Test
    public void userAgent_MocksUserAgent_ReturnsHttpConnection() {
        String userAgent = Mockito.mock(String.class);
        Connection connection = new HttpConnection().userAgent(userAgent);
        assert connection != null;
    }

}