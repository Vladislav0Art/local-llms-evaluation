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

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        Connection connection = new HttpConnection();
        String expectedAgent = "Mozilla";
        connection.userAgent(expectedAgent);
        String actualAgent = connection.request().header("User-Agent");
        Assert.assertEquals(expectedAgent, actualAgent);
    }

}