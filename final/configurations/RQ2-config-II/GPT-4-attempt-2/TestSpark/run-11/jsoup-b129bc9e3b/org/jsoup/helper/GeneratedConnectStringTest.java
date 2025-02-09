package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() {
        String url = "https://dummywebsite.com";
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

}