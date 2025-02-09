package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Connection newRequest = connection.newRequest();
        Assert.assertNotNull(newRequest);
    }

    @Test
    public void urlUrlTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.url(new URL("http://www.example.com"));
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void urlWithInvalidStringTest() {
        HttpConnection connection = new HttpConnection();
        connection.url("www.example.com");
    }

    @Test
    public void proxyTest() {
        Proxy proxyMock = Mockito.mock(Proxy.class);
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.proxy(proxyMock);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.userAgent("Mozilla");
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.timeout(1000);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.maxBodySize(8000);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.followRedirects(true);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.referrer("http://www.google.com");
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void methodTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.method(Connection.Method.GET);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.ignoreHttpErrors(true);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.ignoreContentType(true);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void dataTest() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("key", "value");
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.data(dataMap);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void requestBodyTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.requestBody("body");
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void headerTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.header("name", "value");
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void cookieTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.cookie("name", "value");
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.postDataCharset("UTF-8");
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void cookieStoreTest() {
        CookieStore cookieStoreMock = Mockito.mock(CookieStore.class);
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.cookieStore(cookieStoreMock);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory sslSocketFactoryMock = Mockito.mock(SSLSocketFactory.class);
        HttpConnection connection = new HttpConnection();
        Connection connectionResult = connection.sslSocketFactory(sslSocketFactoryMock);
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void getWithInvalidUrlTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.get();
    }

    @Test
    public void postWithInvalidUrlTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.post();
    }

    @Test
    public void connectWithStringTest() {
        Connection connectionResult = HttpConnection.connect("http://www.example.com");
        Assert.assertNotNull(connectionResult);
    }

    @Test
    public void connectWithInvalidUrlTest() {
        Connection connectionResult = HttpConnection.connect("www.example.com");
    }

}