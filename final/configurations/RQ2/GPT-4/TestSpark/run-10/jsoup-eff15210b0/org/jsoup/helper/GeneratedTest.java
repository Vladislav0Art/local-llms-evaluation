package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void userAgentTest() {
        Connection connection = new HttpConnection();
        String expectedAgent = "Mozilla";
        connection.userAgent(expectedAgent);
        String actualAgent = connection.request().header("User-Agent");
        Assert.assertEquals(expectedAgent, actualAgent);
    }

    @Test
    public void urlTest() throws MalformedURLException {
        Connection connection = new HttpConnection();
        URL expectedUrl = new URL("http://example.com");
        connection.url(expectedUrl);
        URL actualUrl = connection.request().url();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void proxyTest() throws MalformedURLException {
        Connection connection = new HttpConnection();
        connection.url("http://testurl.com");
        connection.proxy("localhost", 8000);
        Assert.assertNotNull(connection.request().proxy());
    }

    @Test
    public void connectInvalidUrlTest() {
        String url = "example";
        Connection connection = HttpConnection.connect(url);
    }

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory socketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Connection connection = new HttpConnection();
        connection.sslSocketFactory(socketFactory);
        SSLSocketFactory actualSocketFactory = connection.request().sslSocketFactory();
        Assert.assertEquals(socketFactory, actualSocketFactory);
    }

    @Test
    public void dataTest() {
        Connection connection = new HttpConnection();
        String key = "key";
        String value = "value";
        connection.data(key, value);
        String actualKey = null;
        String actualValue = null;

        for (Connection.KeyVal kv : connection.request().data()) {
            if (kv.key().equals(key)) {
                actualKey = kv.key();
                actualValue = kv.value();
                break;
            }
        }
        Assert.assertEquals(key, actualKey);
        Assert.assertEquals(value, actualValue);
    }

    @Test
    public void userAgentConnectTest() throws IOException {
        String url = "http://example.com";
        String expectedAgent = "Mozilla";
        Connection connection = Jsoup.connect(url).userAgent(expectedAgent);
        String actualAgent = connection.request().header("User-Agent");
        Assert.assertEquals(expectedAgent, actualAgent);
    }

    @Test
    public void postTest() throws IOException {
        String url = "http://example.com";
        Connection connection = Jsoup.connect(url);
        connection.post();
        Assert.assertEquals(Connection.Method.POST, connection.request().method());
    }

    @Test
    public void getTest() throws IOException {
        String url = "http://example.com";
        Connection connection = Jsoup.connect(url);
        connection.get();
        Assert.assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void responseErrorTest() throws IOException {
        String url = "http://nonexistent.com";
        Connection connection = Jsoup.connect(url);
        connection.execute();
    }

}