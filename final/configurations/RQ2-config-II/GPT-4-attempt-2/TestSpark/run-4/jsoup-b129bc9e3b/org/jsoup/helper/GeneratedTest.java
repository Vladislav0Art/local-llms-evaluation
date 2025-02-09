package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void connectWithStringUrlTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect("https://www.google.com");
        Assert.assertEquals(new URL("https://www.google.com"), connection.request().url());
    }

    @Test
    public void connectWithURLTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertEquals(url, connection.request().url());
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Assert.assertNotNull(httpConnection.newRequest());
    }

    @Test
    public void urlWithUrlParameterTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        Assert.assertEquals(url, httpConnection.request().url());
    }

    @Test
    public void urlWithStringParameterTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("https://www.google.com");
        Assert.assertEquals("https://www.google.com", httpConnection.request().url().toString());
    }

    @Test
    public void getTest() throws IOException {
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value", inputStream, "text/plain");
        httpConnection.userAgent("Mozilla");
        Document document = httpConnection.get();
        Assert.assertNotNull(document);
    }

    @Test
    public void executeTest() throws IOException {
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value", inputStream, "text/plain");
        httpConnection.userAgent("Mozilla");
        Connection.Response response = httpConnection.execute();
        Assert.assertNotNull(response);
    }

    @Test
    public void requestTest() {
        HttpConnection connection = new HttpConnection();
        Assert.assertNotNull(connection.request());
    }

    @Test
    public void requestWithParameterTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Request request = new HttpConnection().request();
        httpConnection.request(request);
        Assert.assertSame(request, httpConnection.request());
    }

    @Test
    public void responseTest() {
        HttpConnection connection = new HttpConnection();
        Assert.assertNull(connection.response());
    }

    @Test
    public void responseWithParameterTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Response response = Mockito.mock(Connection.Response.class);
        httpConnection.response(response);
        Assert.assertEquals(response, httpConnection.response());
    }

    @Test
    public void postDataCharsetTest() {
        String charset = "UTF-8";
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.postDataCharset(charset);
        Assert.assertEquals(charset, ((HttpConnection) connection).request().postDataCharset());
    }

    @Test
    public void cookieStoreTest() {
        HttpConnection httpConnection = new HttpConnection();
        CookieStore cookieStore = Mockito.mock(CookieStore.class);
        httpConnection.cookieStore(cookieStore);
        Assert.assertEquals(cookieStore, httpConnection.cookieStore());
    }

    @Test
    public void cookiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.cookies(Collections.singletonMap("cookieName", "cookieValue"));
        Assert.assertNotNull(httpConnection.request().cookies());
        Assert.assertTrue(httpConnection.request().cookies().containsKey("cookieName"));
    }

}