package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        String filename = "test.txt";
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        String contentType = "text/plain";
        HttpConnection connection = new HttpConnection();
        connection.data("key", filename, inputStream, contentType);
        Connection.KeyVal kv = connection.request().data().get(0);
        assertEquals("key", kv.key());
        assertEquals(filename, kv.value());
        assertEquals(inputStream, kv.inputStream());
        assertEquals(contentType, kv.contentType());
    }

}