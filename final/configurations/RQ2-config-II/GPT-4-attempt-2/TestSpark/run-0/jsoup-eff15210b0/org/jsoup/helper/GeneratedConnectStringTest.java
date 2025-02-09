package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

}