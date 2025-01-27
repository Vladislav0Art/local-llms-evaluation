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
public class GeneratedTest {

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
    public void testConnect_URL() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("http://localhost:8080"));
        Mockito.verify(sslSocketFactory).getSocketFactory();
    }

    @Test
    public void testConnect_string() throws MalformedURLException, IOException {
        Connection connection = HttpConnection.connect("http://localhost:8080");
        Mockito.verify(sslSocketFactory).getSocketFactory();
    }

    @Test
    public void testUrl_URL() {
        Connection connection = HttpConnection.url(new URL("http://localhost:8080"));
        assertNotNull(connection);
    }

    @Test
    public void testUrl_string() {
        Connection connection = HttpConnection.url("http://localhost:8080");
        assertNotNull(connection);
    }

    @Test
    public void testProxy_Proxy() {
        Connection connection = HttpConnection.proxy(proxy);
        assertNotNull(connection);
    }

    @Test
    public void testProxy_string_host_port() {
        Connection connection = HttpConnection.proxy("localhost", 8080);
        assertNotNull(connection);
    }

    @Test
    public void testUserAgent_string() {
        Connection connection = HttpConnection.userAgent("Mozilla/5.0");
        assertNotNull(connection);
    }

    @Test
    public void testTimeout_int_millis() throws IOException {
        Connection connection = HttpConnection.timeout(1000);
        Mockito.verify(sslSocketFactory).getSocketFactory();
    }

    @Test
    public void testMaxBodySize_int_bytes() {
        Connection connection = HttpConnection.maxBodySize(1024);
        assertNotNull(connection);
    }

    @Test
    public void testFollowRedirects_boolean_follow_redirects() {
        Connection connection = HttpConnection.followRedirects(true);
        Mockito.verify(sslSocketFactory).getSocketFactory();
    }

    @Test
    public void testReferer_string_referer() {
        Connection connection = HttpConnection.referrer("http://localhost:8080");
        assertNotNull(connection);
    }

    @Test
    public void testMethod_Method_method() {
        Connection connection = HttpConnection.method(HEAD);
        assertNotNull(connection);
    }

    @Test
    public void testIgnoreHttpErrors_boolean_ignore_http_errors() throws IOException {
        Connection connection = HttpConnection.ignoreHttpErrors(true);
        Mockito.verify(sslSocketFactory).getSocketFactory();
    }

    @Test
    public void testIgnoreContentType_boolean_ignore_content_type() throws IOException {
        Connection connection = HttpConnection.ignoreContentType(true);
        Mockito.verify(sslSocketFactory).getSocketFactory();
    }

    @Test
    public void testData_map_data() {
        Map<String, String> data = new ArrayList<>();
        data.add("key", "value");
        Connection connection = HttpConnection.data(data);
        assertNotNull(connection);
    }

    @Test
    public void testData_string_key_value() {
        Connection connection = HttpConnection.data("key", "value");
        assertNotNull(connection);
    }

    @Test
    public void testData_array_data() {
        String[] data = new String[]{"key1=value1", "key2=value2"};
        Connection connection = HttpConnection.data(data);
        assertNotNull(connection);
    }

    @Test
    public void testData_list_data() {
        List<Connection.KeyVal> data = new ArrayList<>();
        data.add(Connection.KeyVal.create("key1", "value1"));
        data.add(Connection.KeyVal.create("key2", "value2"));
        Connection connection = HttpConnection.data(data);
        assertNotNull(connection);
    }

    @Test
    public void testData_string_key() {
        String key = "key";
        Connection connection = HttpConnection.data(key);
        assertNotNull(connection);
    }

    @Test
    public void testRequestBody_string_body() throws IOException {
        Connection connection = HttpConnection.requestBody("Hello World");
        Mockito.verify(sslSocketFactory).getSocketFactory();
    }

}