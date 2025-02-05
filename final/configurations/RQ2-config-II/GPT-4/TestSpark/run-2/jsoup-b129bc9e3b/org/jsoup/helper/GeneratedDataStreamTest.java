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

public class GeneratedDataStreamTest {

    @Test
    public void dataStreamTest() throws IOException {
        Connection connection = HttpConnection.connect("https://www.example.com");
        ByteArrayInputStream stream = new ByteArrayInputStream("Test".getBytes());
        connection.data("Key", "File", stream);
        Assert.assertEquals(1, connection.request().data().size());
    }

}