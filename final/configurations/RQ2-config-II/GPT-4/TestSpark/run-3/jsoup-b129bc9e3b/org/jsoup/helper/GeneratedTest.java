package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectUrlTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.newRequest();
        assertNotNull(newConnection);
    }

    @Test
    public void urlUrlTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.url(new URL("http://example.com"));
    }

    @Test
    public void urlStringTest() {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com");
    }

    @Test
    public void proxyProxyTest() {
        HttpConnection connection = new HttpConnection();
        connection.proxy(Proxy.NO_PROXY);
    }

    @Test
    public void proxyHostPortTest() {
        HttpConnection connection = new HttpConnection();
        connection.proxy("localhost", 8080);
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Mozilla/5.0");
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(5000);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(1024);
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        connection.followRedirects(true);
    }

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        connection.referrer("http://google.com");
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreHttpErrors(true);
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreContentType(true);
    }

    @Test
    public void dataKeyValueTest() {
        HttpConnection connection = new HttpConnection();
        connection.data("key", "value");
    }

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection connection = new HttpConnection();
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        connection.sslSocketFactory(sslSocketFactory);
    }

    @Test
    public void dataInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        InputStream inputStream = InputStream.nullInputStream();
        connection.data("key", "filename", inputStream, "text/plain");
    }

    @Test
    public void dataKeyValTest() {
        HttpConnection connection = new HttpConnection();
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        connection.data(Collections.singleton(keyVal));
    }

    @Test
    public void dataMapTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("key", "value");
        connection.data(dataMap);
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com");
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

    @Test
    public void cookieStoreTest() {
        CookieStore cookieStore = new CookieManager().getCookieStore();
        HttpConnection connection = new HttpConnection();
        connection.cookieStore(cookieStore);
    }

}