package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectStringTest() throws Exception {
        Connection connection = HttpConnection.connect("http://example.com");
        Assert.assertEquals("http://example.com", connection.request().url().toString());
    }

    @Test
    public void connectURLTest() throws Exception {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertEquals(url, connection.request().url());
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.newRequest();
        Assert.assertNotNull(connection);
    }

    @Test
    public void urlWithValidStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        Assert.assertEquals("http://example.com", httpConnection.request().url().toString());
    }

    @Test
    public void validProxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy mockProxy = Mockito.mock(Proxy.class);
        httpConnection.proxy(mockProxy);
        Assert.assertEquals(mockProxy, httpConnection.request().proxy());
    }

    @Test
    public void nullProxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.proxy(null);
    }

    @Test
    public void dataCollectionTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        httpConnection.data(Collections.singletonList(keyVal));
        Assert.assertTrue(httpConnection.request().data().contains(keyVal));
    }

    @Test
    public void cookieStoreTest() {
        HttpConnection connection = new HttpConnection();
        CookieStore cookieStore = new CookieManager().getCookieStore();
        cookieStore.add(null, new HttpCookie("name", "value"));
        connection.cookieStore(cookieStore);
        Assert.assertEquals("value", connection.request().cookie("name"));
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.postDataCharset("UTF-8");
        Assert.assertEquals("UTF-8", httpConnection.request().postDataCharset());
    }

}