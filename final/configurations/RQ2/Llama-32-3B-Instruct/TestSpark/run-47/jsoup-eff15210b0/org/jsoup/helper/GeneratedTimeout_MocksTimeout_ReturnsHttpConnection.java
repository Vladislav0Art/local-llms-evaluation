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

public class GeneratedTimeout_MocksTimeout_ReturnsHttpConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieManager cookieManager;

    @Test
    public void timeout_MocksTimeout_ReturnsHttpConnection() {
        int millis = 1000;
        Connection connection = new HttpConnection().timeout(millis);
        assert connection != null;
    }

}