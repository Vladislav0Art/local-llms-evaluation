package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectNullUrlExceptionTest() {
        HttpConnection.connect((String) null);
    }

    @Test
    public void connectValidUrlTest() {
        Connection response = HttpConnection.connect("http://www.google.com");
        Assert.assertNotNull(response);
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.newRequest();
        Assert.assertNotNull(connection);
    }

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = Mockito.mock(Proxy.class);
        Connection connection = httpConnection.proxy(proxy);
        Assert.assertNotNull(connection);
    }

    @Test
    public void cookieStoreTest() {
        HttpConnection httpConnection = new HttpConnection();
        CookieStore cookieStore = Mockito.mock(CookieStore.class);
        Connection connection = httpConnection.cookieStore(cookieStore);
        Assert.assertNotNull(connection);
    }

    @Test
    public void dataNullKeyExceptionTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data(null, "value");
    }

    @Test
    public void dataValidKeyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.data("key", "value");
        Assert.assertNotNull(connection);
    }

    @Test
    public void getValidUrlTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://www.google.com");
        Document doc = httpConnection.get();
        Assert.assertNotNull(doc);
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://www.google.com");
        Connection.Response response = httpConnection.execute();
        Assert.assertNotNull(response);
    }

}