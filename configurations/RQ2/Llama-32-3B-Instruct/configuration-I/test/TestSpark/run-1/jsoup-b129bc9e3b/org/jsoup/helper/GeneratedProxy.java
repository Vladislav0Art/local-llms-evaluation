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
public class GeneratedProxy {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    public static final String URL = "https://example.com";
    public static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void proxy() {
        // Arrange
        Connection connection = HttpConnection.connect(URL);

        // Act
        Connection request = connection.proxy("localhost:8080");
        org.junit.Assert.assertEquals(request.header("Proxy-Authorization").get(0).value, "Basic dXNlcjpwYXNzd29yZC1vcGVuIEdhc2U2NC1zdGF0aWM=");
    }

}