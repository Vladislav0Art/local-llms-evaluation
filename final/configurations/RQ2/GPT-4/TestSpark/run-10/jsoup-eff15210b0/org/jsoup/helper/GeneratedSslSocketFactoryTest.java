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

public class GeneratedSslSocketFactoryTest {

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory socketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Connection connection = new HttpConnection();
        connection.sslSocketFactory(socketFactory);
        SSLSocketFactory actualSocketFactory = connection.request().sslSocketFactory();
        Assert.assertEquals(socketFactory, actualSocketFactory);
    }

}