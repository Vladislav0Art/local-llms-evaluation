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
public class GeneratedCookie {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    public static final String URL = "https://example.com";
    public static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void cookie() {
        // Arrange and Act
        Connection connection = HttpConnection.connect(URL);
        connection.cookieStore(new CookieStore());
        org.junit.Assert.assertEquals(connection.cookies().size(), 0);
    }

}