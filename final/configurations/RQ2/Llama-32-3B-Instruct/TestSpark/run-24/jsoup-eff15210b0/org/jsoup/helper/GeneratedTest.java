package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.Method;
import org.jsoup.Request;
import org.jsoup.Response;
import org.jsoup.KeyVal;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void url() {
        Connection connection = new HttpConnection();
        assert connection.url(new URL("http://example.com")).equals(connection);
        assert connection.url("http://example.com").equals(connection);
    }

    @Test
    public void connect_url() {
        Connection connection = new HttpConnection();
        assert connection.connect("http://example.com").equals(connection);
    }

    @Test
    public void connect_url_with_proxy() {
        Connection connection = new HttpConnection();
        Proxy proxy = Mockito.mock(Proxy.class);
        assert connection.connect("http://example.com", proxy).equals(connection);
    }

    @Test
    public void url_with_method() {
        Connection connection = new HttpConnection();
        assert connection.url(new URL("http://example.com"), Method.GET).equals(connection);
        assert connection.url("http://example.com", Method.GET).equals(connection);
    }

    @Test
    public void proxy() {
        Connection connection = new HttpConnection();
        assert connection.proxy(null).equals(connection);
        assert connection.proxy(Mockito.mock(Proxy.class)).equals(connection);
    }

    @Test
    public void user_agent() {
        Connection connection = new HttpConnection();
        assert connection.userAgent(null).equals(connection);
    }

    @Test
    public void timeout() {
        Connection connection = new HttpConnection();
        assert connection.timeout(1000).equals(connection);
    }

    @Test
    public void max_body_size() {
        Connection connection = new HttpConnection();
        assert connection.maxBodySize(-1).equals(connection);
    }

    @Test
    public void follow_redirects() {
        Connection connection = new HttpConnection();
        assert connection.followRedirects(true).equals(connection);
        assert connection.followRedirects(false).equals(connection);
    }

    @Test
    public void referrer() {
        Connection connection = new HttpConnection();
        assert connection.referrer(null).equals(connection);
    }

    @Test
    public void method() {
        Connection connection = new HttpConnection();
        assert connection.method(Method.GET).equals(connection);
        assert connection.method(Mockito.mock(Method.class)).equals(connection);
    }

    @Test
    public void ignore_http_errors() {
        Connection connection = new HttpConnection();
        assert connection.ignoreHttpErrors(true).equals(connection);
        assert connection.ignoreHttpErrors(false).equals(connection);
    }

    @Test
    public void ignore_content_type() {
        Connection connection = new HttpConnection();
        assert connection.ignoreContentType(true).equals(connection);
        assert connection.ignoreContentType(false).equals(connection);
    }

    @Test
    public void data() {
        Connection connection = new HttpConnection();
        assert connection.data("key", "value").equals(connection);
        assert connection.data(Mockito.mock(Map.class)).equals(connection);
    }

    @Test
    public void ssl_socket_factory() {
        SSLSocketFactory sslSocketFactory = Mockito.mock(SSLSocketFactory.class);
        Connection connection = new HttpConnection();
        assert connection.sslSocketFactory(sslSocketFactory).equals(connection);
    }

    @Test
    public void data_file() {
        String filename = "test.html";
        InputStream inputStream = Mockito.mock(InputStream.class);
        Connection connection = new HttpConnection();
        assert connection.data("key", filename, inputStream).equals(connection);
    }

    @Test
    public void data_file_with_content_type() {
        String filename = "test.html";
        String contentType = "text/html";
        InputStream inputStream = Mockito.mock(InputStream.class);
        Connection connection = new HttpConnection();
        assert connection.data("key", filename, inputStream, contentType).equals(connection);
    }

    @Test
    public void data_map() {
        Map<String, String> data = Mockito.mock(Map.class);
        Connection connection = new HttpConnection();
        assert connection.data(data).equals(connection);
    }

    @Test
    public void data_array() {
        String[] data = {"key", "value"};
        Connection connection = new HttpConnection();
        assert connection.data(data).equals(connection);
    }

    @Test
    public void data_keyval() {
        KeyVal[] data = {new Request("key"), new Request("value")};
        Connection connection = new HttpConnection();
        assert connection.data(data).equals(connection);
    }

    @Test
    public void post_data_charset() {
        String charset = "UTF-8";
        Connection connection = new HttpConnection();
        assert connection.postDataCharset(charset).equals(connection);
    }

}