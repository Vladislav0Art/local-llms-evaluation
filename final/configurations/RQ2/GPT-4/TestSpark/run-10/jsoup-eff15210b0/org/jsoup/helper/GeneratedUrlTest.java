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

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws MalformedURLException {
        Connection connection = new HttpConnection();
        URL expectedUrl = new URL("http://example.com");
        connection.url(expectedUrl);
        URL actualUrl = connection.request().url();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}