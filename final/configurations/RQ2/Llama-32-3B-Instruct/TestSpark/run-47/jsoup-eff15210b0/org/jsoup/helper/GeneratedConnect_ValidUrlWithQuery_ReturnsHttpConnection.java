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

public class GeneratedConnect_ValidUrlWithQuery_ReturnsHttpConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieManager cookieManager;

    @Test
    public void connect_ValidUrlWithQuery_ReturnsHttpConnection() throws MalformedURLException, IOException {
        URL url = new URL("http://example.com/path?a=1&b=2");
        Connection connection = new HttpConnection().url(url);
        assert connection != null;
    }

}