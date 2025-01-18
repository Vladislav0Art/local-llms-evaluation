package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataStreamTest {

    @Test
    public void dataStreamTest() {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://www.google.com");
        ByteArrayInputStream inputStream = new ByteArrayInputStream("test".getBytes());
        connection.data("key", "test.txt", inputStream);
        Assert.assertTrue(connection.request().data().stream().anyMatch(k -> k.key().equals("key") && k.value().equals("test")));
    }

}