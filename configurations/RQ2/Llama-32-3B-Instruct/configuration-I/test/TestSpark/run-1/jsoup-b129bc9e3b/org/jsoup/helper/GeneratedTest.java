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
public class GeneratedTest {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private Parser parser;

    public static final String URL = "https://example.com";
    public static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void newRequest() {
        // Arrange and Act
        Connection connection = HttpConnection.connect(URL);
        org.junit.Assert.assertEquals(connection.getClass(), org.jsoup.helper.Connection.class);
    }

    @Test
    public void url() {
        // Arrange and Act
        Connection connection = HttpConnection.connect(URL);
        org.junit.Assert.assertEquals(connection.url().toString(), URL.toString());
    }

    @Test
    public void userAgent() {
        // Arrange
        Connection connection = HttpConnection.connect(URL);

        // Act
        Connection request = connection.userAgent(USER_AGENT);
        org.junit.Assert.assertEquals(request.header("User-Agent").get(0).value, USER_AGENT);
    }

    @Test
    public void proxy() {
        // Arrange
        Connection connection = HttpConnection.connect(URL);

        // Act
        Connection request = connection.proxy("localhost:8080");
        org.junit.Assert.assertEquals(request.header("Proxy-Authorization").get(0).value, "Basic dXNlcjpwYXNzd29yZC1vcGVuIEdhc2U2NC1zdGF0aWM=");
    }

    @Test
    public void timeout() {
        // Arrange and Act
        Connection connection = HttpConnection.connect(URL);
        org.junit.Assert.assertEquals(connection.timeout(100).getClass(), org.jsoup.helper.Connection.class);
    }

    @Test
    public void data() {
        // Arrange
        Connection connection = HttpConnection.connect(URL);

        // Act
        connection.data("key", "value");
        org.junit.Assert.assertTrue(connection.request().body.contains("key=value"));
    }

    @Test
    public void cookie() {
        // Arrange and Act
        Connection connection = HttpConnection.connect(URL);
        connection.cookieStore(new CookieStore());
        org.junit.Assert.assertEquals(connection.cookies().size(), 0);
    }

    @Test
    public void execute() throws IOException {
        // Arrange
        Connection connection = HttpConnection.connect(URL);

        // Act
        Document document = connection.get();
        org.junit.Assert.assertNotNull(document.toString());
    }

}