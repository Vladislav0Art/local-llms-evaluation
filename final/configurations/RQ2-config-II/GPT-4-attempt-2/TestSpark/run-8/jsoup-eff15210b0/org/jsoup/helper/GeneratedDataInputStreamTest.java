package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataInputStreamTest {

    @Test
    public void dataInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        ByteArrayInputStream inputStream = new ByteArrayInputStream("test-input-stream".getBytes());
        assertEquals(inputStream, connection.data("key", "filename", inputStream).request()
                .data().get("key").inputStream());
    }

}