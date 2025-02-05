package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        Connection connection = HttpConnection.connect("https://www.example.com");
        Connection.Response response = connection.execute();
        Assert.assertEquals(200, response.statusCode());
    }

}