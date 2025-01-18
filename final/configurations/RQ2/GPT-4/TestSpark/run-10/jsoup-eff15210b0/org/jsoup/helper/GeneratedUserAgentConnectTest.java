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

public class GeneratedUserAgentConnectTest {

    @Test
    public void userAgentConnectTest() throws IOException {
        String url = "http://example.com";
        String expectedAgent = "Mozilla";
        Connection connection = Jsoup.connect(url).userAgent(expectedAgent);
        String actualAgent = connection.request().header("User-Agent");
        Assert.assertEquals(expectedAgent, actualAgent);
    }

}