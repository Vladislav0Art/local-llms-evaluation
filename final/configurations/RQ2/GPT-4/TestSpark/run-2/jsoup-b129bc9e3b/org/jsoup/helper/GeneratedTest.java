package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void connectStringUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

    @Test
    public void urlWithStringTest() {
        HttpConnection connection = new HttpConnection();
        Connection output = connection.url("http://example.com");
        assertNotNull(output);
    }

    @Test
    public void urlWithUrlTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        Connection output = connection.url(new URL("http://example.com"));
        assertNotNull(output);
    }

    @Test
    public void proxyWithStringAndPortTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.proxy("localhost", 8080);
        assertNotNull(output);
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.userAgent("mozilla");
        assertNotNull(output);
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.timeout(3000);
        assertNotNull(output);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.maxBodySize(1024);
        assertNotNull(output);
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.followRedirects(true);
        assertNotNull(output);
    }

    @Test
    public void referrerTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.referrer("http://google.com");
        assertNotNull(output);
    }

    @Test
    public void methodTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.method(Connection.Method.GET);
        assertNotNull(output);
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.ignoreHttpErrors(true);
        assertNotNull(output);
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.ignoreContentType(true);
        assertNotNull(output);
    }

    @Test
    public void dataWithKeyAndValueTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.data("key", "value");
        assertNotNull(output);
    }

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection httpConnection = new HttpConnection();
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Connection output = httpConnection.sslSocketFactory(sslSocketFactory);
        assertNotNull(output);
    }

    @Test
    public void dataWithKeyValsTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.data("key1", "value1", "key2", "value2");
        assertNotNull(output);
    }

    @Test
    public void requestBodyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.requestBody("requestBody");
        assertNotNull(output);
    }

    @Test
    public void headerTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.header("name", "value");
        assertNotNull(output);
    }

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("name", "value");
        Connection output = httpConnection.headers(headers);
        assertNotNull(output);
    }

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection output = httpConnection.cookie("name", "value");
        assertNotNull(output);
    }

    @Test
    public void cookiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("name", "value");
        Connection output = httpConnection.cookies(cookies);
        assertNotNull(output);
    }

    @Test
    public void cookieStoreTest() {
        HttpConnection httpConnection = new HttpConnection();
        CookieStore cookieStore = new HttpConnection().cookieStore();
        Connection output = httpConnection.cookieStore(cookieStore);
        assertNotNull(output);
    }

    @Test
    public void parserTest() {
        HttpConnection httpConnection = new HttpConnection();
        Parser parser = Parser.htmlParser();
        Connection output = httpConnection.parser(parser);
        assertNotNull(output);
    }

}