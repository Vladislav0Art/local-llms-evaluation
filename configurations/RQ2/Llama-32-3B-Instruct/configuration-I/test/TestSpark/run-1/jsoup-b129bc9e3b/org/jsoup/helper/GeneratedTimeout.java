package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTimeout {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    public static final String URL = "https://example.com";
    public static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void timeout() {
        // Arrange and Act
        Connection connection = HttpConnection.connect(URL);
        org.junit.Assert.assertEquals(connection.timeout(100).getClass(), org.jsoup.helper.Connection.class);
    }

}