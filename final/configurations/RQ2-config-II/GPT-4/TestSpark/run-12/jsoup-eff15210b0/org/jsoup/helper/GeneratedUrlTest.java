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

public class GeneratedUrlTest {

    @Test
    public void urlTest() {
        Connection connection = HttpConnection.connect("http://example.com").url("http://changed.com");
        assertEquals("http://changed.com", connection.request().url().toString());
    }

}