package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() {
        String url = "http://example.com";
        HttpConnection httpConnection = new HttpConnection();
        Connection connectionResult = httpConnection.url(url);
        Assert.assertNotNull(connectionResult);
    }

}