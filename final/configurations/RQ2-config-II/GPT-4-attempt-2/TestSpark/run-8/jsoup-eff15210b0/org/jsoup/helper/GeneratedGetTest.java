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

public class GeneratedGetTest {

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        Document doc = connection.get();
        assertNotNull(doc);
    }

}