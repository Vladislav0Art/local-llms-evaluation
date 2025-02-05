package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectWithStringUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectWithStringUrlInvalidUrlTest() {
        HttpConnection.connect("invalidurl");
    }

    @Test
    public void connectWithUrlTest() throws Exception {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.newRequest());
    }

    @Test
    public void urlWithStringTest() {
        Connection connection = new HttpConnection().url("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void urlWithUrlTest() throws Exception {
        URL url = new URL("http://example.com");
        Connection connection = new HttpConnection().url(url);
        assertNotNull(connection);
    }

    @Test
    public void proxyWithProxyTest() {
        Proxy proxy = Proxy.NO_PROXY;
        Connection connection = new HttpConnection().proxy(proxy);
        assertNotNull(connection);
    }

    @Test
    public void proxyWithHostAndPortTest() {
        Connection connection = new HttpConnection().proxy("localhost", 8080);
        assertNotNull(connection);
    }

    @Test
    public void userAgentTest() {
        Connection connection = new HttpConnection().userAgent("Mozilla/5.0");
        assertNotNull(connection);
    }

    @Test
    public void timeoutTest() {
        Connection connection = new HttpConnection().timeout(5000);
        assertNotNull(connection);
    }

    @Test
    public void maxBodySizeTest() {
        Connection connection = new HttpConnection().maxBodySize(1024);
        assertNotNull(connection);
    }

    @Test
    public void followRedirectsTest() {
        Connection connection = new HttpConnection().followRedirects(true);
        assertNotNull(connection);
    }

    @Test
    public void referrerTest() {
        Connection connection = new HttpConnection().referrer("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void methodTest() {
        Connection connection = new HttpConnection().method(Connection.Method.GET);
        assertNotNull(connection);
    }

    @Test
    public void ignoreHttpErrorsTest() {
        Connection connection = new HttpConnection().ignoreHttpErrors(true);
        assertNotNull(connection);
    }

    @Test
    public void ignoreContentTypeTest() {
        Connection connection = new HttpConnection().ignoreContentType(true);
        assertNotNull(connection);
    }

    @Test
    public void dataWithStringKeyAndValueTest() {
        Connection connection = new HttpConnection().data("key", "value");
        assertNotNull(connection);
    }

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Connection connection = new HttpConnection().sslSocketFactory(sslSocketFactory);
        assertNotNull(connection);
    }

    @Test
    public void dataWithKeyAndStreamTest() {
        InputStream inputStream = new BufferedInputStream(System.in);
        Connection connection = new HttpConnection().data("key", "filename", inputStream);
        assertNotNull(connection);
    }

    @Test
    public void dataWithKeyStreamAndContentTypeTest() {
        InputStream inputStream = new BufferedInputStream(System.in);
        Connection connection = new HttpConnection().data("key", "filename", inputStream, "application/json");
        assertNotNull(connection);
    }

    @Test
    public void dataWithMapTest() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection connection = new HttpConnection().data(data);
        assertNotNull(connection);
    }

    @Test
    public void dataWithKeyValsTest() {
        Connection connection = new HttpConnection().data("key1", "value1", "key2", "value2");
        assertNotNull(connection);
    }

    @Test
    public void requestBodyTest() {
        Connection connection = new HttpConnection().requestBody("request body");
        assertNotNull(connection);
    }

    @Test
    public void headerTest() {
        Connection connection = new HttpConnection().header("Name", "Value");
        assertNotNull(connection);
    }

    @Test
    public void headersTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Name", "Value");
        Connection connection = new HttpConnection().headers(headers);
        assertNotNull(connection);
    }

    @Test
    public void cookieTest() {
        Connection connection = new HttpConnection().cookie("Name", "Value");
        assertNotNull(connection);
    }

    @Test
    public void cookiesTest() {
        Map<String, String> cookies = new HashMap<>();
        cookies.put("Name", "Value");
        Connection connection = new HttpConnection().cookies(cookies);
        assertNotNull(connection);
    }

    @Test
    public void cookieStoreTest() {
        CookieStore cookieStore = new CookieManager().getCookieStore();
        Connection connection = new HttpConnection().cookieStore(cookieStore);
        assertNotNull(connection);
    }

    @Test
    public void getCookieStoreTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.cookieStore());
    }

    @Test
    public void parserTest() {
        Parser parser = Parser.htmlParser();
        Connection connection = new HttpConnection().parser(parser);
        assertNotNull(connection);
    }

    @Test
    public void postDataCharsetTest() {
        Connection connection = new HttpConnection().postDataCharset("UTF-8");
        assertNotNull(connection);
    }

}