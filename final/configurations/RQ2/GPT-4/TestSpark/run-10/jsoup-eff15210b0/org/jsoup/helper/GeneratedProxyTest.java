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

public class GeneratedProxyTest {

    @Test
    public void proxyTest() throws MalformedURLException {
        Connection connection = new HttpConnection();
        connection.url("http://testurl.com");
        connection.proxy("localhost", 8000);
        Assert.assertNotNull(connection.request().proxy());
    }

}