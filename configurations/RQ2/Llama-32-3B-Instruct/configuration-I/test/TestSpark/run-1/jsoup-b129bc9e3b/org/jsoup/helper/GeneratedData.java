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
public class GeneratedData {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    public static final String URL = "https://example.com";
    public static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void data() {
        // Arrange
        Connection connection = HttpConnection.connect(URL);

        // Act
        connection.data("key", "value");
        org.junit.Assert.assertTrue(connection.request().body.contains("key=value"));
    }

}