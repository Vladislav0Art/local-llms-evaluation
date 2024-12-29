package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://www.google.com");
        Assert.assertNotNull(connection);
    }

}