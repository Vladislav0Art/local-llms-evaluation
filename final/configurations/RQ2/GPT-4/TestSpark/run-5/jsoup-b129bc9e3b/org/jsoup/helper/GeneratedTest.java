package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void connectStringUrlTest() {
        Connection connection = HttpConnection.connect("https://www.google.com");
        assertNotNull(connection);
    }

    @Test
    public void connectUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("https://www.google.com"));
        assertNotNull(connection);
    }

    @Test
    public void urlWithStringTest() {
        Connection connection = new HttpConnection().url("https://www.google.com");
        assertNotNull(connection);
    }

    @Test
    public void urlWithUrlTest() throws Exception {
        Connection connection = new HttpConnection().url(new URL("https://www.google.com"));
        assertNotNull(connection);
    }

    @Test
    public void proxyWithHostAndPortTest() {
        Connection connection = new HttpConnection().proxy("localhost", 8080);
        assertNotNull(connection);
    }

    @Test
    public void userAgentTest() {
        String userAgent = "Mozilla/5.0";
        Connection connection = new HttpConnection().userAgent(userAgent);
        assertNotNull(connection);
    }

    @Test
    public void timeoutTest() {
        int timeoutMillis = 30000;
        Connection connection = new HttpConnection().timeout(timeoutMillis);
        assertNotNull(connection);
    }

    @Test
    public void maxBodySizeTest() {
        int bodySizeInBytes = 1048576;
        Connection connection = new HttpConnection().maxBodySize(bodySizeInBytes);
        assertNotNull(connection);
    }

    @Test
    public void followRedirectsTest() {
        Connection connection = new HttpConnection().followRedirects(true);
        assertNotNull(connection);
    }

    @Test
    public void referrerTest() {
        String referrer = "http://www.example.com";
        Connection connection = new HttpConnection().referrer(referrer);
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
    public void dataWithKeyAndValueTest() {
        Connection connection = new HttpConnection().data("key", "value");
        assertNotNull(connection);
    }

    @Test
    public void sslSocketFactoryTest() throws Exception {
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, null, null);
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
        Connection connection = new HttpConnection().sslSocketFactory(sslSocketFactory);
        assertNotNull(connection);
    }

    @Test
    public void dataWithInputStreamTest() {
        InputStream inputStream = new ByteArrayInputStream("test input stream".getBytes(StandardCharsets.UTF_8));
        Connection connection = new HttpConnection().data("key", "filename", inputStream);
        assertNotNull(connection);
    }

    @Test
    public void dataWithMapTest() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("key", "value");
        Connection connection = new HttpConnection().data(dataMap);
        assertNotNull(connection);
    }

    @Test
    public void requestBodyTest() {
        String requestBody = "request body content";
        Connection connection = new HttpConnection().requestBody(requestBody);
        assertNotNull(connection);
    }

    @Test
    public void headerTest() {
        Connection connection = new HttpConnection().header("Content-Type", "application/xml");
        assertNotNull(connection);
    }

    @Test
    public void headersWithMapTest() {
        Map<String, String> headersMap = new HashMap<>();
        headersMap.put("Content-Type", "application/xml");
        Connection connection = new HttpConnection().headers(headersMap);
        assertNotNull(connection);
    }

    @Test
    public void cookieTest() {
        Connection connection = new HttpConnection().cookie("JSESSIONID", "1234567890");
        assertNotNull(connection);
    }

    @Test
    public void cookiesWithMapTest() {
        Map<String, String> cookiesMap = new HashMap<>();
        cookiesMap.put("JSESSIONID", "1234567890");
        Connection connection = new HttpConnection().cookies(cookiesMap);
        assertNotNull(connection);
    }

    @Test
    public void postDataCharsetTest() {
        Connection connection = new HttpConnection().postDataCharset("UTF-8");
        assertNotNull(connection);
    }

}