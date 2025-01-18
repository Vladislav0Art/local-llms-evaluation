package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void connectStringUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void connectInvalidStringUrlTest() {
        HttpConnection.connect("invalid");
    }

    @Test
    public void connectUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        Assert.assertNotNull(connection);
    }

    @Test
    public void urlTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url("http://example.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.timeout(1000);
        Assert.assertNotNull(connection);
    }

    @Test
    public void methodTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.method(Method.GET);
        Assert.assertNotNull(connection);
    }

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.sslSocketFactory(sslSocketFactory);
        Assert.assertNotNull(connection);
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        Connection.Response response = httpConnection.execute();
        Assert.assertNotNull(response);
    }

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Request request = httpConnection.request();
        Assert.assertNotNull(request);
    }

    @Test
    public void responseTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Response response = httpConnection.response();
        Assert.assertNotNull(response);
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.postDataCharset("UTF-8");
        Assert.assertNotNull(connection);
    }

}