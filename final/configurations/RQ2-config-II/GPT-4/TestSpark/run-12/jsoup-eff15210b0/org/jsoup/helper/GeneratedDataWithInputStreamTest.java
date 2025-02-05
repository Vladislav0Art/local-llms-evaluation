package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDataWithInputStreamTest {

    @Test
    public void dataWithInputStreamTest() {
        InputStream inputStream = new ByteArrayInputStream("test input stream".getBytes());
        Connection connection = HttpConnection.connect("http://example.com").data("key", "filename", inputStream);
        assertEquals("filename", connection.request().data().get(0).value());
        assertEquals("key", connection.request().data().get(0).key());
    }

}